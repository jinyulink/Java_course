import javax.swing.JOptionPane;
import java.util.*;
public class Assignment {
    public static void main(String[] args) {
        int ret = JOptionPane.showConfirmDialog(null,"�}�l���g�A�ֳz?", "����@�ӿﶵ" ,JOptionPane.YES_NO_CANCEL_OPTION);
        if(ret == JOptionPane.YES_OPTION)   roll();
        System.exit(0);
    }
    public static void roll(){
        Random r = new Random();
        String input1 = JOptionPane.showInputDialog(null,"�Щ�Ĥ@�ӼƦr(1-6 �t1��6):");
        int num1 = Integer.parseInt(input1);
        String input2 = JOptionPane.showInputDialog(null,"�Щ�Ĥ@�ӼƦr(1-6 �t1��6):");
        int num2 = Integer.parseInt(input2);
        int j1 = r.nextInt(6)+1;
        int j2 = r.nextInt(6)+1;
        while(j2==j1)   j2 = r.nextInt(6)+1;
        String res = "�������X :";
        res += j1 + " " + j2 + "\n" + "�A���︹ :" + num1 + " " + num2 + "\n";
        if(j1==num1&&j2==num2)  res += "�Y�m";
        else if(j2==num1&&j1==num2) res += "�Y�m";
        else if(j1==num1||j2==num2) res += "�ĤG��";
        else if(j2==num1||j1==num2) res += "�ĤG��";
        else    res += "���´f�U!";
        JOptionPane.showMessageDialog(null,res);
    }
}
