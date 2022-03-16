import javax.swing.JOptionPane;
import java.util.*;
public class Assignment {
    public static void main(String[] args) {
        int ret = JOptionPane.showConfirmDialog(null,"開始玩迷你樂透?", "選取一個選項" ,JOptionPane.YES_NO_CANCEL_OPTION);
        if(ret == JOptionPane.YES_OPTION)   roll();
        System.exit(0);
    }
    public static void roll(){
        Random r = new Random();
        String input1 = JOptionPane.showInputDialog(null,"請押第一個數字(1-6 含1或6):");
        int num1 = Integer.parseInt(input1);
        String input2 = JOptionPane.showInputDialog(null,"請押第一個數字(1-6 含1或6):");
        int num2 = Integer.parseInt(input2);
        int j1 = r.nextInt(6)+1;
        int j2 = r.nextInt(6)+1;
        while(j2==j1)   j2 = r.nextInt(6)+1;
        String res = "中獎號碼 :";
        res += j1 + " " + j2 + "\n" + "你的選號 :" + num1 + " " + num2 + "\n";
        if(j1==num1&&j2==num2)  res += "頭彩";
        else if(j2==num1&&j1==num2) res += "頭彩";
        else if(j1==num1||j2==num2) res += "第二獎";
        else if(j2==num1||j1==num2) res += "第二獎";
        else    res += "銘謝惠顧!";
        JOptionPane.showMessageDialog(null,res);
    }
}
