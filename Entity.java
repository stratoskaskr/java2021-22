/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 


public abstract class Entity {
        int id;
	String name, descr;
	
        // kataskevastes
	Entity(String nm, String dsc, int code)
	{
            id=code;
            name=nm;
            descr=dsc;
		
	}
	
        
	String getInfo() {
            return "Name="+name+" Description="+descr+" Id="+id;
	    }
        
	String getDetails() {
                
		return "Info:\n"+getInfo();
	}
	
	boolean isSame(Entity a)
	{
		return (this.id==a.id);
			
	}
        
        @Override
	public String toString() {
		return getDetails();
	}
}
