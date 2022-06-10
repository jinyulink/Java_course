
public abstract class User {
	
    public IOperation[] operations;
    private String name;
    private String account = "";
	private String password = "";
	private User login;
	public User getLogin() {return login;}
	public void setLogin(User u) {this.login = u;}
	
	public void setPassword(String password) {this.password = password;}
	public void setAccount(String account) {this.account = account;}
	public void setName(String name) {this.name = name;}
	public String getPassword() {return password;}
	public String getAccount() {return account;}
	public String getName() {return name;}
    public User(String name,String account,String password){
    	setName(name);
    	setAccount(account);
    	setPassword(password);
    }

    /*
    新建menu方法，理解為使用者選單
    因為SpecialPerson和OrdinaryPerson繼承了User，所以讓兩個子類重寫menu方法，二者的選單展示不一致
    此時menu可以沒有具體實現，因而將它設計為抽象方法，因此User類成為抽象類

     */
    abstract public int menu();

    //operations中存放的是哪些操作方法，得看子類
    public void doOperation(int choice, BookList bookList){
        this.operations[choice].work(bookList);
    }
}
