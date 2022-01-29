 

public class User {

    // idiotites
    String name, phone;
        
        // kataskevastes
	User(){ 
            name=""; phone="";
        }
	
        
	User(String x, String y) { name=x;phone=y;}
	
        // synartiseis set
	void setName(String x)	{ name=x;}
	void setPhone(String x) {phone=x;}
	
        
        //synartiseis get
	String getName() { return name; }
	String getPhone() {return phone;}
}
