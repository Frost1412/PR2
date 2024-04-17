package PR2.tut7.library;


/*
 _______________________________________________
|                  Person                       |
 -----------------------------------------------
| - name: String                                |
| - address: String                             |
 -----------------------------------------------
| + Person()                                    |
| + Person(name: String, address: String)       |
| + getName(): String                           |
| + getAddress(): String                        |
| + setName(name: String): void                 |
| + setAddress(address: String): void           |
| + toString(): String                          |
| - isValidAddress(s: String): boolean          |
 -----------------------------------------------
 */

public class Person {
    private String name;
    private String address;

    public Person() {};
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
    public String getName () {
        return this.name;
    }
    public String getAddress() {
        return this.address;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String s) throws Exception {
        if(isValidAddress(s)){
            this.address = s;
        }
        else{
            throw new Exception("Wrong address format(abc@gmail.com)");
        }

    }
    public String toString() {

        return "Person[name=" + this.name +",address="+this.address+"]";
    }

    public boolean isValidAddress (String s) {
        return s.endsWith("@gmail.com");
    }

}
