import java.util.Scanner;
public class Assignment{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        double h,w;
        double bmi;
        System.out.print("輸入身高(公分整數): ");
        h=input.nextDouble()/100;
        System.out.print("輸入體重(公斤整數): ");
        w=input.nextDouble();
        bmi=w/(h*h);
        System.out.printf("你的BMI為: %.1f",bmi);
    }
}