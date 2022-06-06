import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Member{
	private Book[] b = new Book[3];
	private static ArrayList<Record> info = new ArrayList<Record>();
	public ArrayList<Record> getInfo() {return info;}
	public void addRecord(Record r) {info.add(r);}
	public Student(String name,String account,String password) {
		super(name,account,password);		
	}
	protected int Fineperday() {
		return 2;
	}
	protected int limit() {
		return 5;
	}
	
}
