import java.util.Scanner;
public class Assignment{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        double h,w;
        double bmi;
        System.out.print("��J����(�������): ");
        h=input.nextDouble()/100;
        System.out.print("��J�魫(������): ");
        w=input.nextDouble();
        bmi=w/(h*h);
        System.out.printf("�A��BMI��: %.1f",bmi);
    }
}