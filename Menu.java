/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 

import java.util.Scanner;  
public class Menu {
	
       
	Beneficiary userBnf;	
        Donator userdntr; 
        Admin useradmin;
	Organization Org;
        
        
        Scanner from_keyboard = new Scanner(System.in);
    
	Menu(Organization organ)
	{
		this.Org=organ;
		while(true)
		{
		
			System.out.println("Give phone:");
			String p=from_keyboard.nextLine();
			
			int flag=0;
			if(Org.admin.getPhone().equals(p) )
			{
				 flag=1;
				useradmin=Org.admin;
				
			}
			if( flag==0)
			for (Beneficiary u : Org.beneficiaryList)
			{
				if (u.getPhone().equals(p))
				{
					userBnf=u;
					 flag=2;
				}
			}
			if( flag==0)
			for (Donator u : Org.donatorList)
				{
					if (u.getPhone().equals(p))
					{
						userdntr=u;
						 flag=3;
					}
				}
			
			if(flag==0)
			{
				System.out.println("DRegistration (y/n)?");
				String answer=from_keyboard.nextLine();
				if(answer.equals("y"))
				{
					System.out.println("Select 1. as Donator, 2. as Beneficiary:");
					String ans2=from_keyboard.nextLine();
					
					if(ans2.equals("1"))
					{
						System.out.println("Give Name:");
						String n=from_keyboard.nextLine();
						
						Donator d=new Donator(n,p);
						try {
						Org.insertDonator(d);
						
						userdntr=d;
						}
						catch(myExceptions e)
						{
							System.out.println(e.getMessage());
						}
					}
					if(ans2.equals("2"))
					{
						System.out.println("Give Name:");
						String n=from_keyboard.nextLine();
						
						System.out.println("Number of person:");
						int np=Integer.parseInt(from_keyboard.nextLine());
						try {
						Beneficiary d=new Beneficiary(n,p,np);
						
						Org.insertBeneficiary(d);
						userBnf=d;
						}
						catch(myExceptions e)
						{
						System.out.println(e.getMessage());
						}
					}
					
				}
				else
				{
					System.out.println("Error !! Try to Login!");
					
				}
			}
			
			
				if(flag==1) menua();
				
				if(flag==2) menub();
				
				if(flag==3) menud();
					
		}
		
	}
	
	void menua()
	{
		System.out.println("Hello you are admin");
                
		while(true)
		{
		String memu_list=" 1.View \n 2.Monitor \n 3.Back \n 4.Logout \n 5.Exit ";
		System.out.println(memu_list);
		
		System.out.print(":");
                
		String choice1=from_keyboard.nextLine();
		if(choice1.equals("1"))
		{
                        String memu_list2="1. Material\n 2.Services\n 3. Back";
			System.out.println(memu_list2);
			String choice2=from_keyboard.nextLine();
                        
			if(choice2.equals("1"))
			{
				Org.listMaterials();
				System.out.println("Object Number:");
                                
				String nn=from_keyboard.nextLine();
				
                                int code1=Integer.parseInt(nn);
				
                                System.out.println(Org.entityList.get(code1).getDetails());
				
			}
                        
			if(choice2.equals("2"))
			{
				Org.listServices();
                                
				System.out.println("Object Number:");
				
                                String code2=from_keyboard.nextLine();
				int c2=Integer.parseInt(code2);
                                
				System.out.println(Org.entityList.get(c2).getDetails());
			}
			
		}
                
                
		if(choice1.equals("2"))
		{
                    String memu_list2="1. List Beneficiaries\n 2.List Donators\n 3. Reset Beneficiaries Lists\n 4. Back\n";
			System.out.println(memu_list2);
			String choice2=from_keyboard.nextLine();
			
			if(choice2.equals("1"))
			{
				Org.listBeneficiaries();
				System.out.println("Give Choice:");
                                
				String ans3=from_keyboard.nextLine();
				
                                int ch4=Integer.parseInt(ans3);
                                
                                
				Org.beneficiaryList.get(ch4).show();
				
			}
			if(choice2.equals("2"))
			{
				Org.listDonators();
				System.out.println("Give Choice:");
				String ans4=from_keyboard.nextLine();
                                
				int ch5=Integer.parseInt(ans4);
				Org.donatorList.get(ch5).show();
			}
			if(choice2.equals("3"))
			{
				Org.beneficiaryList.clear();
				System.out.println("Beneficiearies Reset!");
			}
			
		}
		
		
		if(choice1.equals("4")||choice1.equals("3"))
		{
			return;
		}
		
		
		if(choice1.equals("5"))
		{
			
			System.exit(1);
		}
		
		
		}
		
	}
	
	void menub()
	{
		System.out.println("Beneficiary Enviroment");
		while(true)
		{
	             
                String memu_list="1. Add Request\n 2. Show Requests\n 3. Commit\n 4. Logout\n 5. Εxit\n";
		System.out.println(memu_list);
		
		System.out.print("Choice:");
		String choice1=from_keyboard.nextLine();
		
		if(choice1.equals("1"))
		{
			System.out.println("1. Material\n 2.Services\n 3. Back");
			String choice2=from_keyboard.nextLine();
			if(choice2.equals("1"))
			{
				Org.listMaterials();
				System.out.println("Object Number:");
				String obn=from_keyboard.nextLine();
				int l=Integer.parseInt(obn);
                                
                                
				System.out.println(Org.entityList.get(l).getDetails());
				System.out.println("Do you want to offer (y/n)?");
				
                                String answer=from_keyboard.nextLine();
				if(answer.equals("y"))
				{
					System.out.println("Give quantity:");
					int qt=Integer.parseInt(from_keyboard.nextLine());
				
                                        Material m=(Material) Org.entityList.get(l);
					
                                        RequestDonation rq=new RequestDonation(m,qt);
					userBnf.requestsList.add(rq);
					
				}
			}
			if(choice2.equals("2"))
			{
				Org.listServices();
				System.out.println("Object Number:");
				String obn=from_keyboard.nextLine();
				int l=Integer.parseInt(obn);
				System.out.println(Org.entityList.get(l).getDetails());
				System.out.println("Do you want to offer (y/n)?");
				String answer=from_keyboard.nextLine();
				if(answer.equals("y"))
				{
					System.out.println("Give quantity:");
					int Q=Integer.parseInt(from_keyboard.nextLine());
					Service s=(Service) Org.entityList.get(l);
					RequestDonation rq=new RequestDonation(s,Q);
					userBnf.requestsList.add(rq);
					
				}
			}
			
		}
		
		if(choice1.equals("2"))
		{
			if (userBnf.requestsList.rdEntities.isEmpty())
				System.out.println("There is not any Requests");
			else
			{
				userdntr.offersList.monitor();
				System.out.println("Request number:");
				int p=Integer.parseInt(from_keyboard.nextLine());
                                
                                
				System.out.println("1.Delete\n 2.Modity\n 3. Delete All\n 4. Back");
				String choice2=from_keyboard.nextLine();
				if(choice2.equals("1")) {
					userBnf.requestsList.remove(p);
					
					System.out.println("Record Deleted");
				}
				if(choice2.equals("2")) {
					System.out.println("New Quantity:");
					int nq=Integer.parseInt(from_keyboard.nextLine());
					userBnf.requestsList.modify(userdntr.offersList.get(p).e.id, nq);
				}
				if(choice2.equals("3")) {
					
					userBnf.requestsList.reset();
					System.out.println("All Entries Deleted");
				}
			}
		}
		if(choice1.equals("3"))
		{
			userBnf.requestsList.commit(Org.currentDonations);
		}
		
		if(choice1.equals("4"))
		{
			return;
		}
		
		if(choice1.equals("5"))
		{
			System.out.println("Thank you...");
			System.exit(1);
		}
		
		
		}
	}
	
	void menud()
	{
		System.out.println("Hello you are Donator");
		while(true)
		{
		String memu_list="1. Add Offer\n2. Show Offers\n3. Commit\n4. Back\n5. Logout\n6. Εxit ";
		System.out.println(memu_list);
		System.out.print("Choice:");
		String choice1=from_keyboard.nextLine();
		if(choice1.equals("1"))
		{
			System.out.println("1. Material\n 2.Services\n 3. Back");
			String y=from_keyboard.nextLine();
			if(y.equals("1"))
			{
				Org.listMaterials();
				System.out.println("Object Number:");
				String no=from_keyboard.nextLine();
				int l=Integer.parseInt(no);
				System.out.println(Org.entityList.get(l).getDetails());
				System.out.println("Do you want to make an offer (y/n)?");
				String answer=from_keyboard.nextLine();
				if(answer.equals("y"))
				{
					System.out.println("Give quantity:");
					int p=Integer.parseInt(from_keyboard.nextLine());
					Material m=(Material) Org.entityList.get(l);
					RequestDonation rq=new RequestDonation(m,p);
					userdntr.add(rq);
					
				}
				
			}
			if(y.equals("2"))
			{
				Org.listServices();
				System.out.println("Object Number:");
				String no=from_keyboard.nextLine();
				int l=Integer.parseInt(no);
				System.out.println(Org.entityList.get(l).getDetails());
				System.out.println("Do you want to make an offer (y/n)?");
				String answer=from_keyboard.nextLine();
				if(answer.equals("y"))
				{
					System.out.println("Give quantity:");
					int Q=Integer.parseInt(from_keyboard.nextLine());
					Service s=(Service) Org.entityList.get(l);
					RequestDonation rq=new RequestDonation(s,Q);
					userdntr.add(rq);
					
				}
			}
		
			
		}
		
		if(choice1.equals("2"))
		{
			if (userdntr.offersList.rdEntities.isEmpty())
				System.out.println("There are not any Offers");
			else
			{
				userdntr.offersList.monitor();
				System.out.println("Offer Number:");
				int p=Integer.parseInt(from_keyboard.nextLine());
				System.out.println("1.Delete\n 2.Modity\n 3. Delete All\n 4. Back");
				String no=from_keyboard.nextLine();
				if(no.equals("1")) {
					userdntr.offersList.remove(p);
					System.out.println("Offer Deleted");
				}
				if(no.equals("2")) {
					System.out.println("Give new quantity:");
					int p2=Integer.parseInt(from_keyboard.nextLine());
					userdntr.offersList.modify(userdntr.offersList.get(p).e.id, p2);
				}
				if(no.equals("3")) {
					
					userdntr.offersList.reset();
					System.out.println("All Offers Deleted");
				}
			}
			
			
		}
		if(choice1.equals("3"))
		{
			userdntr.commit(Org.currentDonations);
		}
		
		
		if(choice1.equals("4") || choice1.equals("5"))
		{
			return;
		}
		
		
		if(choice1.equals("6"))
		{
			System.out.println("Thank you");
			System.exit(1);
		}
		
		}
		
	}
	
	
	

	

}
