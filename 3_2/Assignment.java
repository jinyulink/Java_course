import java.util.Scanner;
public class Assignment {
    public static void main(String[] args){
        System.out.println("�벼�H��: ");
        Scanner input = new Scanner(System.in);
        int people = input.nextInt();
        int t=5,choice=1;
        float c1=0,c2=0,c3=0;
        while(people>0){
            System.out.println("����̳��w���x�W�p�Y: (1)�䨧�G (2)�H���� (3)�����C�п��:");
            choice=input.nextInt();
            switch(choice)
            {
                case 1:
                    c1++;
                    break;
                case 2:
                    c2++;
                    break;
                case 3:
                    c3++;
                    break;
                case -1:
                    people=0;
            }
            people--;
        }

        if((c1+c2+c3)==0)   System.out.println("�L�벼���G");
        else{
            System.out.println("���ﵲ�G:");
            System.out.printf("(1)�䨧�G: %.1f �o���v: %.2f%%\n",c1,c1/(c1+c2+c3)*100);
            System.out.printf("(2)�H����: %.1f �o���v: %.2f%%\n",c2,c2/(c1+c2+c3)*100);
            System.out.printf("(1)����: %.1f �o���v: %.2f%%\n",c3,c3/(c1+c2+c3)*100);
        }
        if((c1+c2+c3)==0||c1==c2||c1==c3||c2==c3)   System.out.println("�q��");
        else if(c1>c2&&c1>c3)   System.out.println("�̰�����̬O�䨧�G");
        else if(c2>c1&&c2>c3)   System.out.println("�̰�����̬O�H����");
        else if(c3>c1&&c3>c2)   System.out.println("�̰�����̬O����");
    }
}
