# Intro to Algorithm
step by step procedure for performing  a job or solve a mathematical problem.
�Ů�: algorithm 
�Ů�: control structure and flow strusture

## Control structure
1. Sequential strusture(�ѤW�ܤU)
2. Selection statements(���/�M��)
3. Repetition statements(�j��loop)

### if 
if the condition us true, then the print action is excuted.
```java
if(grade>=60){
    System.out.println("passed");
}
```

### if...else
��M���ݭn�h�h�L�o���󪺮ɭԡA�α_���j��(Nested if...else double selection)

�Y�ݭn�q�ƭӿﶵ�ܤ@�ɡA�i�H�ϥ�if...else if multiple selection

����B��l: Conditional operator 
condition ? true : false
```java
System.out.print(grade>=60?"passed":"failed");
```

### Repetition statement: while 
Condition()��true�ɰ���action{}�A����Condition()��false�ɰ������

Infinite/Forever Loops(�L�a�j��) 

�{���]�p�ɵL�k�w���j����榸��

## 
```java
int c=5;
System.out.println(c);
System.out.println(c++); //5 if ++c �h�L�X6
System.out.println(c); //6
```

## Random
```java
Random rand = new Random();
int point = rand.nextInt(6)+1;
```

## The switch multiple-selection
�i�ϥ�break;���}���switch���c

# �ǲ߭��I
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
