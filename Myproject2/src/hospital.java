public class hospital {
    String name;
    int id;
    String address;
    String phone;
    String email;

    public hospital(String name, int id, String address, String phone, String email){
        this.name = name;
        this.id = id;
        this.address = address;
        this.phone = phone;
        this.email = email;

        //add method to print out the information//
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Address: " + address);

    }
}
