/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 


public class Admin extends User {
// idiotites	
    boolean isAdmin=true;
    
    // kataskevastis
    Admin() {  super(); }
	
	Admin(String x,String y){super(x,y); }
	
        // synartiseis set
	void set_not_Admin()
        { 
            isAdmin=false; 
        }
	
        void set_as_Admin()
        { 
            isAdmin=true;
        }
        
        // synartiseis get
	boolean getStatus() { return isAdmin; }

}
