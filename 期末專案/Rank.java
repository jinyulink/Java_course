import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.lang.Math;

public class Rank implements IOperation{
    public void work(BookList booklist) {
        ImageIcon icon = new ImageIcon("icon.png"); //jin
        Image image = icon.getImage(); //jin
        Image img = image.getScaledInstance(100,100,Image.SCALE_DEFAULT); //jin
        icon= new ImageIcon(img); //jin
        
        String borone="null";
        int boronee=0;
        String bortwo="null";
        int bortwoo=0;
        String borthree="null";
        int borthreee=0;
        String serone="null";
        int seronee=0;
        String sertwo="null";
        int sertwoo=0;
        String serthree="null";
        int serthreee=0;
        int borcheck[]=new int[booklist.getBooks().size()];
        int sercheck[]=new int[booklist.getBooks().size()];
        for (int i = 0; i < booklist.getBooks().size(); i++) {
            Book book = booklist.getBooks().get(i);
            borcheck[i]=book.getBorrow();
            sercheck[i]=book.getSearch();
        }
        Arrays.sort(borcheck);
        Arrays.sort(sercheck);
        for (int i = 0; i < booklist.getBooks().size(); i++) {
            //通過booklist下標遍歷每一本書
            Book book = booklist.getBooks().get(i);
            boronee=Math.max(boronee,book.getBorrow());
            if(boronee==book.getBorrow()&&book.getBorrow()!=0){
                borone=book.getName();
            }
            seronee=Math.max(seronee,book.getSearch());
            if(seronee==book.getSearch()&&book.getSearch()!=0){
                serone=book.getName();
            }
        }
        for (int i = 0; i < booklist.getBooks().size(); i++) {
            //通過booklist下標遍歷每一本書
            Book book = booklist.getBooks().get(i);
            if(book.getBorrow()>=bortwoo&&book.getBorrow()<=boronee&&book.getBorrow()==borcheck[booklist.getBooks().size()-2]&&book.getBorrow()!=0&&book.getName()!=borone){
                bortwo=book.getName();
                bortwoo=book.getBorrow();
            }
            if(book.getSearch()>=sertwoo&&book.getSearch()<=seronee&&book.getSearch()==sercheck[booklist.getBooks().size()-2]&&book.getSearch()!=0&&book.getName()!=serone){
                sertwo=book.getName();
                sertwoo=book.getSearch();
            }
        }
        for (int i = 0; i < booklist.getBooks().size(); i++) {
            //通過booklist下標遍歷每一本書
            Book book = booklist.getBooks().get(i);
            if(book.getBorrow()>=borthreee&&book.getBorrow()<=bortwoo&&book.getBorrow()==borcheck[booklist.getBooks().size()-3]&&book.getBorrow()!=0&&book.getName()!=borone&&book.getName()!=bortwo){
                borthree=book.getName();
                borthreee=book.getBorrow();
            }
            if(book.getSearch()>=serthreee&&book.getSearch()<=sertwoo&&book.getSearch()==sercheck[booklist.getBooks().size()-3]&&book.getSearch()!=0&&book.getName()!=serone&&book.getName()!=sertwo){
                serthree=book.getName();
                serthreee=book.getSearch();
            }
        }

        JLabel ll = new JLabel("排行榜\n\n借閱排行榜:");
        ll.setFont(new Font("MV Boil",Font.BOLD,15));
        JLabel ll1 = new JLabel("\n1."+borone+" 次數:"+boronee);
        ll1.setFont(new Font("MV Boil",Font.BOLD,15));
        JLabel ll2 = new JLabel("\n2."+bortwo+" 次數:"+bortwoo);
        ll2.setFont(new Font("MV Boil",Font.BOLD,15));
        JLabel ll3 = new JLabel("\n3."+borthree+" 次數:"+borthreee);
        ll3.setFont(new Font("MV Boil",Font.BOLD,15));
        JLabel ll4 = new JLabel("\n\n搜尋排行榜:");
        ll4.setFont(new Font("MV Boil",Font.BOLD,15));
        JLabel ll5 = new JLabel("\n1."+serone+" 次數:"+seronee);
        ll5.setFont(new Font("MV Boil",Font.BOLD,15));
        JLabel ll6 = new JLabel("\n2."+sertwo+" 次數:"+sertwoo);
        ll6.setFont(new Font("MV Boil",Font.BOLD,15));
        JLabel ll7 = new JLabel("\n3."+serthree+" 次數:"+serthreee);
        ll7.setFont(new Font("MV Boil",Font.BOLD,15));
                    Object[] fieldf = {
                        ll,
                        ll1,
                        ll2,
                        ll3,
                        ll4,
                        ll5,
                        ll6,
                        ll7
                    };

        int number = JOptionPane.showConfirmDialog(null,fieldf,"會員界面",JOptionPane.DEFAULT_OPTION,0,icon);
        if(number==JOptionPane.OK_OPTION){;} //jin
        else if(number==JOptionPane.CLOSED_OPTION){System.exit(0);} //jin
    }
}
