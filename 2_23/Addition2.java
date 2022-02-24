import java.util.Scanner;
public class Addition2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); //create a Scanner object to obtain from the command window
        double n1,n2,sum;
        System.out.print("Enter first integer: ");
        n1=input.nextDouble();
        System.out.print("Enter Second Integer: ");
        n2=input.nextDouble();
        sum=n1+n2;
        System.out.printf("The sum of %f and %f is %f",n1,n2,sum);
    }
}