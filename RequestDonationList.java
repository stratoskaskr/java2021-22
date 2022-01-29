/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 


import java.util.ArrayList;
public class RequestDonationList {
	ArrayList<RequestDonation> rdEntities ;
	
	RequestDonationList()
	{
		rdEntities=new ArrayList<RequestDonation>();
	}
	RequestDonation get(int id)
	{
		
		for (RequestDonation x: rdEntities )
			if(x.e.id==id) return x;
				
		return null;
	}
	
	void add(RequestDonation x)
	{
		for (RequestDonation r: rdEntities )
		{	if(r.isSame(x))
			{
				r.quantity=r.quantity+x.quantity;
				return;
			}
		}
		rdEntities.add(x);
		
	}
	
	void decrease(RequestDonation x)
	{
		for (RequestDonation r: rdEntities )
		{	if(r.isSame(x))
			{
				r.quantity=r.quantity-x.quantity;
				return;
			}
		}
		
		
	}
	
	void remove(int id)
	{
		
		RequestDonation x=null;
		for (RequestDonation r: rdEntities )
		{
			if(r.e.id==id)
			{
				x=r;
                                break;
			}
		}
		if(x!=null)rdEntities.remove(x);
		
	}
	
	void modify(int id,double q)
	{
		RequestDonation x=null;
		for (RequestDonation i: rdEntities )
		{
			if(i.e.id==id)
			{
				x=i;
				break;
			}
		}
		
		if(x!=null) x.quantity=q;
		
	}
	
	void monitor()
	{
		int AA=0;
                String tmp="";
		for (RequestDonation i: rdEntities )
		{
                        tmp+=AA+". ";
                        tmp+=i.e.toString()+"\n";
                        tmp+="Quantity:\n"+i.quantity;
			
			AA++;
		}
                System.out.println(tmp);
	}
	
	void reset(){ rdEntities.clear();}
	
	
}
