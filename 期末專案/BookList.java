import java.util.ArrayList;

public class BookList {
	//public int usedSize = 3;  //已有書籍數
    //public Book[] books = new Book[10]; //書的型別為Book，用順陣列book去儲存
    public ArrayList<Book> books = new ArrayList<Book>();
    public ArrayList<Book> getBooks() {return books;}

	public BookList() {
        //books[0] = new Book("三國演義","羅貫中", "翰林", "小說");
        //books[1] = new Book("水滸傳", "施耐庵", "翰林", "小說");
        //books[2] = new Book("西遊記", "吳承恩", "翰林", "小說");
        books.add(new Book("三國演義","羅貫中", "翰林", "小說"));
        books.add(new Book("水滸傳", "施耐庵", "翰林", "小說"));
        books.add(new Book("西遊記", "吳承恩", "翰林", "小說"));
    }

    //給指定位置放書
    //public void setBooks(int pos,Book book) {this.books[pos] = book;}
    //拿到指定位置的書
    //public Book getBooks(int pos){return this.books[pos];}
    //public int getUsedSize() {return usedSize;}
    //public void setUsedSize(int usedSize) {this.usedSize = usedSize;}
}
