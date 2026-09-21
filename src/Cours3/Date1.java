package Cours3;
import java.time.LocalDate;


public class Date1 {
    private int day,month,year;
    private final static String[] DAYS_N = new String[]{"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
    private final static String[] MONTH_N = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    public final static int[] DAYS_IN_MONTH = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};


    public Date1(int day,int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public Date1(){
        LocalDate today = LocalDate.now();
        int cday = today.getDayOfMonth();
        int cmonth= today.getMonthValue();
        int cyear = today.getYear();
        this(cday,cmonth,cyear);
    }

    public void setDay(int day) {
        if(day <32 && day > 0)
            this.day = day;
        else
            throw new RuntimeException("Incorrect date");
    }

    public void setMonth(int month){
        if(month < 0 || month > 12 || this.day>DAYS_IN_MONTH[month-1]) {
            throw new RuntimeException("Incorrect month");
        }else
            this.month = month;
    }

    public void setYear(int year){
        if(isLeapYear(this.year) && this.day == 29 && this.month==2 && !isLeapYear(year)){
            throw new RuntimeException("You cannot put a no-bissexil year on a bissexil date");
        }
        this.year = year;
    }

    public int getDay(){return this.day;}
    public int getMonth(){return this.month;}
    public int getYear(){return this.year;}

    @Override
    public String toString(){return DAYS_N[dayOfWeek()]+" "+this.day +" "+MONTH_N[this.month-1] +" "+this.year;}

    public static boolean isLeapYear(int year){return year%4==0 && year%100 !=0 || year%400==0;}

    public int dayOfWeek(){
        int h = 0;
        int y = this.month>=3?this.year:this.year-1;
        int k = y%100;
        int j =y/100;
        int m = this.month >=3?this.month:this.month+12;
        h = (this.day + (((m+1)*13))/5+ k+ k/4 + j/4 + 5*j)%7;
        return h;
    }
}