import java.util.ArrayList;
import java.util.Date;

public class Teacher extends Member {
	private Book[] b = new Book[5];
	int fineperday = 5;
	private static ArrayList<Record> info = new ArrayList<Record>();
	public ArrayList<Record> getInfo() {return info;}
	public void addRecord(Record r) {info.add(r);}
	public Teacher(String name,String account,String password) {
		super(name,account,password);
		
	}
	protected int Fineperday() {
		return 5;
	}
	protected int limit() {
		return 10;
	}
	
}
