import java.util.Date;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;

public class Reservebook implements IOperation  
{
    public void work(BookList booklist) 
    {
        // Scanner s = new Scanner(System.in);
        // System.out.println("欲預約書籍");
        // System.out.println("請輸入書名");
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
        
         for (int i = 0; i < booklist.getBooks().size(); i++) 
        {
            //通過booklist下標遍歷每一本書
            Book book = booklist.getBooks().get(i);
            if(book.getName().equals(name))
            {
                if(book.isBorrowed() == true) //book has already been borrowed
                {
                    if(book.getReserve()==null) {//目前無人預約
                    	Member member2 = (Member) Test.getUser();   
                    	book.setReserve(member2.getName());//設定預約人
                    	// System.out.println("預約成功");
                        number = JOptionPane.showConfirmDialog(null,"預約成功","管理員界面",JOptionPane.DEFAULT_OPTION,0,icon);
            if(number==JOptionPane.OK_OPTION){;} //jin
            else if(number==JOptionPane.CLOSED_OPTION){System.exit(0);} //jin
                        return;
                    }
                    else
                    	// System.out.println("很抱歉此書已被預約，無法借閱"); 
                        number = JOptionPane.showConfirmDialog(null,"很抱歉此書已被預約，無法借閱","管理員界面",JOptionPane.DEFAULT_OPTION,0,icon);
            if(number==JOptionPane.OK_OPTION){;} //jin
            else if(number==JOptionPane.CLOSED_OPTION){System.exit(0);} //jin
                        return;
                }
                else 
                {
                    // System.out.println("圖書尚在架上，可直接至館內借閱");
                    number = JOptionPane.showConfirmDialog(null,"圖書尚在架上，可直接至館內借閱","管理員界面",JOptionPane.DEFAULT_OPTION,0,icon);
            if(number==JOptionPane.OK_OPTION){;} //jin
            else if(number==JOptionPane.CLOSED_OPTION){System.exit(0);} //jin
                    return;
                }
            }
        }
        // System.out.println("非常抱歉，本館沒有您要借閱的書！"); 
             number = JOptionPane.showConfirmDialog(null,"非常抱歉，本館沒有您要借閱的書！","會員界面",JOptionPane.DEFAULT_OPTION,0,icon);
            if(number==JOptionPane.OK_OPTION){;} //jin
            else if(number==JOptionPane.CLOSED_OPTION){System.exit(0);} //jin

    }
    
}

