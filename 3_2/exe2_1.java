import java.util.Scanner;
public class exe2_1{
    public static void main(String[] args){
        System.out.println("�Q�m�j�W: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("����̳��w���x�W�p�Y: (1)�䨧�G (2)�H���� (3)�����C�п��:");
        int choice = input.nextInt();
        if(choice == 1) System.out.printf("%s��䨧�G",name);
        else if(choice == 2) System.out.printf("%s ��H����",name);
        else if(choice == 3) System.out.printf("%s �ﺱ��",name);
    }
}
