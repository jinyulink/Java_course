public class test{
    public static void main(String[] args){
        A a = new A();
        B b = a;
        C c = a;

        c.m2(); //OK? Ans: AC, >> "B's m2" <<
        b.m3(); //OK? Anc: >> "error: cannot find symbol" <<
    }
}