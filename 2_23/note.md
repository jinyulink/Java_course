# �e��
�Ĥ@�������ҷ|�������ܼ�

* class �w�qjava �{�������n����r�A�@��ӻ� class �R�W�Ĥ@�Ӧr�|���j�g
* public ����

# �{���X
* java�{���@�w�nmain method

Declare a main method:
```java
public static void main(String[] args){}
```
* void ��ܥ��禡���|�^�ǥ����
```java
System.out.println("Hello World");
```
* System�j�g�Y�O�]���L�Oclass���W��

## print�T�ؼg�k
1. System.out.println("Hello World");
2. System.out.print("Hello World");
3. System.out.printf("Hello World");

### printf()
�榡�ƦC�L
```java
System.out.printf("%s %s %s", "Hello ", "World ", "!");
```
```bash
>> Hello World !
``` 
* Placeholder: %s string / %d integer / %f float, double (%1.f �u�L�X�p�ƫ�@��)/ %n=/n

## comments
```java
//
```
```java
/* */
```
## Important rules
1. Case sensitive
2. Every command need to split by ';'
3. �{�����c�y���h���Y

## Compile and execute Java programs
1. Complie a source code
```bash
javac name.java
```
2. Execute the program
```bash
java name
```
* JVM(Java Virtual Machine) translates the .class file into instructions for different OS.

![](image_2022-02-23_14-28-01.png)

# Q&A
1. ��������? java.exe
2. �sĶ��? javac.exe / javac
3. �{��? test.java
4. ����? java.class
5. Source code? Complier? Bytecode? Interpreter? JVM? �Ҹշ|��

## Escape Sequence Commands
* \n \t \r \\ \" etc.

## ����notepad�s��
�s�ɮɧ�ansi�Y�i

## ��Ƭۥ[
```java
import java.util.Scanner;
public class Addition{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); //create a Scanner object to obtain from the command window
        int n1,n2,sum;
        System.out.print("Enter first integer: ");
        n1=input.nextInt();
        System.out.print("Enter Second Integer: ");
        n2=input.nextInt();
        sum=n1+n2;
        System.out.printf("The sum of %d and %d is %d",n1,n2,sum);
    }
}
```
1. nextInt Ū�����
2. nextLine Ū���r��
3. nextDouble Ū���B�I��

## Java�ܼƫ��A
�����(�Ҹշ|��):
* �򥻸�ƫ��A(primitive data type, PDT)
    1. boolean
    2. short < int < long
    3. float < double
    4. char 0~65535
    5. byte -128~127
* ���󫬺A(object type, ODT)
    6. String �r�ꫬ�A (Java �r��D ODT !!!)

## ��N�B��
**=** �O **���w�B��l(Assignment Operator)** , �ӫD�ƾǪ����� �|��!

## Arithmetic operators ��N�B��l
�[ / �� / �� / �� / �l��

