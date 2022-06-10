import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;

public class Admin extends User{
	private static ArrayList<Admin> adlist = new ArrayList<Admin>();
	public static ArrayList<Admin> getAdlist() {return adlist;}
	public static void addAdmin(Admin a) {adlist.add(a);}
	public Admin(String name,String account,String password){
        super(name,account,password);
        this.operations = new IOperation[]{
        new ExitOperation(), //0退出系統
        new FindOperation(),
        new AddOperation(),
        new ReviseOperation(),
        new DelOperation(),
        new DisplayOperation(),
        new LogoutOperation()
        };
    }


    public int menu() {

        ImageIcon icon = new ImageIcon("icon.png"); //jin
        Image image = icon.getImage(); //jin
        Image img = image.getScaledInstance(100,100,Image.SCALE_DEFAULT); //jin
        icon= new ImageIcon(img); //jin
        String[] option = {"","查詢圖書","新增圖書","修改圖書","刪除圖書","顯示所有圖書","帳號登出"};
        String welcome = "hello " + getName() + " 熱誠歡迎使用本校圖書館管理系統！請選擇操作";
        JComboBox comboBox = new JComboBox(option);
        JLabel label = new JLabel(welcome);
        label.setFont(new Font("MV Boil",Font.BOLD,15));
        Object[] fields = {
            label,comboBox
        };
        int number = JOptionPane.showConfirmDialog(null,fields,"管理員界面",JOptionPane.DEFAULT_OPTION,0,icon);
        int choice=0;
        if(number==JOptionPane.OK_OPTION){choice=comboBox.getSelectedIndex();} //jin
        else if(number==JOptionPane.CLOSED_OPTION){System.exit(0);} //jin
        


        // System.out.println("管理員選單！");

        // System.out.println("=================================");
        // System.out.println("hello " + getName() + " 熱誠歡迎使用本校圖書館管理系統！");
        // System.out.println("1.查詢圖書");
        // System.out.println("2.新增圖書");
        // System.out.println("3.刪除圖書");
        // System.out.println("4.顯示所有圖書");
        // System.out.println("5.帳號登出");
        // System.out.println("0.退出系統");
        // System.out.println("================================");
        // System.out.println("請按照提示選擇相應操作: ");
        // Scanner sc = new Scanner(System.in);
        // int choice = sc.nextInt();
        return choice;

    }
}
