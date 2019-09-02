package main;

public class Person {
    private String name;
    private int age;
    private char gender;
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public char getGender(){
        return gender;
    }
    public void setName(String n){
        name = n;
    }
    public void setAge(int a){
        age = a;
    }
    public void setGender(char g){
        gender = g;
    }
    public Person(String n, int a, char g){
        setAge(a);
        setGender(g);
        setName(n);

    }
    @Override
    public String toString(){
        String st = "";
        if (getGender()=='M' ||getGender()=='m') {
            st = "Hello, my name is " + getName() + "." + "I am a man and I am " + getAge() + " years old.\n";
        }
        else if(getGender()=='F' || getGender()=='f'){
            st = "Hello, my name is " + getName() + "." + "I am a woman and I am " + getAge() + " years old.\n";
        }
        return st;
    }
    public String introduction(){
        StringBuilder sb = new StringBuilder();
        sb.append("Hello , I am "+getName()+".\n");
        sb.append("Currently Pursuing Bachelor Of Technology in Computer Science.\n");
        sb.append("I am quite intrested in games physics development.\n");
        sb.append("And would like to get hired at esteem comapany such as Electronic Arts.\n");
        sb.append("k...Bye.");
        return sb.toString();
    }
}