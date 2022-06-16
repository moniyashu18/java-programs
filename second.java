public class second {
    int num;
    String name;
    //function without parameter
    void working() {
        System.out.println("all are working");
    }
    //function with parameter
    void display(int a){
        System.out.println(a);
    }
    public static void main(String[] args){
        second obj1=new second();
        obj1.working();
        obj1.display( 3);
    }
}
