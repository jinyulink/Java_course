import java.util.Scanner;
public class Assignment {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=1;j<=a;j++){
                if(i==1||i==a)  System.out.print("¤u");
                else    System.out.print(j==(a/2+1) ? "¤u" : "  ");
            }
            System.out.println();
        }
    }
}
