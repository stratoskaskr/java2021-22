
 



public class Donator extends User{
	Offers  offersList;
        
        
	Donator()
	{super();
	
        offersList=new Offers();
	}
	
	Donator(String n, String p)
	{super(n,p);
	
        offersList=new Offers();
	}
	
	void add(RequestDonation R)
	{
            offersList.add(R);
	}
	
	void remove(int code)
	{
		offersList.remove(code);
	}
	
	void modify(int code,double q)
	{
		offersList.modify(code, q);
		
	}
	
	void monitor()
        {
		offersList.monitor();
	}
	
	void reset()
	{
		offersList.reset();
	}
	
	void show()
	{
		System.out.println("Name:"+name);
		for (RequestDonation rec: offersList.rdEntities)
			System.out.println("Offer:"+rec.e.getDetails()+" "+rec.quantity);
		
		
	}
	
	void commit(RequestDonationList L)
	{
		offersList.commit(L);
	}
	
}
