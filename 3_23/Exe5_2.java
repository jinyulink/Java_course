import java.util.Random;
import java.util.Arrays;
import javax.swing.*;
public class Exe5_2 {
    public static void main(String[] args) {
        Random r = new Random();
        int ret = JOptionPane.showConfirmDialog(null,"�}�l�I�W?", "�I�W" ,JOptionPane.YES_NO_CANCEL_OPTION);
        String student[][] = {{"�i���","���س�","���ήx","���h��"},{"���N�D","����","������","��w��","�d�֫�","���N��","�L�","�{�l��","�����n","���t��"},{"������","���S��","��s��","��ͺ��","���f��","���t�|","²����","���~��","���Ӧw","��ˡ�t"},{"���a��","�����d","�L����","���l�w","�i���e","�d�ꨰ","�L�T��","�����","�L���a","�C�Žn"},{"���D��","�i��w","�}�\��","�Q�O��","������","�B�|��","���Ьv","�L����","�B�E��","�_���{"},{"���ða","�L���y�B","������","�P�ɧe","�i�f��","���ͥ�","���z��","�L�a��","�c�G�X","���ղ�"},{"����D","���L�w","�B���X","���a�","���W��","�P�짡","�崸�o","�º���","�L�ʦt","������"}};
        int check[][] = new int[7][10];
        for(int i=0;i<7;i++)    Arrays.fill(check[i], 0);
        while(ret == JOptionPane.YES_OPTION){
            int a = r.nextInt(student.length);
            int b = r.nextInt(student[a].length);
            check[a][b]++;
            String d = "�I��F "+student[a][b]+"\n�~���I�W��?";
            if(check[a][b]>1)   d+="\n(�Q�I�W "+check[a][b]+" ���F)";
            ret = JOptionPane.showConfirmDialog(null, d ,"�I�W",JOptionPane.YES_NO_CANCEL_OPTION);
        }
    }
}
