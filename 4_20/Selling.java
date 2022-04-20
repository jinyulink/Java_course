public class Selling{
	public static void main(String [] args){
		Regular_Ticket r = Regular_Ticket(100,0);
		Special_Ticket s = Special_Ticket(100,0,0.6);

		s.sales(10);
		s.sales(5);
		r.sales(3);
		r.sales(2);

		System.out.println(r);
		System.out.println(s);
	}
}
