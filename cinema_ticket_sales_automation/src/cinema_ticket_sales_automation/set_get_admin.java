package cinema_ticket_sales_automation;

public class set_get_admin {
    
    private String username, password;
    
    public String getUsername(){
        return username;
    }
    
    public String get2Password(){
        return password;
    }
    
    public void setUsername(String usr){
        this.username = usr;
    }

    public void setUsername(String usr, String other){
        System.out.println("Overloading.");
    }    
    
    public void setPassword(String pass){
        this.password = pass;
    }
    
    public void setPassword(String pass, String other){
        System.out.println("Overloading.");
    }
}
