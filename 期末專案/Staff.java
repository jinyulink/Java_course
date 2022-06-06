import java.util.ArrayList;

public class Staff extends Member{
	private Book[] b = new Book[3];
	private static ArrayList<Record> info = new ArrayList<Record>();
	public ArrayList<Record> getInfo() {return info;}
	public void addRecord(Record r) {info.add(r);}
	public Staff(String name,String account,String password) {
		super(name,account,password);
		
	}
	protected int Fineperday() {
		return 10;
	}
	protected int limit() {
		return 10;
	}
}
