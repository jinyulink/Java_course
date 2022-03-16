import javax.swing.JOptionPane;
public class Exe4_2 {
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog(null,"enter a sentence:");
        System.out.printf("The length of the sentence: %d\n",s.length());
        System.out.printf("The number of times \'A\' is found: %d",countA(s));
    }
    public static int countA(String s){
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'){
                count++;
            }
        }
        return count;
    }
}
