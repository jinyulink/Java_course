

public class Book {
	
    private String name;//書名
    private String author;//作者
    private String publish;//出版社
    private String type;//類型
    private boolean isBorrowed = false; 
    private int borrow = 0; //借閱次數
    private int search = 0; //查詢次數
    private String reserve;
    //private Date borrowData;

    public String getName() {return name;}
    public String getAuthor() {return author;}
    public String getPublish() {return publish;}
    public String getType() {return type;}
    public boolean isBorrowed() {return isBorrowed;}
    public int getBorrow() {return borrow;}
    public int getSearch() {return search;}
    public String getReserve() {return reserve;}
	
	public void setName(String name) {this.name = name;}
    public void setAuthor(String author) {this.author = author;}
    public void setPublish(String publish) {this.publish = publish;}
    public void setType(String type) {this.type = type;}
    public void setBorrowed(boolean borrowed) {isBorrowed = borrowed;}
    public void setBorrow() {this.borrow++;}
    public void setSearch() {this.search++;}
    public void setReserve(String reserve) {this.reserve = reserve;}
    
    public Book(String name, String author, String publish, String type) {
    	setName(name);
    	setAuthor(author);
    	setPublish(publish);
    	setType(type);
        setReserve(reserve);
    }
    
    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publish=" + publish +
                ", type='" + type + '\'' +
                ((isBorrowed == true) ? " 借閱狀態: 已借出" : " 借閱狀態: 未借出") +
                ((reserve != null) ? " 預約狀態: 已預約" : " 預約狀態: 未預約")+
                '}';
    }
    // public String toString() {
    //     String result = name+" "+author+" "+publish+" "+type+" "+((isBorrowed == true) ? "已借出" : "未借出")+" "+borrow+" "+search; //jin
    //     return result; //jin
    // }
}

