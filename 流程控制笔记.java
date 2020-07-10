程序的流程控制：
{
    1:顺序执行；{
        代码从主函数开始一直执行到代码结束
        
        代码：ShunXuTest.java
    }
    
    
    2：选择执行；(if语句与switch语句，三元运算符)『代码执行过程中会有一些条件，判断，就会执行符合条件的语句』
    [1] （1）if语句基本语法：if（表达式）{语句}; 注意：表达式的类型必须是boolean的
    代码：IfTest.java
          
    （2）if ，else语句：（放在if后面的只能是一个逻辑表达式）
    {
    基本语法：
    if（布尔表达式）
    {
        语句块；
    }
    if（条件为真）
    {
        语句或块；
    }else{
        语句或块
    }
    }
    
   注意：使用if....else语句的时候一定要先处理包含范围更小的情况
    代码：IfElseTest.java
    
    [2]switch语句：
    基本语法：
    switch （变量名）
    {
        case 值1：
        执行语句；
        break；
        
        case 值2：
        执行语句；
        break；
        
        case 值3：
        执行语句；
        break；
        .........
    }
   代码：SwitchTest.java
    
    
    
    3：循环执行(for循环)；
    循环就是让一段代码，执行多次
    例子：for（基本表达式；boolean类型的表达式；改变表达式的值）
    代码：ForTest.java
    
        （1）while循环代码：（如果条件第一次不满足，程序将不会执行）
        示例：while（条件表达式）     注意：while后面千万不要加上“；”
                    {语句代码}；
        代码：whileTest.java   

       （2） do -- while循环：（先执行一次循环体，在计算表达式的值）
       注意：do while循环的循环条件后必须有一个分号；这个分号表示循环结束
        实例：
        do{
            语句序列
        }
        
        while（条件表达式）；注意：while后面一定要加上“；”；
        代码：DoWhileTest.java
        
        
    4：跳转语句：
        （1）break语句：在switch中表示一个case的结束，退出switch；
                         在循环控制语句中表示退出循环。   
        break不仅能结束其所在的循环还能结束其之外的循环，需要在外面的循环前加上（标签：）例如：oute：；结束语句就加上标签就行；
        （2）continue语句：循环控制语句，起到中断循环的作用，与break不同的是，continue只是中断当前循环，执行下一次循环。

        （3）return语句：用于函数或方法的返回值   
}
