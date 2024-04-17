package PR2.tut5;

public class Staff extends person {
    String school;
    double pay;
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.name = name;
        this.address = address;
        this.school = school;
        this.pay = pay;

    }

    public String getschool() {
        return school;
    }
    public void setSchool(String a) {
        this.school = a;
    }
    public double getPay() {
        return pay;
    }
    public void setPay(double b) {
        this.pay = b;
    }
    public String toString(){
        return "Staff[Person[" + this.name + this.address + this.school + this.pay;
    }

}
