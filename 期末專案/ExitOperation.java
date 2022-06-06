
public class ExitOperation implements IOperation {
	public void work(BookList booklist) {
        System.out.println("退出系統");

        System.exit(1); //表示退出系統
    }
}
