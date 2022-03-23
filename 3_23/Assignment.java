import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class Assignment{    
    public static void main(String[] args){
      Scanner s = new Scanner(System.in); 
      int [] play = new int[6];

      System.out.println("請投注六個不同的號碼(1~42)並以空格隔開 \n玩家不需自己將號碼由小至大排列： ");

      for(int i=0; i<6; i++){ play[i] = s.nextInt(); }
      Arrays.sort(play);

      int [] lotto = draw();
      check(play, lotto);

    }    

    public static int[] draw(){ 
        Random r = new Random();
        int [] lotto = new int[6];
        int temp=0;
        for(int i=0; i<lotto.length;i++){ 
            do{
                temp=r.nextInt(9)+1;
            }while(Arrays.binarySearch(lotto,temp)>=0);
            lotto[0]=temp;
            Arrays.sort(lotto);
        }
        return lotto;
     }

    public static void check(int player[], int lotto[]){
        System.out.print("Lotto numbers: ");
        for(int i=0;i<lotto.length;i++){ 
            System.out.printf("%d ",lotto[i]);
        }
        System.out.println();
        System.out.print("Your numbers: ");
        for(int i=0;i<player.length;i++){ 
            System.out.printf("%d ",player[i]);
        }
        System.out.println();
        int same = 0;
        for(int i=0; i<lotto.length;i++){ 
            for(int j=0;j<lotto.length;j++){
                if(lotto[i] == player[j])   {same++;break;}
            }
        }
        if(same==6) System.out.println("JACKPOT!");
        else if(same==5)    System.out.println("二獎!");
        else if(same==4) System.out.println("三獎!");
        else if(same==3) System.out.println("四獎!");
        else    System.out.println("銘謝惠顧，下次再來!");
    }
}