/*************************************************************************
    > File Name: Regular_Ticket.java
    > Author: Jinlk
    > Link:
    > Created Time: Wed Apr 20 23:40:32 2022
 ************************************************************************/
public class Regular_Ticket{
	private int price,quantity;

	public Regular_Ticket(int p,int s){
		setprice(p);
		setsales(s);
	}
	public void setprice(int p){
		price=p;
	}
	public void setsales(int s){
		quantity=s;
	}
	public void sales(int a){
		quantity+=a;
	}
	public String toString(){
		return "Regular Ticket 累積銷售金額達"+this.price*this.quantity+"元";
	}
}
