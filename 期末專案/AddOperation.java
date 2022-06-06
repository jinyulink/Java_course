import java.util.Scanner;
import javax.swing.*;
import java.awt.*;

public class AddOperation implements IOperation  {
	public void work(BookList booklist) {

        String name="",author="",publish="",type="";

        ImageIcon icon = new ImageIcon("icon.png"); //jin
        Image image = icon.getImage(); //jin
        Image img = image.getScaledInstance(100,100,Image.SCALE_DEFAULT); //jin
        icon= new ImageIcon(img); //jin
        String l1 = "新增書名";
        JLabel label1 = new JLabel(l1);
        JTextField t1 = new JTextField(10);
        label1.setFont(new Font("MV Boil",Font.BOLD,15));
        String l2 = "新增作者";
        JLabel label2 = new JLabel(l2);
        JTextField t2 = new JTextField(10);
        label2.setFont(new Font("MV Boil",Font.BOLD,15));
        String l3 = "新增出版社";
        JLabel label3 = new JLabel(l3);
        JTextField t3 = new JTextField(10);
        label3.setFont(new Font("MV Boil",Font.BOLD,15));
        String l4 = "新增型別";
        JLabel label4 = new JLabel(l4);
        JTextField t4 = new JTextField(10);
        label4.setFont(new Font("MV Boil",Font.BOLD,15));
        Object[] fields = {
            label1,t1,
            label2,t2,
            label3,t3,
            label4,t4
        };
        int number = JOptionPane.showConfirmDialog(null,fields,"管理員界面",JOptionPane.DEFAULT_OPTION,0,icon);
        if(number==JOptionPane.OK_OPTION){
            name=t1.getText();
            author=t2.getText();
            publish=t3.getText();
            type=t4.getText();
        } //jin
        else if(number==JOptionPane.CLOSED_OPTION){System.exit(0);} //jin

        // System.out.println("新增書籍");
        // Scanner sc = new Scanner(System.in);
        // System.out.println("請輸入書名");
        // String name = sc.nextLine();
        // System.out.println("請輸入書的作者");
        // String author = sc.nextLine();
        // System.out.println("請輸入書的出版社");
        // String publish = sc.nextLine();
        // System.out.println("請輸入書的型別");
        // String type = sc.next();

        Book newBook = new Book(name,author,publish,type); //構建新書（物件）
        booklist.getBooks().add(newBook);
        //int size = booklist.getUsedSize(); //通過bookList引用訪問當前順序表長度
        //booklist.setBooks(size,newBook); //將新書放在順序表最後面
        //booklist.setUsedSize(size+1); //順序表放了新書之後，長度加1

    }
}
