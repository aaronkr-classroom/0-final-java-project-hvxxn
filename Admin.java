public class Admin extends person {
    private String id = "Admin";
    private String password =  "Admin1234";

    public Admin(String name, int phone) {
        super(name, phone);
    }
    public String getId() {
        return id;
    }
     public String getPassword() {
        return password;
     }
}
