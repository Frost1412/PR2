package PR2.tut5;

public class person {
    String name;
    String address;

    public person(String name, String address) {
        this.name = name;
        this.address = address;

    }
    public String getname() {
        return this.name;
    }
    public String getAddress() {
        return this.address;
    }
    public void setAddress(String b){
        this.address = b;
    }

    public String toString() {
        return name + address + this.address;
    }

}
