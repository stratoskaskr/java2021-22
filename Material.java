/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 

public class Material extends Entity{
	double level1,level2, level3;
	
	Material(String n,String d,int id,double l1,double l2,double l3)
	{
		super(n,d,id);
		level1=l1;
		level2=l2;
		level3=l3;
				
	}
	
	String getDetails() {
            String a="Details:"+getInfo();
            
            String b="\nLevels: "+level1+","+level2+","+level3;
                   
		return a+b;
	}
}
