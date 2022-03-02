import java.util.Scanner;
public class exe2_2{
    public static void main(String[] args){
        System.out.println("貴姓大名: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        int t=5;
        float c1=0,c2=0,c3=0;
        while(t>0){
            System.out.println("票選最喜歡的台灣小吃: (1)臭豆腐 (2)蚵阿煎 (3)滷味。請選擇:");
            int choice = input.nextInt();
            if(choice==1)   c1++;
            else if(choice==2) c2++;
            else if(choice==3) c3++;
            t--;
        }
        System.out.println("票選結果:");
        System.out.printf("(1)臭豆腐: %f 得票率: %f%%\n",c1,c1/(c1+c2+c3)*100);
        System.out.printf("(2)蚵阿煎: %f 得票率: %f%%\n",c2,c2/(c1+c2+c3)*100);
        System.out.printf("(1)滷味: %f 得票率: %f%%\n",c3,c3/(c1+c2+c3)*100);
    }
}
