import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import javax.swing.*;
import java.awt.*;

public class ReturnOperation implements IOperation {
	public void work(BookList booklist) {
        System.out.println("歸還書籍");

        ImageIcon icon = new ImageIcon("icon.png"); //jin
        Image image = icon.getImage(); //jin
        Image img = image.getScaledInstance(100,100,Image.SCALE_DEFAULT); //jin
        icon= new ImageIcon(img); //jin
        String welcome = "請輸入書名";
            JTextField bookname = new JTextField(10);
            JLabel label1 = new JLabel(welcome);
            label1.setFont(new Font("MV Boil",Font.BOLD,15));
            Object[] field = {
                label1,bookname
            };
        int number = JOptionPane.showConfirmDialog(null,field,"會員界面",JOptionPane.DEFAULT_OPTION,0,icon);
            String name="";
            if(number==JOptionPane.OK_OPTION){name=bookname.getText();} //jin
            else if(number==JOptionPane.CLOSED_OPTION){System.exit(0);} //jin

        // Scanner sc = new Scanner(System.in);
        // System.out.println("請輸入書名");
        // String name = sc.nextLine();  //name為所要歸還的書名
        Member member = (Member) Test.getUser();
        for (int j = 0; j < member.getInfo().size(); j++) {                                	
        	Record record = member.getInfo().get(j);
            if(record.getBookname().equals(name)){
            	Date date = new Date();
            	record.setRedate(date);
            	record.setReturn(true);
            	long diff = date.getTime()-record.getBodate().getTime();
            	TimeUnit time = TimeUnit.DAYS; 
            	long difference = time.convert(diff, TimeUnit.MILLISECONDS);
            	record.setFine(difference>member.limit()? difference*member.Fineperday() : null);
            	for (int i = 0; i < booklist.getBooks().size(); i++) {
                    Book book = booklist.getBooks().get(i);
                    if(book.getName().equals(name)){
                        book.setBorrowed(false);
                        // System.out.println(book);  //直接列印書的資訊，toString方法已被重寫

                        number = JOptionPane.showConfirmDialog(null,"已歸還書籍！","會員介面",JOptionPane.DEFAULT_OPTION,0,icon);
                    if(number==JOptionPane.OK_OPTION){;} //jin
                    else if(number==JOptionPane.CLOSED_OPTION){System.exit(0);} //jin

                   }
            	}
                return ;
            }
        }
        number = JOptionPane.showConfirmDialog(null,"沒有借書紀錄！","會員介面",JOptionPane.DEFAULT_OPTION,0,icon);
                    if(number==JOptionPane.OK_OPTION){;} //jin
                    else if(number==JOptionPane.CLOSED_OPTION){System.exit(0);} //jin
        // System.out.println("沒有借書紀錄！");
    }
}
