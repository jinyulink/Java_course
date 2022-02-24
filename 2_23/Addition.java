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