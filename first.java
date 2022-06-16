public class first {
    int id;
    String name;
    double sal;
    void working(){
        System.out.print("the employee are working");
    }
    public static void main(String [] args)
    {
        first obj1=new first();
        System.out.println(obj1.id);
        System.out.println(obj1.name);
        obj1.working();
    }
}
