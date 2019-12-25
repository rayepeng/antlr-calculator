package compile;

import org.antlr.v4.runtime.misc.NotNull;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EvalVisitor extends compileBaseVisitor<Value>{

    // used to compare floating point numbers
    public static final double SMALL_VALUE = 0.00000000001;

    // store variables (there's only one global scope!)
    private Map<String, Value> memory = new HashMap<String, Value>();

    // assignment/id overrides
    @Override
    public Value visitAssignment(compileParser.AssignmentContext ctx) {
        String id = ctx.ID().getText();
        Value value = this.visit(ctx.expr());
        boolean flag = memory.containsKey(id);
        // System.out.println(id);
        // for (String key : memory.keySet()) {
        //   System.out.println("Key = " + key);
        // }
        // System.out.println(flag);
        if(flag){
            return memory.put(id,value);
        }else{
            throw new RuntimeException("no such variable: " + id);
        }
        // return memory.put(id, value);
    }

    @Override
    public Value visitIdAtom(compileParser.IdAtomContext ctx) {
        String id = ctx.getText();
        Value value = memory.get(id);
        if(value == null) {
            throw new RuntimeException("no such variable: " + id);
        }
        return value;
    }
    //in short time i don't know how to differ INT of FLOAT
    @Override
    public Value visitDefine_stat(compileParser.Define_statContext ctx){
        String id = ctx.ID().getText();
        // System.out.println("Defination!");
        // System.out.println(id);
        Value value = new Value(null); // so we set it null
        memory.put(id,value);
        return new Value(null);
    }
    // atom overrides
    @Override
    public Value visitStringAtom(compileParser.StringAtomContext ctx) {
        String str = ctx.getText();
        // strip quotes
        str = str.substring(1, str.length() - 1).replace("\"\"", "\"");
        return new Value(str);
    }

    @Override
    public Value visitNumberAtom(compileParser.NumberAtomContext ctx) {
        return new Value(Double.valueOf(ctx.getText()));
    }

    @Override
    public Value visitBooleanAtom(compileParser.BooleanAtomContext ctx) {
        return new Value(Boolean.valueOf(ctx.getText()));
    }

    @Override
    public Value visitNilAtom(compileParser.NilAtomContext ctx) {
        return new Value(null);
    }

    // expr overrides
    @Override
    public Value visitParExpr(compileParser.ParExprContext ctx) {
        return this.visit(ctx.expr());
    }

    @Override
    public Value visitPowExpr(compileParser.PowExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        return new Value(Math.pow(left.asDouble(), right.asDouble()));
    }

    @Override
    public Value visitUnaryMinusExpr(compileParser.UnaryMinusExprContext ctx) {
        Value value = this.visit(ctx.expr());
        return new Value(-value.asDouble());
    }

    @Override
    public Value visitNotExpr(compileParser.NotExprContext ctx) {
        Value value = this.visit(ctx.expr());
        return new Value(!value.asBoolean());
    }

    @Override
    public Value visitMultiplicationExpr(@NotNull compileParser.MultiplicationExprContext ctx) {

        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case compileParser.MULT:
                return new Value(left.asDouble() * right.asDouble());
            case compileParser.DIV:
                return new Value(left.asDouble() / right.asDouble());
            case compileParser.MOD:
                return new Value(left.asDouble() % right.asDouble());
            default:
                throw new RuntimeException("unknown operator: " + compileParser.tokenNames[ctx.op.getType()]);
        }
    }

    @Override
    public Value visitAdditiveExpr(@NotNull compileParser.AdditiveExprContext ctx) {

        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case compileParser.PLUS:
                return left.isDouble() && right.isDouble() ?
                        new Value(left.asDouble() + right.asDouble()) :
                        new Value(left.asString() + right.asString());
            case compileParser.MINUS:
                return new Value(left.asDouble() - right.asDouble());
            default:
                throw new RuntimeException("unknown operator: " + compileParser.tokenNames[ctx.op.getType()]);
        }
    }

    @Override
    public Value visitRelationalExpr(@NotNull compileParser.RelationalExprContext ctx) {

        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case compileParser.LT:
                return new Value(left.asDouble() < right.asDouble());
            case compileParser.LTEQ:
                return new Value(left.asDouble() <= right.asDouble());
            case compileParser.GT:
                return new Value(left.asDouble() > right.asDouble());
            case compileParser.GTEQ:
                return new Value(left.asDouble() >= right.asDouble());
            default:
                throw new RuntimeException("unknown operator: " + compileParser.tokenNames[ctx.op.getType()]);
        }
    }

    @Override
    public Value visitEqualityExpr(@NotNull compileParser.EqualityExprContext ctx) {

        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case compileParser.EQ:
                return left.isDouble() && right.isDouble() ?
                        new Value(Math.abs(left.asDouble() - right.asDouble()) < SMALL_VALUE) :
                        new Value(left.equals(right));
            case compileParser.NEQ:
                return left.isDouble() && right.isDouble() ?
                        new Value(Math.abs(left.asDouble() - right.asDouble()) >= SMALL_VALUE) :
                        new Value(!left.equals(right));
            default:
                throw new RuntimeException("unknown operator: " + compileParser.tokenNames[ctx.op.getType()]);
        }
    }

    @Override
    public Value visitAndExpr(compileParser.AndExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        return new Value(left.asBoolean() && right.asBoolean());
    }

    @Override
    public Value visitOrExpr(compileParser.OrExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        return new Value(left.asBoolean() || right.asBoolean());
    }

    // log override
    @Override
    public Value visitLog(compileParser.LogContext ctx) {
        Value value = this.visit(ctx.expr());
        System.out.println(value);
        return value;
    }

    @Override
    public Value visitWriteEnd(compileParser.WriteEndContext ctx){
        Value value = this.visit(ctx.expr());
        System.out.println(value);
        return value;
    }

    // if override
    @Override
    public Value visitIf_stat(compileParser.If_statContext ctx) {

        List<compileParser.Condition_blockContext> conditions =  ctx.condition_block();

        boolean evaluatedBlock = false;

        for(compileParser.Condition_blockContext condition : conditions) {

            Value evaluated = this.visit(condition.expr());

            if(evaluated.asBoolean()) {
                evaluatedBlock = true;
                // evaluate this block whose expr==true
                this.visit(condition.stat_block());
                break;
            }
        }

        if(!evaluatedBlock && ctx.stat_block() != null) {
            // evaluate the else-stat_block (if present == not null)
            this.visit(ctx.stat_block());
        }

        return Value.VOID;
    }

    // while override
    @Override
    public Value visitWhile_stat(compileParser.While_statContext ctx) {

        Value value = this.visit(ctx.expr());

        while(value.asBoolean()) {

            // evaluate the code block
            this.visit(ctx.stat_block());

            // evaluate the expression
            value = this.visit(ctx.expr());
        }

        return Value.VOID;
    }
}
