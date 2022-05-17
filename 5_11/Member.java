public class Member {
    private String name;
    private int fee;
    public Member(String name, int fee) {
        setName(name);
        setFee(fee);
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setFee(int fee) {
        this.fee = fee;
    }
    public int getFee() {
        return fee;
    }
    public String toString() {
        return getName() + "\tMembership Fee: " + getFee()+'\n';
    }
}
