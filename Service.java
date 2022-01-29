/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 


public class Service extends Entity{
	Service(String n, String d, int id ){super(n,d,id);}
	
	String getDetails() {
           
		return "Details:"+getInfo()+" -- Is Service \n";
	}
}
