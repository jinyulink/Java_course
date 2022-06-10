import java.util.Scanner;
import javax.swing.*;
import java.awt.*;

public class DelOperation implements IOperation {
	public void work(BookList booklist) {
        System.out.println("刪除書籍");

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
            int number = JOptionPane.showConfirmDialog(null,field,"管理員界面",JOptionPane.DEFAULT_OPTION,0,icon);
            String name="";
            if(number==JOptionPane.OK_OPTION){name=bookname.getText();} //jin
            else if(number==JOptionPane.CLOSED_OPTION){System.exit(0);} //jin

        // Scanner sc = new Scanner(System.in);
        // System.out.println("請輸入書名");
        // String name = sc.nextLine();  //name為所要刪除的書名

        int i = 0;
        for (; i < booklist.getBooks().size(); i++) {
            Book book = booklist.getBooks().get(i);
            if(book.getName().equals(name)){
                break;
            }
        }

        if(i >= booklist.getBooks().size()){
            number = JOptionPane.showConfirmDialog(null,"沒有要刪除的書籍","管理員界面",JOptionPane.DEFAULT_OPTION,0,icon);
            if(number==JOptionPane.OK_OPTION){;} //jin
            else if(number==JOptionPane.CLOSED_OPTION){System.exit(0);} //jin
            return ;
        }
        //此時i為所要刪除書的下標
        booklist.getBooks().remove(i); //BUG!!!!! i不用減1
        
        /*for (int j = i; j < booklist.getBooks().size()-1; j++) {
            Book book = booklist.getBooks(j+1); //獲得j+1位置的書
            booklist.setBooks(j,book);  //將j+1位置的書給j位置
        }
        int size = booklist.getUsedSize();  //獲得順序表長度
        booklist.setUsedSize(size-1);   //刪除書後，長度減去1*/
        
        number = JOptionPane.showConfirmDialog(null,"書已被刪除","管理員界面",JOptionPane.DEFAULT_OPTION,0,icon);
            if(number==JOptionPane.OK_OPTION){;} //jin
            else if(number==JOptionPane.CLOSED_OPTION){System.exit(0);} //jin
    }
}
