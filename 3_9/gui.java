import javax.swing.JOptionPane;
import java.util.Random;
public class gui {
    public static void main(String[] args){
        String input = JOptionPane.showInputDialog(null, "��J�@�p��11�j��1�������:", "��J", 3);
        int a = Integer.parseInt(input);
        Random rand = new Random();
        String ans="";
        for(int i = 1;i<=a;i++){
            for(int j=1;j<=a;j++){
                ans+=rand.nextInt(a);
            }
            ans+='\n';
        }
        JOptionPane.showMessageDialog( null, ans );
    }
}
