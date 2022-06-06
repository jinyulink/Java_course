import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;


public abstract class Member extends User {
	private static ArrayList<Student> stlist = new ArrayList<Student>();
	private static ArrayList<Teacher> telist = new ArrayList<Teacher>();
	private static ArrayList<Staff> stalist = new ArrayList<Staff>();
	
	public static ArrayList<Student> getStlist() {return stlist;}
	public static ArrayList<Teacher> getTelist() {return telist;}
	public static ArrayList<Staff> getStalist() {return stalist;}
	
	public static void addStudent(Student s) {stlist.add(s);}
	public static void addTeacher(Teacher t) {telist.add(t);}
	public static void addStaff(Staff st) {stalist.add(st);}
	public void addRecord(Record r) {
	}
	
	public Member(String name,String account,String password){
        super(name,account,password);
        
        this.operations = new IOperation[]{
                new ExitOperation(), //0退出系統
                new FindOperation(),
                new BorrowOperation(),
                new ReturnOperation(),
                new RecordOperation(),
                // new Rank(),
                new LogoutOperation()
        };
    }

    //重寫父類User的menu方法
    @Override
    public int menu() {

        ImageIcon icon = new ImageIcon("icon.png"); //jin
        Image image = icon.getImage(); //jin
        Image img = image.getScaledInstance(100,100,Image.SCALE_DEFAULT); //jin
        icon= new ImageIcon(img); //jin
        String[] option = {"","查詢圖書","借閱圖書","歸還圖書","查看紀錄","帳號登出"}; //,"排行榜"
        String welcome = "hello " + getName() + " 熱誠歡迎使用本校圖書館管理系統！請選擇操作";
        JComboBox comboBox = new JComboBox(option);
        JLabel label = new JLabel(welcome);
        label.setFont(new Font("MV Boil",Font.BOLD,15));
        Object[] fields = {
            label,comboBox
        };
        int number = JOptionPane.showConfirmDialog(null,fields,"會員界面",JOptionPane.DEFAULT_OPTION,0,icon);
        int choice=0;
        if(number==JOptionPane.OK_OPTION){choice=comboBox.getSelectedIndex();} //jin
        else if(number==JOptionPane.CLOSED_OPTION){System.exit(0);} //jin

        // System.out.println("普通使用者選單！");
        // System.out.println("=================================");
        // System.out.println("hello " + getName() + " 熱誠歡迎使用本圖書館管理系統！");
        // System.out.println("1.查詢圖書");
        // System.out.println("2.借閱圖書");
        // System.out.println("3.歸還圖書");
        // System.out.println("4.查看紀錄");
        // System.out.println("5.帳號登出");
        // System.out.println("0.退出系統");
        // System.out.println("================================");
        // System.out.println("請按照提示選擇相應操作: ");
        // Scanner sc = new Scanner(System.in);
        // int choice = sc.nextInt();
        return choice;
    }
	protected abstract ArrayList<Record> getInfo();
	protected abstract int Fineperday();
	protected abstract int limit();
}
