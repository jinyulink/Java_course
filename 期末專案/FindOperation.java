import java.util.Scanner;
import javax.swing.*;
import java.awt.*;

public class FindOperation implements IOperation {

	public void work(BookList booklist) {

        ImageIcon icon = new ImageIcon("icon.png"); //jin
        Image image = icon.getImage(); //jin
        Image img = image.getScaledInstance(100,100,Image.SCALE_DEFAULT); //jin
        icon= new ImageIcon(img); //jin
        String[] option = {"","書名","作者","出版社","類型"};
        String welcome = "請選擇書籍查詢方式";
        JComboBox comboBox = new JComboBox(option);
        JLabel label = new JLabel(welcome);
        label.setFont(new Font("MV Boil",Font.BOLD,15));
        Object[] fields = {
            label,comboBox
        };
        int number = JOptionPane.showConfirmDialog(null,fields,"管理員界面",JOptionPane.DEFAULT_OPTION,0,icon);
        if(number==JOptionPane.OK_OPTION){number=comboBox.getSelectedIndex();} //jin
        else if(number==JOptionPane.CLOSED_OPTION){System.exit(0);} //jin

        // System.out.println("請選擇書籍查詢方式> 1:書名 2:作者 3:出版社 4:類型");
        // Scanner sc = new Scanner(System.in); 
        Scanner s = new Scanner(System.in);
        // int number = sc.nextInt();        

        if(number == 1){       	

            welcome = "請輸入書名";
            JTextField bookname = new JTextField(10);
            JLabel label1 = new JLabel(welcome);
            label1.setFont(new Font("MV Boil",Font.BOLD,15));
            Object[] field = {
                label1,bookname
            };
            number = JOptionPane.showConfirmDialog(null,field,"管理員界面",JOptionPane.DEFAULT_OPTION,0,icon);
            String name="";
            if(number==JOptionPane.OK_OPTION){name=bookname.getText();} //jin
            else if(number==JOptionPane.CLOSED_OPTION){System.exit(0);} //jin

        	// System.out.println("請輸入書名");
        	// String name = s.nextLine(); //name為所要查詢書名
            for (int i = 0; i < booklist.getBooks().size(); i++) {
                //通過booklist下標遍歷每一本書
                Book book = booklist.getBooks().get(i);
                if(book.getName().equals(name)){
                    book.setSearch();

                    welcome = "該書存在!";
                    JLabel ll = new JLabel(welcome);
                    ll.setFont(new Font("MV Boil",Font.BOLD,15));
                    JLabel ll1 = new JLabel("名稱: "+book.getName());
                    ll1.setFont(new Font("MV Boil",Font.BOLD,15));
                    JLabel ll2 = new JLabel("作者: "+book.getAuthor());
                    ll2.setFont(new Font("MV Boil",Font.BOLD,15));
                    JLabel ll3 = new JLabel("出版社: "+book.getPublish());
                    ll3.setFont(new Font("MV Boil",Font.BOLD,15));
                    JLabel ll4 = new JLabel("類別: "+book.getType());
                    ll4.setFont(new Font("MV Boil",Font.BOLD,15));
                    JLabel ll5 = new JLabel("借出次數: "+String.valueOf(book.getBorrow()));
                    ll5.setFont(new Font("MV Boil",Font.BOLD,15));
                    JLabel ll6 = new JLabel("查尋次數: "+String.valueOf(book.getSearch()));
                    ll6.setFont(new Font("MV Boil",Font.BOLD,15));
                    Object[] fieldf = {
                        ll,
                        ll1,
                        ll2,
                        ll3,
                        ll4,
                        ll5,
                        ll6
                    };
                    number = JOptionPane.showConfirmDialog(null,fieldf,"書籍存在",JOptionPane.DEFAULT_OPTION,0,icon);
                    if(number==JOptionPane.OK_OPTION){;} //jin
                    else if(number==JOptionPane.CLOSED_OPTION){System.exit(0);} //jin

                    // System.out.println("該書存在！");
                    // System.out.println(book);  //直接列印書的資訊，toString方法已被重寫
                    return;
                }               
            }  
        }
        else if (number == 2){

            welcome = "請輸入作者";
            JTextField bookauthor = new JTextField(10);
            JLabel label1 = new JLabel(welcome);
            label1.setFont(new Font("MV Boil",Font.BOLD,15));
            Object[] field = {
                label1,bookauthor
            };
            number = JOptionPane.showConfirmDialog(null,field,"管理員界面",JOptionPane.DEFAULT_OPTION,0,icon);
            String author="";
            if(number==JOptionPane.OK_OPTION){author=bookauthor.getText();} //jin
            else if(number==JOptionPane.CLOSED_OPTION){System.exit(0);} //jin

        	// System.out.println("請輸入作者");
            // String author = s.nextLine();  //author為所要查詢作者
            for (int i = 0; i < booklist.getBooks().size(); i++) {
                //通過booklist下標遍歷每一本書
                Book book = booklist.getBooks().get(i);
                if(book.getAuthor().equals(author)){
                    book.setSearch();

                    welcome = "該書存在!";
                    JLabel ll = new JLabel(welcome);
                    ll.setFont(new Font("MV Boil",Font.BOLD,15));
                    JLabel ll1 = new JLabel("名稱: "+book.getName());
                    ll1.setFont(new Font("MV Boil",Font.BOLD,15));
                    JLabel ll2 = new JLabel("作者: "+book.getAuthor());
                    ll2.setFont(new Font("MV Boil",Font.BOLD,15));
                    JLabel ll3 = new JLabel("出版社: "+book.getPublish());
                    ll3.setFont(new Font("MV Boil",Font.BOLD,15));
                    JLabel ll4 = new JLabel("類別: "+book.getType());
                    ll4.setFont(new Font("MV Boil",Font.BOLD,15));
                    JLabel ll5 = new JLabel("借出次數: "+String.valueOf(book.getBorrow()));
                    ll5.setFont(new Font("MV Boil",Font.BOLD,15));
                    JLabel ll6 = new JLabel("查尋次數: "+String.valueOf(book.getSearch()));
                    ll6.setFont(new Font("MV Boil",Font.BOLD,15));
                    Object[] fieldf = {
                        ll,
                        ll1,
                        ll2,
                        ll3,
                        ll4,
                        ll5,
                        ll6
                    };
                    number = JOptionPane.showConfirmDialog(null,fieldf,"書籍存在",JOptionPane.DEFAULT_OPTION,0,icon);
                    if(number==JOptionPane.OK_OPTION){;} //jin
                    else if(number==JOptionPane.CLOSED_OPTION){System.exit(0);} //jin

                    // System.out.println("該書存在！");
                    // System.out.println(book);  //直接列印書的資訊，toString方法已被重寫
                    return;
                }               
            } 
        }
        else if (number == 3){

            welcome = "請輸入出版社";
            JTextField bookpublish = new JTextField(10);
            JLabel label1 = new JLabel(welcome);
            label1.setFont(new Font("MV Boil",Font.BOLD,15));
            Object[] field = {
                label1,bookpublish
            };
            number = JOptionPane.showConfirmDialog(null,field,"管理員界面",JOptionPane.DEFAULT_OPTION,0,icon);
            String publish="";
            if(number==JOptionPane.OK_OPTION){publish=bookpublish.getText();} //jin
            else if(number==JOptionPane.CLOSED_OPTION){System.exit(0);} //jin

        	// System.out.println("請輸入出版社");
            // String publish = s.nextLine();  //publish為所要查詢出版社
            for (int i = 0; i < booklist.getBooks().size(); i++) {
                //通過booklist下標遍歷每一本書
                Book book = booklist.getBooks().get(i);
                if(book.getPublish().equals(publish)){
                    book.setSearch();

                    welcome = "該書存在!";
                    JLabel ll = new JLabel(welcome);
                    ll.setFont(new Font("MV Boil",Font.BOLD,15));
                    JLabel ll1 = new JLabel("名稱: "+book.getName());
                    ll1.setFont(new Font("MV Boil",Font.BOLD,15));
                    JLabel ll2 = new JLabel("作者: "+book.getAuthor());
                    ll2.setFont(new Font("MV Boil",Font.BOLD,15));
                    JLabel ll3 = new JLabel("出版社: "+book.getPublish());
                    ll3.setFont(new Font("MV Boil",Font.BOLD,15));
                    JLabel ll4 = new JLabel("類別: "+book.getType());
                    ll4.setFont(new Font("MV Boil",Font.BOLD,15));
                    JLabel ll5 = new JLabel("借出次數: "+String.valueOf(book.getBorrow()));
                    ll5.setFont(new Font("MV Boil",Font.BOLD,15));
                    JLabel ll6 = new JLabel("查尋次數: "+String.valueOf(book.getSearch()));
                    ll6.setFont(new Font("MV Boil",Font.BOLD,15));
                    Object[] fieldf = {
                        ll,
                        ll1,
                        ll2,
                        ll3,
                        ll4,
                        ll5,
                        ll6
                    };
                    number = JOptionPane.showConfirmDialog(null,fieldf,"書籍存在",JOptionPane.DEFAULT_OPTION,0,icon);
                    if(number==JOptionPane.OK_OPTION){;} //jin
                    else if(number==JOptionPane.CLOSED_OPTION){System.exit(0);} //jin

                    // System.out.println("該書存在！");
                    // System.out.println(book);  //直接列印書的資訊，toString方法已被重寫
                    return;
                }              
            } 
        }
        else if (number == 4){

            welcome = "請輸入類型";
            JTextField booktype = new JTextField(10);
            JLabel label1 = new JLabel(welcome);
            label1.setFont(new Font("MV Boil",Font.BOLD,15));
            Object[] field = {
                label1,booktype
            };
            number = JOptionPane.showConfirmDialog(null,field,"管理員界面",JOptionPane.DEFAULT_OPTION,0,icon);
            String type="";
            if(number==JOptionPane.OK_OPTION){type=booktype.getText();} //jin
            else if(number==JOptionPane.CLOSED_OPTION){System.exit(0);} //jin

        	// System.out.println("請輸入類型");
            // String type = s.nextLine();  //type為所要查詢類型
            for (int i = 0; i < booklist.getBooks().size(); i++) {
                //通過booklist下標遍歷每一本書
                Book book = booklist.getBooks().get(i);
                if(book.getType().equals(type)){
                    book.setSearch();

                    welcome = "該書存在!";
                    JLabel ll = new JLabel(welcome);
                    ll.setFont(new Font("MV Boil",Font.BOLD,15));
                    JLabel ll1 = new JLabel("名稱: "+book.getName());
                    ll1.setFont(new Font("MV Boil",Font.BOLD,15));
                    JLabel ll2 = new JLabel("作者: "+book.getAuthor());
                    ll2.setFont(new Font("MV Boil",Font.BOLD,15));
                    JLabel ll3 = new JLabel("出版社: "+book.getPublish());
                    ll3.setFont(new Font("MV Boil",Font.BOLD,15));
                    JLabel ll4 = new JLabel("類別: "+book.getType());
                    ll4.setFont(new Font("MV Boil",Font.BOLD,15));
                    JLabel ll5 = new JLabel("借出次數: "+String.valueOf(book.getBorrow()));
                    ll5.setFont(new Font("MV Boil",Font.BOLD,15));
                    JLabel ll6 = new JLabel("查尋次數: "+String.valueOf(book.getSearch()));
                    ll6.setFont(new Font("MV Boil",Font.BOLD,15));
                    Object[] fieldf = {
                        ll,
                        ll1,
                        ll2,
                        ll3,
                        ll4,
                        ll5,
                        ll6
                    };
                    number = JOptionPane.showConfirmDialog(null,fieldf,"書籍存在",JOptionPane.DEFAULT_OPTION,0,icon);
                    if(number==JOptionPane.OK_OPTION){;} //jin
                    else if(number==JOptionPane.CLOSED_OPTION){System.exit(0);} //jin

                    // System.out.println("該書存在！");
                    // System.out.println(book);  //直接列印書的資訊，toString方法已被重寫 
                    return;
                }                
            } 
        }
        number = JOptionPane.showConfirmDialog(null,"沒有這本書","管理員界面",JOptionPane.DEFAULT_OPTION,0,icon);
            if(number==JOptionPane.OK_OPTION){;} //jin
            else if(number==JOptionPane.CLOSED_OPTION){System.exit(0);} //jin
	}	
}
