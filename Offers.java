/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 



public class Offers extends RequestDonationList {
	Offers()
	{
		super();
	}
	
	void commit(RequestDonationList L)
	{
		for (RequestDonation x : this.rdEntities) L.add(x);
		this.reset();
	}
}
