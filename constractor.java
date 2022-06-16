public class constractor {
    constractor(int a){
        System.out.println("constructor with parameters");
    }
    constractor(){
        System.out.println("without parameter");
    }
    constractor(int a,String name){
        System.out.println("different in parameter");
    }
    constractor(String name,int a){
        System.out.println("constructor is different in the order");
    }
    public static void main(String[] args) {
        constractor obj = new constractor(10);
        constractor obj2 = new constractor();
        constractor obj3 = new constractor("java", 10);
        constractor obj4 = new constractor(10, "program");
    }
}
