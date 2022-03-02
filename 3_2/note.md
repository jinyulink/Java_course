# Intro to Algorithm
step by step procedure for performing  a job or solve a mathematical problem.
空格: algorithm 
空格: control structure and flow strusture

## Control structure
1. Sequential strusture(由上至下)
2. Selection statements(抉擇/決策)
3. Repetition statements(迴圈loop)

### if 
if the condition us true, then the print action is excuted.
```java
if(grade>=60){
    System.out.println("passed");
}
```

### if...else
當決策需要層層過濾條件的時候，用巢狀迴圈(Nested if...else double selection)

若需要從數個選項擇一時，可以使用if...else if multiple selection

條件運算子: Conditional operator 
condition ? true : false
```java
System.out.print(grade>=60?"passed":"failed");
```

### Repetition statement: while 
Condition()為true時執行action{}，直到Condition()為false時停止執行

Infinite/Forever Loops(無窮迴圈) 

程式設計時無法預知迴圈執行次數

## 
```java
int c=5;
System.out.println(c);
System.out.println(c++); //5 if ++c 則印出6
System.out.println(c); //6
```

## Random
```java
Random rand = new Random();
int point = rand.nextInt(6)+1;
```

## The switch multiple-selection
可使用break;離開整個switch結構

# 學習重點
Three types of control structures
Selection constructs:                                                                  if, if-else, if-else if-else, nested if, switch
Repetition construct: while
Sentinel control vs. counter-control loop
Random number generation
Operators:
Equity & relational operators  ==   !=   >   <   >=   <=
Conditional operator    ? :
Compound assignment operator   +=   -=   *=
Increment/decrement operator   ++   --
(Lecture1) Assignment operator   =
(Lecture1) Arithmetic operators   +   -   *   /   %
(Lecture1) Type-casting operator   ( type )
