/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 


import java.util.ArrayList;
public class Organization {
	String name;
        
	Admin admin=null;
	
        ArrayList<Entity> entityList;
	ArrayList<Donator> donatorList;
	ArrayList<Beneficiary>   beneficiaryList;
	
        RequestDonationList currentDonations;
	
	Organization(String n)
	{
		name=n;              
		entityList=new ArrayList<Entity>();
		donatorList=new ArrayList<Donator>();
		beneficiaryList=new ArrayList<Beneficiary>();
		currentDonations=new RequestDonationList();
		
		
	}
	
	void setAdmin(Admin myadm)	{admin=myadm;}
	
	Admin getAdmin(){return admin;	}
	
	void addEntity(Entity e) throws myExceptions
	{
		for (Entity i: entityList)
			if(i.id==e.id)	throw new myExceptions("This Entity Exists");
		entityList.add(e);
		
	}
	
	void removeEntity(Entity e) throws myExceptions
	{
		for (Entity i: entityList)
		{
			if(i.id==e.id){
				entityList.remove(i);
				return ;
			}
		}
		throw new myExceptions("This Entity not Exists");
		
	}
	
	void insertDonator(Donator e) throws myExceptions
	{
		for (Donator i: donatorList)
		{
			if(i.name.equals(e.name))
				throw new myExceptions("This Donator Exists");
		}
		donatorList.add(e);
		
	}
	
	
	void removeDonator(Donator e) throws myExceptions
	{
		for (Donator i: donatorList)
		{
			if(i.name.equals(e.name))
			{
				donatorList.remove(i);
				return;
			}
		}
		
		throw new myExceptions("This Donator not Exists");
	}
	
	void insertBeneficiary(Beneficiary e) throws myExceptions
	{
		for (Beneficiary i: beneficiaryList)
		{
			
			if(i.name.equals(e.name))
				throw new myExceptions("This Beneficiary Exists");
			
		}
		beneficiaryList.add(e);
	}
	
	void removeBeneficiary(Beneficiary e) 
	{
		for (Beneficiary i:  beneficiaryList)
		{
			if(i.name.equals(e.name))
			{
				beneficiaryList.remove(i);
				break;
			}
		}
		
		
	}
	
	void listEntities()
	{
		System.out.println("Entities");
                 System.out.println("-------------------------");
		for (Entity i :  entityList)
			i.getDetails();
	}
	
	
	void listMaterials()
	{
            int AA=0;
		System.out.println("List of Materials");
                 System.out.println("-------------------------");
		
		for (Entity i :  entityList)
		{	
			
			if(i instanceof Material) {
			System.out.println(AA+"."+i.getDetails());
			
			}
			AA++;
		}
	}
	
	void listServices()
	{
		
		int AA=0;
                System.out.println("List of Services");
                System.out.println("-------------------------");
		for (Entity i :  entityList)
		{	
			if(i instanceof Service)
                        
				System.out.println(AA+". "+i.getDetails());
				
			AA++;
			
		}
	}
	
	void listBeneficiaries()
	{
	    int AA=0;
		System.out.println("List of Beneficiaries:");
		System.out.println("-------------------------");
		for (Beneficiary b:beneficiaryList )
                {
			System.out.println(AA+". "+b.getName());
			AA++;
                }
	}
	
	void listDonators()
	{
		int AA=0;
		System.out.println("List of Donators:");
		System.out.println("-----------------");
		for (Donator d:donatorList )
		{
			System.out.println(AA+"."+d.getName());
			AA++;
		}
	}
}

