import javax.swing.*;
import java.awt.*;
import java.text.*;

public class RecordOperation implements IOperation{

	public void work(BookList booklist) {
		System.out.println("個人紀錄");

		String info="==========================\n\n";

		Member member = (Member) Test.getUser();
		for (int i = 0; i < member.getInfo().size(); i++) {
            Record record = member.getInfo().get(i);
            System.out.println(record);
			
			SimpleDateFormat sdFormat = new SimpleDateFormat("EEE, MMM d, ''yy");
			info+=i+1+". 書名: "+record.getBookname(); //jin
			info+="\n>> 借出日期: "+sdFormat.format(record.getBodate());
			info+="\n>> 歸還日期: "+(record.getisReturn()?sdFormat.format(record.getRedate()):"尚未歸還");
			info+="\n>> 罰金: "+(record.getFine()!=null?record.getFine():"0"); //jin
			info+="\n\n==========================\n\n";
        }

		ImageIcon icon = new ImageIcon("icon.png"); //jin
        Image image = icon.getImage(); //jin
        Image img = image.getScaledInstance(100,100,Image.SCALE_DEFAULT); //jin
        icon= new ImageIcon(img); //jin
		JTextArea textArea = new JTextArea(info);
		JScrollPane scrollPane = new JScrollPane(textArea);  
		textArea.setLineWrap(true);  
		textArea.setWrapStyleWord(true); 
		scrollPane.setPreferredSize( new Dimension( 220, 200 ) );
		int number = JOptionPane.showConfirmDialog(null, scrollPane, "會員介面",JOptionPane.DEFAULT_OPTION,0,icon);
        if(number==JOptionPane.OK_OPTION){;} //jin
        else if(number==JOptionPane.CLOSED_OPTION){System.exit(0);} //jin

	}

}
