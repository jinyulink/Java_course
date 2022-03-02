import java.util.Scanner;
public class Assignment {
    public static void main(String[] args){
        System.out.println("投票人數: ");
        Scanner input = new Scanner(System.in);
        int people = input.nextInt();
        int t=5,choice=1;
        float c1=0,c2=0,c3=0;
        while(people>0){
            System.out.println("票選最喜歡的台灣小吃: (1)臭豆腐 (2)蚵阿煎 (3)滷味。請選擇:");
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

        if((c1+c2+c3)==0)   System.out.println("無投票結果");
        else{
            System.out.println("票選結果:");
            System.out.printf("(1)臭豆腐: %.1f 得票率: %.2f%%\n",c1,c1/(c1+c2+c3)*100);
            System.out.printf("(2)蚵阿煎: %.1f 得票率: %.2f%%\n",c2,c2/(c1+c2+c3)*100);
            System.out.printf("(1)滷味: %.1f 得票率: %.2f%%\n",c3,c3/(c1+c2+c3)*100);
        }
        if((c1+c2+c3)==0||c1==c2||c1==c3||c2==c3)   System.out.println("從缺");
        else if(c1>c2&&c1>c3)   System.out.println("最高票選者是臭豆腐");
        else if(c2>c1&&c2>c3)   System.out.println("最高票選者是蚵阿煎");
        else if(c3>c1&&c3>c2)   System.out.println("最高票選者是滷味");
    }
}
