 

public class RequestDonation {
	Entity e;
	double quantity;
	
	RequestDonation(Entity x,double y)
	{e=x; quantity=y;}
	
	boolean isSame(RequestDonation R)
	{  return (this.e.id==R.e.id); }
}
