import java.util.*; 
public class Main
{
     public static void main(String []args)
     {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After Swapping numbers are: ");
        System.out.println("The first Number is "+a);
        System.out.println("The second Number is "+b);
     }
}
