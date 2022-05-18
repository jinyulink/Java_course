public class Student {
    private String name;
    private String major;
    private int credits = 0;
    public Student(String name,String major){
        setName(name);
        setMajor(major);
    }
    public void addCredits(int credit){
        this.credits += credit;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setMajor(String major){
        this.major = major;
    }
    public String getName(){
        return name;
    }
    public String getMajor(){
        return major;
    }
    public int getCredits(){
        return credits;
    }
}
