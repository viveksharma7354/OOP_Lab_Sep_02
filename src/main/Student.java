package main;

public class Student extends Person {
    private long uniRollNumber;
    private String course;
    public String getCourse(){
        return course;
    }
    public long getUniRollNumber(){
        return uniRollNumber;
    }
    public void setUniRollNumber(long r){
        uniRollNumber = r;
    }
    public void setCourse(String c){
        course = c;
    }
    public Student(String n, int a, char g,long r,String c) {
        super(n, a, g);
        setCourse(c);
        setUniRollNumber(r);
    }
    @Override
    public String toString(){
        String st = "I study " + getCourse() + " and my roll number is " + getUniRollNumber();
        return st;
    }
}

