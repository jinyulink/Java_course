import java.util.Scanner;
public class exe2_2{
    public static void main(String[] args){
        System.out.println("�Q�m�j�W: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        int t=5;
        float c1=0,c2=0,c3=0;
        while(t>0){
            System.out.println("����̳��w���x�W�p�Y: (1)�䨧�G (2)�H���� (3)�����C�п��:");
            int choice = input.nextInt();
            if(choice==1)   c1++;
            else if(choice==2) c2++;
            else if(choice==3) c3++;
            t--;
        }
        System.out.println("���ﵲ�G:");
        System.out.printf("(1)�䨧�G: %f �o���v: %f%%\n",c1,c1/(c1+c2+c3)*100);
        System.out.printf("(2)�H����: %f �o���v: %f%%\n",c2,c2/(c1+c2+c3)*100);
        System.out.printf("(1)����: %f �o���v: %f%%\n",c3,c3/(c1+c2+c3)*100);
    }
}
