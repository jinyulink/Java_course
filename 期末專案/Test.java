import java.util.Scanner;
import javax.swing.*;
import java.awt.*;

public class Test { 
	static BookList bookList = new BookList();
	public static void main(String[] args) {
       System();
   }
	static User user = null;
	public static void setUser(User user) {Test.user = user;}
	public static User getUser() {return user;}	
	public static void System() {		

        String start[] = {"","登入帳號","建立帳號"}; //jin
        JComboBox comboBox = new JComboBox(start); //jin
        ImageIcon icon = new ImageIcon("icon.png"); //jin
        Image image = icon.getImage(); //jin
        Image img = image.getScaledInstance(100,100,Image.SCALE_DEFAULT); //jin
        icon= new ImageIcon(img); //jin
        JLabel label = new JLabel("請選擇 登入 或 建立帳號");
        label.setFont(new Font("MV Boil",Font.BOLD,15));
        Object[] fields = {
            label, comboBox
        }; //jin
        int number = JOptionPane.showConfirmDialog(null,fields,"圖書管理系統",JOptionPane.DEFAULT_OPTION,0,icon);   //jin
        if(number==JOptionPane.OK_OPTION){number=comboBox.getSelectedIndex();} //jin
        else if(number==JOptionPane.CLOSED_OPTION){System.exit(0);} //jin

		// System.out.println("請輸入你的選擇> 1:登入 2:建立帳號"); 
		// Scanner s = new Scanner(System.in);
		// int number = s.nextInt();

		if(number == 1) {
			//login();
			user = login(); // 父類引用指向子類例項（向上轉型）
	        while(user != null) {
	            //user.menu() 呼叫哪個menu方法，根據登入身份決定
	            int choice = user.menu();

	            //此doOperation方法是當前user自己的方法
	            //choice選擇當前使用者operations陣列中的相應的類，該類產生的物件呼叫自己的work方法
	            user.doOperation(choice, bookList);
	        }
            number = JOptionPane.showConfirmDialog(null,"登入失敗","圖書管理系統",JOptionPane.DEFAULT_OPTION,0,icon);  
	        if(number==JOptionPane.OK_OPTION){System();} //jin
            else if(number==JOptionPane.CLOSED_OPTION){System.exit(0);} //jin
		}
		else {
			create();
			System();
		}
	}
	
	public static User login() {

        String identity[] = {"","管理員","教師","學生","職員"}; //jin
        JComboBox comboBox = new JComboBox(identity); //jin
        ImageIcon icon = new ImageIcon("icon.png"); //jin
        Image image = icon.getImage(); //jin
        Image img = image.getScaledInstance(100,100,Image.SCALE_DEFAULT); //jin
        icon= new ImageIcon(img); //jin
        JLabel label = new JLabel("請選擇您的身分");
        label.setFont(new Font("MV Boil",Font.BOLD,15));
        Object[] fields = {
            label, comboBox
        }; //jin
        int number = JOptionPane.showConfirmDialog(null,fields,"圖書管理系統",JOptionPane.DEFAULT_OPTION,0,icon);   //jin
        if(number==JOptionPane.OK_OPTION){number=comboBox.getSelectedIndex();} //jin
        else if(number==JOptionPane.CLOSED_OPTION){System.exit(0);} //jin

		Scanner sc = new Scanner(System.in);
        // System.out.println("請輸入你的身份> 1:管理員 2:教師 3:學生 4:職員");
        // int number = sc.nextInt();
        if(number == 1){ 

            String[] info = logingui();
            String id = info[0];
            String pwd = info[1];

        	// System.out.print("請輸入您的帳號：");
            // String id = sc.next();
            // System.out.print("請輸入您的密碼：");
            // String pwd = sc.next();

            for(User u : Admin.getAdlist()) {
                if(u.getAccount().equals(id) && u.getPassword().equals(pwd)) {
                    return u;                   
					
                }
            }
        }
        else if(number == 2){ 

            String[] info = logingui();
            String id = info[0];
            String pwd = info[1];

        	// System.out.print("請輸入您的帳號：");
            // String id = sc.next();
            // System.out.print("請輸入您的密碼：");
            // String pwd = sc.next();
            for(User u : Member.getTelist()) {
                if(u.getAccount().equals(id) && u.getPassword().equals(pwd)) {
                    return u;                     
                }
            }
        }
        else if(number == 3 ){ 

            String[] info = logingui();
            String id = info[0];
            String pwd = info[1];

                // System.out.print("請輸入您的帳號：");
                // String id = sc.next();
                // System.out.print("請輸入您的密碼：");
                // String pwd = sc.next();
                for(User u : Member.getStlist()) {
                    if(u.getAccount().equals(id) && u.getPassword().equals(pwd)) {
                        return u;                        
                    }
                }
        	}
        else if(number == 4){ 

            String[] info = logingui();
            String id = info[0];
            String pwd = info[1];

        	// System.out.print("請輸入您的帳號：");
            // String id = sc.next();
            // System.out.print("請輸入您的密碼：");
            // String pwd = sc.next();
            for(User u : Member.getStalist()) {
                if(u.getAccount().equals(id) && u.getPassword().equals(pwd)) {
                    return u;                        
                }
            }
        }
		return null;
	}
	public static void create(){

        String name="";
        int number;
        String account ="";
        String password ="";

        String identity[] = {"","管理員","教師","學生","職員"}; //jin
        JComboBox comboBox = new JComboBox(identity); //jin
        ImageIcon icon = new ImageIcon("icon.png"); //jin
        Image image = icon.getImage(); //jin
        Image img = image.getScaledInstance(100,100,Image.SCALE_DEFAULT); //jin
        icon= new ImageIcon(img); //jin
        JLabel label = new JLabel("請輸入你的姓名");
        label.setFont(new Font("MV Boil",Font.BOLD,15));
        JTextField username = new JTextField(5);
        JLabel label1 = new JLabel("請選擇身分");
        label1.setFont(new Font("MV Boil",Font.BOLD,15));
        JLabel label2 = new JLabel("帳號");
        label2.setFont(new Font("MV Boil",Font.BOLD,15));
        JTextField userid = new JTextField(5);
        JLabel label3 = new JLabel("密碼");
        label3.setFont(new Font("MV Boil",Font.BOLD,15));
        JTextField userpwd = new JTextField(5);
        Object[] fields = {
            label, username,
            label1, comboBox,
            label2, userid,
            label3, userpwd
        }; //jin
        number = JOptionPane.showConfirmDialog(null,fields,"圖書管理系統",JOptionPane.DEFAULT_OPTION,0,icon);   //jin
        if(number==JOptionPane.OK_OPTION){
            name = username.getText();
            number = comboBox.getSelectedIndex();
            account = userid.getText();
            password = userpwd.getText();
        } //jin
        else if(number==JOptionPane.CLOSED_OPTION){System.exit(0);} //jin

        // Scanner sc = new Scanner(System.in);
        // System.out.println("請輸入你的姓名: ");
        // String name = sc.nextLine();
        // System.out.println("請輸入你要建立的身份> 1:管理員 2:教師 3:學生 4:職員");
        // int number = sc.nextInt();
        // System.out.println("請輸入你的帳號: ");
        // String account = sc.next();
        // System.out.println("請輸入你的密碼: ");
        // String password = sc.next();

        if(number == 1){ 

            String key="";//jin
            JLabel label4 = new JLabel("請輸入驗證碼");
            label4.setFont(new Font("MV Boil",Font.BOLD,15));
            JTextField userkey = new JTextField(5);
            Object[] field = {
                label4, userkey,
            }; //jin
            number = JOptionPane.showConfirmDialog(null,field,"圖書管理系統",JOptionPane.DEFAULT_OPTION,0,icon);   //jin
            if(number==JOptionPane.OK_OPTION){
                key = userkey.getText();
            } //jin
            else if(number==JOptionPane.CLOSED_OPTION){System.exit(0);} //jin

        	// System.out.println("請輸入驗證碼: ");
            // String key = sc.next();

            if(key.equals("0000")) {
            	Admin.addAdmin(new Admin(name,account,password));
            }
        }
        else if(number == 2){ Member.addTeacher(new Teacher(name,account,password));}
        else if(number == 3){ Member.addStudent(new Student(name,account,password));}
        else if(number == 4){ Member.addStaff(new Staff(name,account,password));}
    }
    //jin logingui()
    public static String[] logingui(){

        ImageIcon icon = new ImageIcon("icon.png"); //jin
        Image image = icon.getImage(); //jin
        Image img = image.getScaledInstance(100,100,Image.SCALE_DEFAULT); //jin
        icon= new ImageIcon(img); //jin

            String id=""; //jin
            String pwd="";
            JTextField user = new JTextField(5);
            JTextField password = new JTextField(5);
            JPanel myPanel = new JPanel();
            myPanel.add(new JLabel("帳號:"));
            myPanel.add(user);
            myPanel.add(Box.createHorizontalStrut(15)); // a spacer
            myPanel.add(new JLabel("密碼:"));
            myPanel.add(password);
            int result = JOptionPane.showConfirmDialog(null, myPanel,"圖書管理系統", JOptionPane.DEFAULT_OPTION,0,icon);
            if(result==JOptionPane.OK_OPTION){
                id=user.getText();
                pwd=password.getText();
            } //jin
            else if(result==JOptionPane.CLOSED_OPTION){System.exit(0);} //jin

            String[] s = {id,pwd};
            return s;
    }
}

