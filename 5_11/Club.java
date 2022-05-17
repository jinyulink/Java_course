public class Club {
    private Member ppl [] = new Member[21];
    private int numofppl; //number of people
    public void addMember(Member m){
        if(numofppl<20){
            ppl[numofppl] = m;
            numofppl++;
        }
        else{System.out.println("No more members!");}
    }
    public int totalFees()
    {
        int fees = 0;
        for(int i=0;i<=20;i++){
            if(ppl[i]!=null){
                fees+=ppl[i].getFee();
            }
        }
        return fees;
    }
    public String toString(){
        String s = "";
        for(int i=0;i<=20;i++){
            if(ppl[i]!=null){
                s+=ppl[i].toString();
            }
        }
        return s;
    }
}
