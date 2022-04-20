/*************************************************************************
    > File Name: Special_Ticket.java
    > Author: Jinlk
    > Link:
    > Created Time: Wed Apr 20 23:47:25 2022
 ************************************************************************/
lines (22 sloc)  764 Bytes
   
public class Special_Ticket {
    private int price;
    private int quantity;
    private double discount;

    public Special_Ticket(int p, int q , double d){
        setPrice(p);
        setQuantity(q);
        setDiscount(d);
    }

    public void sales(int q){
        quantity += q;
    }

    public void setPrice(int p){price = p;}
    public int getPrice(){return price;}

    public void setQuantity(int q){quantity = q;}
    public int getQuantity(){return quantity;}

    public void setDiscount(double d){discount = d;}
    public double getDiscount(){return discount;}

    

    public String toString(){
        return "Special ticket 累計銷售金額達 " + getPrice()*getQuantity()*getDiscount() + "元";
    }
}
