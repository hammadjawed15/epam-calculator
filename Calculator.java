package calculator;

import java.util.Scanner;
class Calculator
{
    public static void main(String args[])
    {
Scanner sc= new Scanner(System.in);
   while(true)
   { 
       System.out.println("Enter 2 numbers");
        int a= sc.nextInt();
        int b= sc.nextInt();
 System.out.println("press + for addition\n press - for subtraction\n press * for multiplication\n press / for divison");
   System.out.println("Enter your choice");
  char ch=sc.next().charAt(0);
       switch(ch)
   {
       case '+'
               :System.out.println("addition  is "+(a+b));
       break;
       case '-':
       System.out.println("subtraction is "+(a-b));
       break;
       case '*':
       System.out.println("multiplication is "+(a*b));
       break;
       case '/':
       System.out.println("divison  is "+(a/b));
       break;
       default:
       System.exit(0);
    }
    } 
    }
}
