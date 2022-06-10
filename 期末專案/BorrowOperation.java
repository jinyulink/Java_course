import java.util.Date;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;

public class BorrowOperation implements IOperation {
	public void work(BookList booklist) {
		
        System.out.println("借閱書籍");

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
            Member member = (Member) Test.getUser();
        // Scanner sc = new Scanner(System.in);
        // System.out.println("請輸入書名");
        // String name = sc.nextLine();  //name為所要借閱書名
        if(member.booklimit>0) {//檢查是否還能借書
        for (int i = 0; i < booklist.getBooks().size(); i++) {
            //通過booklist下標遍歷每一本書
            Book book = booklist.getBooks().get(i);
            if(book.getName().equals(name)){
            	if(book.isBorrowed() != true) {
                    if(book.getReserve()==member.getName()||book.getReserve()==null) {//兩個可以順利借出的情況
            			book.setBorrowed(true);  //為true表示書已經結出
            			book.setReserve(null);//null表現在無人預約
                        book.setBorrow();
                        System.out.println("借閱成功");                                          
                        Date date = new Date();
    					member.getInfo().add(new Record(member.getName(),name,date,null,false,0));
                        return;
            		}
            		else {
            			// System.out.println("很抱歉此書已被預約，無法借閱");
                        number = JOptionPane.showConfirmDialog(null,"很抱歉此書已被預約，無法借閱","會員介面",JOptionPane.DEFAULT_OPTION,0,icon);
                    if(number==JOptionPane.OK_OPTION){;} //jin
                    else if(number==JOptionPane.CLOSED_OPTION){System.exit(0);} //jin
            			return;
            		}   
            		//如果為true，說明要借閱的書存在，我們需要做的是修改書的借閱狀態
                    // book.setBorrowed(true);  //為true表示書已經結出
                    // book.setBorrow();

                    // number = JOptionPane.showConfirmDialog(null,"借閱成功","會員介面",JOptionPane.DEFAULT_OPTION,0,icon);
                    // if(number==JOptionPane.OK_OPTION){;} //jin
                    // else if(number==JOptionPane.CLOSED_OPTION){System.exit(0);} //jin

                    // // System.out.println("借閱成功");
                    // Member member = (Member) Test.getUser();                    
                    // Date date = new Date();
					// member.addRecord(new Record(name,date,null,false,0));
                    // return;
            	}
            	else {

                    number = JOptionPane.showConfirmDialog(null,"非常抱歉，本書已被借閱","會員介面",JOptionPane.DEFAULT_OPTION,0,icon);
                    if(number==JOptionPane.OK_OPTION){;} //jin
                    else if(number==JOptionPane.CLOSED_OPTION){System.exit(0);} //jin

            		// System.out.println("非常抱歉，本書已被借閱");
            		return;
            	}
            }
        }
                    number = JOptionPane.showConfirmDialog(null,"非常抱歉，本館沒有您要借閱的書！","會員介面",JOptionPane.DEFAULT_OPTION,0,icon);
                    if(number==JOptionPane.OK_OPTION){;} //jin
                    else if(number==JOptionPane.CLOSED_OPTION){System.exit(0);} //jin
        // System.out.println("非常抱歉，本館沒有您要借閱的書！"); //
        }
    }
}
