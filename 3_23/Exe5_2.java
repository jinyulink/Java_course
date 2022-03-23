import java.util.Random;
import java.util.Arrays;
import javax.swing.*;
public class Exe5_2 {
    public static void main(String[] args) {
        Random r = new Random();
        int ret = JOptionPane.showConfirmDialog(null,"開始點名?", "點名" ,JOptionPane.YES_NO_CANCEL_OPTION);
        String student[][] = {{"張仲賢","曾煥傑","蔡舒庭","黃多佳"},{"曾筱媛","何怡璇","王盛禾","詹定學","吳詩彥","黃胤元","林秋香","程子芸","王釋緯","王聖倫"},{"陳明萱","朱巽葦","何孟修","朱芮儀","黃柏翰","黃宇帆","簡宏諭","陳品睿","李倬安","陳芊宇"},{"陳冠銓","黃蘭榛","林翊佳","趙子安","張綺容","吳禹辰","林俊仰","李奕蓁","林楷軒","顏嘉緯"},{"黃道永","張祈安","徐珮馨","魏慈萱","葉鑫旻","劉育嘉","廖紹洋","林均翰","劉浩倫","柯翔閔"},{"陳永軒","林李慶冰","陳升嶸","周宥呈","張宸瑜","陳睿弘","王述函","林冠廷","盧亮澐","朱博脩"},{"郎文伶","謝蕎安","丁予柔","黃冠蓁","李舲熏","周科均","游晴穎","謝維倫","林晉宇","陳莉豐"}};
        int check[][] = new int[7][10];
        for(int i=0;i<7;i++)    Arrays.fill(check[i], 0);
        while(ret == JOptionPane.YES_OPTION){
            int a = r.nextInt(student.length);
            int b = r.nextInt(student[a].length);
            check[a][b]++;
            String d = "點到了 "+student[a][b]+"\n繼續點名嗎?";
            if(check[a][b]>1)   d+="\n(被點名 "+check[a][b]+" 次了)";
            ret = JOptionPane.showConfirmDialog(null, d ,"點名",JOptionPane.YES_NO_CANCEL_OPTION);
        }
    }
}
