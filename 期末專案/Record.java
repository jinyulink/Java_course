import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Record {
	private String bookname = "";
	private Date bodate;
	private Date redate;
	private boolean isReturn = false;
	private Long fine;

	public void setBookname(String bookname) {this.bookname = bookname;}
	public void setBodate(Date bodate) {this.bodate = bodate;}
	public void setRedate(Date redate) {this.redate = redate;}
	public void setReturn(boolean isReturn) {this.isReturn = isReturn;}
	public void setFine(Long fine) {this.fine = fine;}
	public String getBookname() {return bookname;}
	public Date getBodate() {return bodate;}
	public Date getRedate() {return redate;}

	public boolean getisReturn() {return isReturn;}

	public Long getFine() {return fine;}
	
	Record(String bookname,Date bodate,Date redate,boolean isReturn,Long fine){
		setBookname(bookname);
		setBodate(bodate);
		setRedate(redate);
		setReturn(isReturn);
		setFine(fine);
	}
	public String toString() {
		TimeUnit time = TimeUnit.DAYS;
		SimpleDateFormat sdFormat = new SimpleDateFormat("EEE, MMM d, ''yy");
		return "Bookname: " + bookname + "/ Borrow time: " + sdFormat.format(bodate)+
                "/ Return time: " + (redate != null? sdFormat.format(redate):"null") + "/ Status: " +
                (isReturn == true? "returned":"not returned") + "/ Fine: " + (fine != null? fine:"0");
                
	}
}
