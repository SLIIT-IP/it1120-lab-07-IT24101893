import java.util.Scanner;
 public class IT24101893Lab7Q3{

public static void main(String[]args){

Scanner input=new Scanner(System.in);

 for( int customer=1;customer<=5;customer++)
{

System.out.println("customer"+customer);

System.out.print("Enter a bill amount:");
double amount=input.nextDouble();
 
{System.out.print("Enter mode of payment(c for cash, o for other) :");
char paymentMode=input.next().charAt(0);
}

if(paymentMode=='c'||paymentMode=='C' )
{
System.out.println("Discount is:"+amount*5/100);
 System.out.println("Amount to be paid:"+amount*95/100);
 }

else if(paymentMode=='o'||paymentMode=='O' )
{
System.out.println("No discount applicable");
 System.out.println("Amount to be paid:"+amount); 
}
else
{
 System.out.println("Payment mode is not valid");
 }


System.out.println("");
    }
  }
}
 