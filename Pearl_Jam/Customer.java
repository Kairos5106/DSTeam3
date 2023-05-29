package Pearl_Jam;

public class Customer {
    private String nameCustomer;
    private int age;
    private String gender;
    private String order;

    // constructor method
    public Customer() {
        nameCustomer = null;
        age = 0;
        gender = null;
        order = null;
    }

    public Customer(String nameCustomer, int age, String gender, String order) {
        this.nameCustomer = nameCustomer;
        this.age = age;
        this.gender = gender;
        this.order = order;
    }

    // accessor methods
    public String getNameCustomer() {
        return nameCustomer;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getOrder() {
        return order;
    }

    // mutator methods
    public void setnameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setOrder(String order) {
        this.order = order;
    }
}
