
public class LogoutOperation implements IOperation {
	public void work(BookList booklist) {
        System.out.println("登出");
        Test.setUser(null);
        Test.System();
    }
}
