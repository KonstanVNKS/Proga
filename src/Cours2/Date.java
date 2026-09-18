package Cours2;

import java.util.ArrayList;

public class Date {
    int day,month,year;

    private String[] dayN = new String[]{"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
    private String[] monthN = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    public Date(int d, int m, int y){
        this.day =d;
        this.month =m;
        this.year=y;
    }

    public void increment(){
        if(this.year%400==0 || (this.year%4==0 &&this.year%100!=0)) {
            if(this.month == 2 && this.day==29) {
                this.month++;
                this.day = 1;
            } else if (this.month==2 && this.day ==28) {
                this.month++;
                this.day = 1;
            }else if (this.month==12 && this.day ==31) {
                this.year++;
                this.month=1;
                this.day =1;
            }else
                this.day++;
        }else{
             if (this.month!=2 && this.day ==31) {
                this.month++;
                this.day =1;
            } else if (this.month==2 && this.day ==28) {
                this.month++;
                this.day =1;
            }else
                this.day++;
        }
    }


    public int dayOfYear(){
        int dCnt = 1;
        Date other = new Date(1,1,this.year);
        while(this.compare(other)!=0){
            dCnt++;
            other.increment();
        };
        return dCnt;
    }

    public int dayOfWeek(){
        int h = 0;
        int y = this.month>=3?this.year:this.year-1;
        int k = y%100;
        int j =y/100;
        int m = this.month >=3?this.month:this.month+12;
        h = (this.day + (((m+1)*13))/5+ k+ k/4 + j/4 + 5*j)%7;
        return h;
    }

    @Override
    public String toString(){
        return dayN[dayOfWeek()]+" "+this.day +" "+monthN[this.month-1] +" "+this.year;
    }

    public void prettyprint(){
        System.out.println(this.toString());
    }

    public int compare(Date d2){
        return (this.day+(this.month*100)+(this.year*10000))-(d2.day+(d2.month*100)+(d2.year*10000));
    }
}
