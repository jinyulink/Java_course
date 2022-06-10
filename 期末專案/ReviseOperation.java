import java.util.Scanner;
import javax.swing.*;
import java.awt.*;

public class ReviseOperation implements IOperation {

	public void work(BookList booklist) {

		ImageIcon icon = new ImageIcon("icon.png"); //jin
        Image image = icon.getImage(); //jin
        Image img = image.getScaledInstance(100,100,Image.SCALE_DEFAULT); //jin
        icon= new ImageIcon(img); //jin
        // String l1 = "新增書名";
        // JLabel label1 = new JLabel(l1);
        // JTextField t1 = new JTextField(10);
        // label1.setFont(new Font("MV Boil",Font.BOLD,15));
        // String l2 = "新增作者";
        // JLabel label2 = new JLabel(l2);
        // JTextField t2 = new JTextField(10);
        // label2.setFont(new Font("MV Boil",Font.BOLD,15));
        // String l3 = "新增出版社";
        // JLabel label3 = new JLabel(l3);
        // JTextField t3 = new JTextField(10);
        // label3.setFont(new Font("MV Boil",Font.BOLD,15));
        // String l4 = "新增型別";
        // JLabel label4 = new JLabel(l4);
        // JTextField t4 = new JTextField(10);
        // label4.setFont(new Font("MV Boil",Font.BOLD,15));
        // Object[] fields = {
        //     label1,t1,
        //     label2,t2,
        //     label3,t3,
        //     label4,t4
        // };
        // int number = JOptionPane.showConfirmDialog(null,fields,"管理員界面",JOptionPane.DEFAULT_OPTION,0,icon);
        // if(number==JOptionPane.OK_OPTION){
        //     name=t1.getText();
        //     author=t2.getText();
        //     publish=t3.getText();
        //     type=t4.getText();
        // } //jin
        // else if(number==JOptionPane.CLOSED_OPTION){System.exit(0);} //jin


		String welcome = "請輸入書名";
        JTextField booknamee = new JTextField(10);
        JLabel label1 = new JLabel(welcome);
        label1.setFont(new Font("MV Boil",Font.BOLD,15));
        Object[] field = {
            label1,booknamee
        };
        int number = JOptionPane.showConfirmDialog(null,field,"管理員界面",JOptionPane.DEFAULT_OPTION,0,icon);
        String bookname="";
        if(number==JOptionPane.OK_OPTION){bookname=booknamee.getText();} //jin
        else if(number==JOptionPane.CLOSED_OPTION){System.exit(0);} //jin

		// System.out.println("修改書籍");
		// Scanner sc = new Scanner(System.in);
        // System.out.println("請輸入書名");
        // String bookname = sc.next();  //bookname為所要修改的書名

        for (int i = 0; i < booklist.getBooks().size(); i++) {
            //通過booklist下標遍歷每一本書
            Book book = booklist.getBooks().get(i);
            if(book.getName().equals(bookname)){//確認到要修改的書

			String[] option = {"","書名","作者","出版社","類型"};
        	welcome = "請選擇要修改的部分";
        	JComboBox comboBox = new JComboBox(option);
        	JLabel label = new JLabel(welcome);
        	label.setFont(new Font("MV Boil",Font.BOLD,15));
        	Object[] fields = {
            	label,comboBox
        	};
        	number = JOptionPane.showConfirmDialog(null,fields,"管理員界面",JOptionPane.DEFAULT_OPTION,0,icon);
        	if(number==JOptionPane.OK_OPTION){number=comboBox.getSelectedIndex();} //jin
        	else if(number==JOptionPane.CLOSED_OPTION){System.exit(0);} //jin
			int choice = number;


            	// System.out.println("請選擇要修改的內容> 1:書名 2:作者 3:出版社 4:類型");
                // int choice = sc.nextInt();      
                if(choice == 1){     
					
					welcome = "請輸入書名";
            		JTextField bookname1 = new JTextField(10);
            		JLabel label11 = new JLabel(welcome);
            		label1.setFont(new Font("MV Boil",Font.BOLD,15));
            		Object[] fieldf = {
            		    label11,bookname1
            		};
            		number = JOptionPane.showConfirmDialog(null,fieldf,"管理員界面",JOptionPane.DEFAULT_OPTION,0,icon);
            		String name="";
            		if(number==JOptionPane.OK_OPTION){name=bookname1.getText();} //jin
            		else if(number==JOptionPane.CLOSED_OPTION){System.exit(0);} //jin

                	// System.out.println("請輸入書名");
                	book.setName(name); 
                	System.out.println(book);
                	return;
                }
                else if (choice == 2){
					welcome = "請輸入作者";
            		JTextField bookname1 = new JTextField(10);
            		JLabel label11 = new JLabel(welcome);
            		label1.setFont(new Font("MV Boil",Font.BOLD,15));
            		Object[] fieldf = {
            		    label11,bookname1
            		};
            		number = JOptionPane.showConfirmDialog(null,fieldf,"管理員界面",JOptionPane.DEFAULT_OPTION,0,icon);
            		String name="";
            		if(number==JOptionPane.OK_OPTION){name=bookname1.getText();} //jin
            		else if(number==JOptionPane.CLOSED_OPTION){System.exit(0);} //jin
					String author = name;
                	// System.out.println("請輸入作者");
                	// String author = sc.next();
                	book.setAuthor(author);
                	System.out.println(book);
                	return;
                }
                else if (choice == 3){
					welcome = "請輸入出版社";
            		JTextField bookname1 = new JTextField(10);
            		JLabel label11 = new JLabel(welcome);
            		label1.setFont(new Font("MV Boil",Font.BOLD,15));
            		Object[] fieldf = {
            		    label11,bookname1
            		};
            		number = JOptionPane.showConfirmDialog(null,fieldf,"管理員界面",JOptionPane.DEFAULT_OPTION,0,icon);
            		String name="";
            		if(number==JOptionPane.OK_OPTION){name=bookname1.getText();} //jin
            		else if(number==JOptionPane.CLOSED_OPTION){System.exit(0);} //jin
					String publish = name;
                	// System.out.println("請輸入出版社");
                	// String publish = sc.next();
                	book.setPublish(publish); 
                	System.out.println(book);
                	return;
                }
                else if (choice == 4){
					welcome = "請輸入類型";
            		JTextField bookname1 = new JTextField(10);
            		JLabel label11 = new JLabel(welcome);
            		label1.setFont(new Font("MV Boil",Font.BOLD,15));
            		Object[] fieldf = {
            		    label11,bookname1
            		};
            		number = JOptionPane.showConfirmDialog(null,fieldf,"管理員界面",JOptionPane.DEFAULT_OPTION,0,icon);
            		String name="";
            		if(number==JOptionPane.OK_OPTION){name=bookname1.getText();} //jin
            		else if(number==JOptionPane.CLOSED_OPTION){System.exit(0);} //jin
					String type =name;
                	// System.out.println("請輸入類型");
                	// String type = sc.next();
                	book.setType(type); 
                	System.out.println(book);
                	return;
                }
                else {
					number = JOptionPane.showConfirmDialog(null,"請正確輸入選項","管理員界面",JOptionPane.DEFAULT_OPTION,0,icon);
            		if(number==JOptionPane.OK_OPTION){;} //jin
            		else if(number==JOptionPane.CLOSED_OPTION){System.exit(0);} //jin
                	// System.out.println("請正確輸入選項");
        			return;
                }                
            } 
            
        }
        number = JOptionPane.showConfirmDialog(null,"沒有這本書","管理員界面",JOptionPane.DEFAULT_OPTION,0,icon);
            if(number==JOptionPane.OK_OPTION){;} //jin
            else if(number==JOptionPane.CLOSED_OPTION){System.exit(0);} //jin
	}
}
