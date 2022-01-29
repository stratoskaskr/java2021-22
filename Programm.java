/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 

/**
 *
 * @author admin
 */
public class Programm {

    /**
     * @param args the command line arguments
     */
  public static void main (String arg[])
	{
		
            
            // orizoume ton organismo kai tous xristew tou
		Organization Organ=new Organization("Org1");

		Organ.setAdmin(new Admin("admin","1111"));
                
                
		Donator d=new Donator("user1","2222");
                
                 Material M[]=new Material[3];
                 Service S[]=new Service[4];
                 
		try {
                    Organ.insertDonator(d);
		}
		catch(myExceptions e)
		{
                    System.out.println(e.getMessage());
		}
                
		Organ.beneficiaryList.add(new Beneficiary("user3","3333"));
		Organ.beneficiaryList.add(new Beneficiary("user4","4444"));
		
               
		M[0]=new Material("m1","mm11",1,5,12,32);
		M[1]=new Material("m2","mm22",2,5,10,32);
		M[2]=new Material("m3","mm33",3,12,12,32);
		
                
		S[0]=new Service("Serv1","Serv1",5);
                S[1]=new Service("Serv2","Serv2",5);
                S[2]=new Service("Serv3","Serv3",4);
                S[3]=new Service("Serv4","Serv4",4);
		
		
		try {
                    for (int i=0;i<3;i++)
                          Organ.addEntity(M[i]);
                    
                    for (int i=0;i<4;i++)
                           Organ.addEntity(S[i]);
                    
		}
		catch(myExceptions e)
		{
			System.out.println(e.getMessage());
		}
		
		Menu mymenu=new Menu(Organ);
		
		System.out.println("Thank you using our services !");
	}
    
}
