import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.swing.*;
import java.awt.*;
import java.text.*;

public class Overduereminder
{
	public static void remind() {
		// TODO Auto-generated method stub
		Member member = (Member) Test.getUser();
		int total=0;
		String info="==========================\n\n有尚未歸還書籍已預期\n";
		int c=0;
		for (int j = 0; j < member.getInfo().size(); j++) 
		{                                	
			Record record = member.getInfo().get(j); 
			Date date = new Date();
        	// record.setRedate(date);
        	// record.setReturn(true);
        	long diff = date.getTime()-record.getBodate().getTime();
        	TimeUnit time = TimeUnit.DAYS; 
        	long difference = time.convert(diff, TimeUnit.MILLISECONDS);
        	int days = (int)difference;
        	record.setFine(days>member.limit()? (days-member.limit())*member.Fineperday() : 0);
			if(record.getFine()!=0&&!record.getisReturn()&&record.getName()==member.getName()){
			c=1;
			// System.out.println("上次借閱Book:"+record.getBookname()+"/Borrow Time:"+record.getBodate()+"/已到期罰金為:"+record.getFine()+"元");
			info+=j+1+". 書名: "+record.getBookname(); //jin
			info+="\n>> 借出日期: "+record.getBodate();
			// info+="\n>> 歸還日期: "+(record.getisReturn()?record.getRedate():"尚未歸還");
			info+="\n>> 罰金: "+(record.getFine()!=0?record.getFine():"0"); //jin
			info+="\n\n==========================\n\n";
	        total+=record.getFine();}
	    }
		// System.out.println("罰金共計為"+total+"元");
		if(c==1){
		info+="目前罰金共計為"+total+"元";
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
}    