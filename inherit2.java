//heirarchial inheritance
//parent class
class india{
    void country(){
        System.out.println("india is my country");
    }
}
//child class1
class KA{
    void country(){
        System.out.println("KA is in india");
    }
}
//child claas2
class TN{
    void country(){
        System.out.println("TN is in india");
    }

}
public class inherit2 {
    public static void main(String[] args) {
        TN state1=new TN();
        state1.country();
        KA state2=new KA();
        state2.country();
    }

}
