public class Graduate extends Student {
    private String advisor;
    public Graduate(String name,String major,String advisor){
        super(name,major);
        setAdvisor(advisor);
    }
    public int tuition(){
        return 1500*getCredits();
    }
    public void addCredits(int credit){
        this.credits += credit;
    }
    public void setAdvisor(String advisor){
        this.advisor = advisor;
    }
    public int getCredits(){
        return credits;
    }
}
