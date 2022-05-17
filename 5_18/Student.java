public class Student {
    private String name;
    private String major;
    public Student(String name,String major){
        setName(name);
        setMajor(major);
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
}
