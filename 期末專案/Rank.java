import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Rank implements IOperation{
    public void work(BookList booklist) {
        ImageIcon icon = new ImageIcon("icon.png"); //jin
        Image image = icon.getImage(); //jin
        Image img = image.getScaledInstance(100,100,Image.SCALE_DEFAULT); //jin
        icon= new ImageIcon(img); //jin
        int [] borrowrank = new int[booklist.getBooks().size()];
        int [] searchrank = new int[booklist.getBooks().size()];
        boolean [] check1 = new boolean[booklist.getBooks().size()];
        boolean [] check2 = new boolean[booklist.getBooks().size()];
        for (int i = 0; i < booklist.getBooks().size(); i++) {
            //通過booklist下標遍歷每一本書
            Book book = booklist.getBooks().get(i);
            borrowrank[i]=book.getBorrow();
            searchrank[i]=book.getSearch();
            check1[i]=false;
            check2[i]=false;
        }
        Arrays.sort(borrowrank);
        Arrays.sort(searchrank);
        String [] bookname1 = new String[3];
        String [] bookname2 = new String[3];
        for(int i=check1.length-1;i>=0;i--){
            Book book = booklist.getBooks().get(i);
            int a=0,b=0;
            for(int j=0;j<booklist.getBooks().size(); j++){
                if(!check1[j]&&borrowrank[i]==book.getBorrow()&&a<3){
                    bookname1[a]=book.getName();
                    check1[j]=true;
                    a++;
                }
                if(!check2[j]&&searchrank[i]==book.getSearch()&&b<3){
                    bookname2[a]=book.getName();
                    check2[j]=true;
                    a++;
                }
            }
        }
        
    }
}
