package Cours2;

import java.time.LocalDate;

public class Person {
    String firstName; String lastName; Date dateOfBirth;

    public Person(String fn,String ln,int day,int month,int year){
        this.firstName = fn;
        this.lastName = ln;
        this.dateOfBirth = new Date(day,month,year);
    }

    @Override
    public String toString(){
        return this.firstName+" "+this.lastName+", Born  "+this.dateOfBirth.toString();
    }

    public int getAge(){
        LocalDate today = LocalDate.now();
        int day = today.getDayOfMonth();
        int month = today.getMonthValue();
        int year = today.getYear();
        Date tday = new Date(day,month,year);
        return -this.dateOfBirth.compare(tday)/10000;
    }
}
