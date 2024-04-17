package PR2.tut5;

public class Student extends person {
    String program;
    int year;
    double fee;

    public Student (String name, String address, String program, int year, double fee ) {
        super(name, address);
        this.name = name;
        this.address = address;
        this.program = program;
        this.year = year;
        this.fee = fee;

    }
    public String getProgram(){
        return program;
    }

    public void setProgram(String a) {
        this.program = a;
    }
    public int getYear(){
        return year;

    }
    public void setYear(int b){
        this.year = b;
    }
    public double getFee(){
        return fee;
    }
    public void setFee(Double c) {
        this.fee = c;
    }
    public String toString (){
        return "Student[Person["  + this.address + this.program + this.year + this.fee +"]]";
    }

}
