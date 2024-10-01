import java.util.Scanner;

  public class IT24101893Lab7Q1A{

public static void main(String[]args){

    Scanner input=new Scanner(System.in);

  int count;
  double average,total=0;
  System.out.println("Enter marks for subjects:");
 
  for(count=1;count<=4;count++){

   System.out.print("Enter subject Mark "+count+":");
   double number=input.nextDouble();
   total+=number;
    }
                                    
average=total/4;
System.out.println();
System.out.println("Average is :"+average);

if(average>=0 && average<50)
{System.out.println("Overall Grade is :Fail");}
else if(average<75 && average>=50)
{System.out.println("Overall Grade is :Credit");}
else if(average<=100 && average>=75)
{System.out.println("Overall Grade is :Distinction");}
else
{System.out.print("Invalid Mark");}
 
input.close();
    }
}