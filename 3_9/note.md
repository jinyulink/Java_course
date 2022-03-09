# Review 
## While 迴圈
```java
int counter = 1;
while(counter <= 10) {
    System.out.println(counter);
    ++counter;
}
```
**迴圈 require several variables:**
* control variable (計次器)
* initial value of the control variable
* increment (or decrement) for the cv
* loop-continuation condition (迴圈繼續與否的條件)

## for repetition structure
```java
for(int counter=i;counter<=10;counter++)
    System.out.println(counter);
```

# Math.pow
pow 在 java.lang.Math, 但不用import.
```java
int eight = Math.pow(2,3); //8
```

# exe3_1
**繼續線上測驗題，現改用 for 迴圈來實作程式 (寫一支連續5題九九乘法線上隨機出題測驗程式)
答對4題(含)以上者，呈現：數學資優生
答對少於4題者，呈現：要再加油！**
```java
import java.util.Random;
import java.util.Scanner;
public class exe3_1 {
    public static void main(String[] args){
        int res=0;
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        for(int i=0;i<5;i++){
            int num1 = rand.nextInt(9)+1;
            int num2 = rand.nextInt(9)+1;
            System.out.printf("%d x %d = ?",num1,num2);
            int ans = num1*num2;
            int anss = input.nextInt();
            if(anss==ans)   res++; 
        }
        if(res>=4)  System.out.println("You are a genius!");
        else  System.out.println("You are not a genius!");
    }
}
```

# do...while repetition
Syntax:
```java
do{
    statements.....
}while(continuation condition);
```
Example:
```java
do{
    System.out.println(counter);
    ++counter;
}while(counter<=10);
```

# exe3_2
do while practice

# break vs. continue
* The **break** statement causes immediate exit from a loop (while, for, do..while, switch)
* The **continue** statement skips the remaining statements in the loop body and jump to the next iteration of the loop

# Logical operators 邏輯運算子
* And &&
* Or ||
* Not !
* Xor ^

## Short-circuit(短路) evaluation 
並非所有條件都通過

# Nested Loops
* The body of a loop (called **outer loop 外迴圈**) can contain another loop (called **inner loop 內迴圈**)
印三角形:
```java
public class triangle {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
```
```
*
**
***
****
*****
```

# Java GUI programming: 圖像化互動程式運作
* 若要用圖像化互動，可利用Java API的JOptionPane class
* JOptionPane是屬於哪一個套件? **javax.swing**

# 考前整理
1. Random -> nextInt() (**Random要先宣告**)
```java
import java.util Random;

Random r = new Random();
```
2. Scanner (**Scanner要先宣告**)
* nextInt()
* nextDouble()
* nextLine()
* hasNext()
```java
import java.util.Scanner;

Scanner s = new Scanner();
```

3. JOptionPane
* showInputDailog() (有考的話 只考前兩個)
* showMessageDialog()
* showOptionDialog()
* showConfirmDialog()

4. Double -> parseDouble()

5. Integer -> parseInt()