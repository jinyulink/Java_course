

public class Book {
	
    private String name;//書名
    private String author;//作者
    private String publish;//出版社
    private String type;//類型
    private boolean isBorrowed = false; 
    private int borrow = 0; //借閱次數
    private int search = 0; //查詢次數
    //private Date borrowData;

    public String getName() {return name;}
    public String getAuthor() {return author;}
    public String getPublish() {return publish;}
    public String getType() {return type;}
    public boolean isBorrowed() {return isBorrowed;}
    public int getBorrow() {return borrow;}
    public int getSearch() {return search;}
	
	public void setName(String name) {this.name = name;}
    public void setAuthor(String author) {this.author = author;}
    public void setPublish(String publish) {this.publish = publish;}
    public void setType(String type) {this.type = type;}
    public void setBorrowed(boolean borrowed) {isBorrowed = borrowed;}
    public void setBorrow() {this.borrow++;}
    public void setSearch() {this.search++;}
    
    public Book(String name, String author, String publish, String type) {
    	setName(name);
    	setAuthor(author);
    	setPublish(publish);
    	setType(type);
    }

    @Override
    public String toString() {
        String result = name+" "+author+" "+publish+" "+type+" "+((isBorrowed == true) ? "已借出" : "未借出")+" "+borrow+" "+search; //jin
        return result; //jin
    }
}

