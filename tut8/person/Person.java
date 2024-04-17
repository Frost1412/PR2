package PR2.tut8.person;

import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Person {
    private int id;
    private String name;
    private String dateOfBirth;
    private String email;
    private String tel;
    private String address;



    public Person (int id, String name, String dateOfBirth) {
        if(validateid(id)) {
            this.id = id;
        } else {
            throw new RuntimeException("id khong hop le");
        }


        if(validateName(name)) {
            this.name = name;
        } else {
            throw new RuntimeException("Ten khong hop le");
        }
        this.dateOfBirth = dateOfBirth;

        if(validateDOB(dateOfBirth)) {
            this.dateOfBirth = dateOfBirth;
        } else {
            throw new RuntimeException("Ngay sinh hop le");
        }
    }


    private boolean validateid(int id) {
        return id >1;
    }

    private boolean validateName(String name) {
        return name.length() < 50;
    }

    private boolean validateDOB(String dateOfBirth) {
        return dateOfBirth.length() <= 10;
    }


    private boolean validatemail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches() &&  email.length() <40;
    }
    private void setemail(String email) {
        if(validatemail(email)) {
            this.email = email;
        } else {
            throw new RuntimeException("Email sai r bn a");
        }
    }

    public String getEmail () {
        return email;
    }


    private boolean validatetel(String tel) {
        String phoneRegex = "^\\d{10}$"; // Assuming phone number is a 10-digit number
        Pattern pattern = Pattern.compile(phoneRegex);
        Matcher matcher = pattern.matcher(tel);
        return matcher.matches() && tel.length() < 12;

    }
    private void settel(String tel) {
        if(validatetel(tel)) {
            this.tel = tel;
        } else {
            throw new RuntimeException("Day ma la so dien thoai a?");
        }
    }

    private String getTel () {
        return tel;
    }

    private boolean validateadd(String address) {
        return address.length() < 60;
    }
    private void setadd(String address) {
        if(validateadd(address)) {
            this.address = address;
        } else {
            throw new RuntimeException("Day ma la dia chi a?");
        }
    }

    private String getadd(){
        return address;
    }

    public String getName() {
        return name;
    }
    public String getDateOfBirth() {
    return dateOfBirth;

}

    public static class SortByName implements Comparator<Person> {
        @Override
        public int compare(Person p1, Person p2) {
            return p1.getName().compareTo(p2.getName());
        }
    }

//    public static class SortByAge implements Comparator<Person> {
//        @Override
//        public int compare(Person p1, Person p2) {
//            SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMyyyy");
//            try {
//                Date dob1 = dateFormat.parse(p1.getDateOfBirth());
//                Date dob2 = dateFormat.parse(p2.getDateOfBirth());
//
//                // Calculate age difference
//                long ageDifference = dob1.getTime() - dob2.getTime();
//                long yearsDifference = ageDifference / (1000L * 60 * 60 * 24 * 365);
//
//                // Compare ages
//                if (yearsDifference < 0) {
//                    return -1; // p1 is younger
//                } else if (yearsDifference > 0) {
//                    return 1; // p1 is older
//                } else {
//                    return 0; // p1 and p2 have the same age
//                }
//            } catch (ParseException e) {
//                e.printStackTrace();
//                return 0; // Handle parsing exception gracefully
//            }
        }


//    }
//}

