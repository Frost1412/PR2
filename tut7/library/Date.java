package PR2.tut7.library;


/*
 ___________________________________________
|                   Date                    |
 -------------------------------------------
| - date: String                            |
| - day: int                                |
| - month: int                              |
| - year: int                               |
 -------------------------------------------
| + Date(date: String)                      |
| + isLeapYear(year: int): boolean          |
| + isValidDate(date: String): boolean      |
| + after(date: Date): boolean              |
| + toString(): String                      |
 -------------------------------------------

 */

public class Date {
    private String date;
    private int day;
    private int month;
    private int year;
    public Date(String date){

        if(!isValidDate(date)){
            throw new IllegalArgumentException("Invalid day");
        }

        this.date = date;
        this.day = Integer.parseInt(date.substring(0,2));
        this.month = Integer.parseInt(date.substring(3,5));
        this.year = Integer.parseInt(date.substring(6,10));



    }

    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public boolean isValidDate(String date) {
        String regex = "^\\d{2}/\\d{2}/\\d{4}";
        if(date.matches(regex)){

            int day = Integer.parseInt(date.substring(0,2));
            int month = Integer.parseInt(date.substring(3,5));
            int year = Integer.parseInt(date.substring(6,10));


            //check leap year
            int dayOfFeb;
            if(isLeapYear(year)){
                dayOfFeb = 29;
            }
            else{
                dayOfFeb = 28;
            }

            //check day
            switch (month){
//                case 1,3,5,7,8,10,12:
//                    return day <= 31;
                case 1:
                    return day <= 31;
                case 3:
                    return day <= 31;
                case 5:
                    return day <= 31;
                case 7:
                    return day <= 31;
                case 8:
                    return day <= 31;
                case 10:
                    return day <= 31;
                case 12:
                    return day <= 31;
//                case 4,6,9,11:
//                    return day <= 30;
                case 4:
                    return day <= 30;
                case 6:
                    return day <= 30;
                case 9:
                    return day <= 30;
                case 11:
                    return day <= 30;
                case 2:
                    return day <= dayOfFeb;
                default:
                    return false;
            }

        }
        else{
            System.out.println("Can't set date. Wrong format (dd/mm/yyyy)");
            return false;
        }
    }
    public boolean after(Date date) {
        if (this.year != date.year) {
            return this.year > date.year;
        } else if (this.month != date.month) {
            return this.month > date.month;
        } else {
            return this.day > date.day;
        }
    }

    @Override
    public String toString() {
        return "Date{" +
                "date=" + date +"}";
    }
}
