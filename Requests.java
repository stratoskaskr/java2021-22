/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 


public class Requests extends RequestDonationList {
	Requests()
	{
		super();
	}
	
	
	void add(RequestDonation a, Organization o)
	{
		boolean f=false;
		
		
		for (RequestDonation i: rdEntities )
		{
			if(i.isSame(a))
			{
				
				i.quantity=i.quantity+a.quantity;
				f=true;
				break;
			}
		}
		
		if(!f)
		{
			rdEntities.add(a);
		}
	}
	
	void commit( RequestDonationList c)
	{
		for (RequestDonation e : this.rdEntities)
		{
			c.decrease(e);
		}
		this.reset();
		
	}
}
