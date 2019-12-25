# calculator

## 运行项目

`mvn clean install`

然后
`mvn exec:java`

即可运行

项目测试用例位于 `/src/main/compile/` 文件夹下

项目入口文件是 `/src/main/java/compile/Main.java`


## 基本思路

添加if-else语句

`if` 后面跟条件语句，然后可能有 `if-else` ，最后是 `else` 结尾

```
if_stat
 : IF condition_block (ELSE IF condition_block)* (ELSE stat_block)?
 ;
```

while语句的添加与之类似

```
while_stat
 : WHILE expr stat_block
 ;
```

