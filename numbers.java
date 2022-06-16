public class numbers {
    public static void main(String[] args) {
      /*int num=10,factorial=1;
      for(int i=1;i<=num;++i){
          //factorial=factorial*i;
          factorial*=i;
      }
      System.out.println("Factorial:" +factorial);*/

     /* int a=1234, reversed=0;
      System.out.println("original number:" +a);
      while(a!= 0){
          int digit = a%10;
          reversed=reversed*10+digit;
          a/=10;
      }
      System.out.println("Reversed number:" +reversed);*/

        int num= 371,temp=num,rem,sum=0;
        while(num>0){
            rem = num%10;
            sum=sum+rem*rem*rem;
            num=num/10;
        }
        if(temp == sum)
            System.out.println("Armstrong number");
        else
            System.out.println("Not an Armstrong number");
     /*int n=7,count=0,i;
     for(i=1;i<=n;i++){
         if(n%i==0){
             count=count+1;
         }
         if (count==2)
             System.out.println("prime number");
         else
             System.out.println("Not a prime number");*/
    /* int n=10, n1=0,n2=1;
     System.out.println("Fibonacci series" +n+ "terms");
     for(int i=1;i<=n;++i){
         System.out.println( +n1);
         int n3= n1+n2;
         n1=n2;
         n2=n3;*/
    /*int num=10;
    System.out.println("")*/

    }

}