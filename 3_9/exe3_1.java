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
