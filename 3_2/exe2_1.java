import java.util.Scanner;
public class exe2_1{
    public static void main(String[] args){
        System.out.println("貴姓大名: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("票選最喜歡的台灣小吃: (1)臭豆腐 (2)蚵阿煎 (3)滷味。請選擇:");
        int choice = input.nextInt();
        if(choice == 1) System.out.printf("%s選臭豆腐",name);
        else if(choice == 2) System.out.printf("%s 選蚵阿煎",name);
        else if(choice == 3) System.out.printf("%s 選滷味",name);
    }
}
