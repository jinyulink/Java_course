public class MemberManager{
    public static void main(String [] args){
    Member m [] = new Member [5];
    m[0] = new Member("Lee", 50000);
    m[1] = new Member("Wang", 30000);
    m[2] = new Member("Chen", 80000);
    m[3] = new Member("Wu", 40000);
    m[4] = new Member("Lin", 40000);
    String output="";//儲存所有會員資訊
    double total = 0.0; // for total fees
    for(int i=0; i<m.length; i++){
        output += m[i].toString()+"\n";
        total += m[i].payFee();
        }
        System.out.println(output);
        System.out.println("The total membership fees are: "+total);
    }
}
    