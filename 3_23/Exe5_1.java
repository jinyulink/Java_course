import java.util.Random;
public class Exe5_1 {
    public static void main(String[] args){
        int[] lotto = new int[6];
        Random rand = new Random();
        for(int i=0;i<lotto.length;i++){
            lotto[i] = rand.nextInt(42)+1;
        }
    }
}
