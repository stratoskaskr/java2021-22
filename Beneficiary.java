/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 

/**
 *
 * @author admin
 */

public class Beneficiary extends User {
	
    // idiotites
    int noPersons;
	RequestDonationList receivedList;
	Requests requestsList;
	
        // kataskevastes
	Beneficiary()
	{super();
		
		noPersons=1;
		receivedList=new RequestDonationList();
		requestsList=new Requests();
	}
	
	Beneficiary(String n, String p)
	{super(n,p);
		
		noPersons=1;
		receivedList=new RequestDonationList();
		requestsList=new Requests();
	}
	
	Beneficiary(String n, String p, int np)
	{super(n,p);
		
		noPersons=np;
		receivedList=new RequestDonationList();
		requestsList=new Requests();
	}
	
        // methodoi
	void show()
	{
		System.out.println("Name:"+name);
		for (RequestDonation rec: receivedList.rdEntities)
			System.out.println("Recieve:"+rec.e.getDetails()+" "+rec.quantity);
	}
	
        
	void commit(RequestDonationList L)
	{
		for (RequestDonation item : this.requestsList.rdEntities)
                    L.add(item);
		
		
		
	}
	
}
