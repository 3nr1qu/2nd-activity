
//addition

class addition {

  public static void main(String[] args) {
    
    System.out.println("Enter two numbers: ");
    int first = 10;
    int second = 20;
    
    System.out.println(first + " " + second);

    int sum = first + second;
    System.out.println("The sum is: " + sum);
  }
}



//division 

public class division{
    public static void main(String args[]){
    int num1=20,num2=100,div;
    
    div=num2/num1;
    System.out.println("Division of two numbers: "+div);
    
    }
    }


 //multiplication
 
 public class multiplication{
    public static void main(String args[]){
    int num1=20,num2=100,mul;
    
    mul=num2*num1;
    System.out.println("Division of two numbers: "+mul);
    
    }
    }


//subtraction

import java.util.Scanner;
class Sub
{
public static void main(String[] arg)
{
int a,b,c;
Scanner s=new Scanner(System.in);
System.out.println("Enter first number");
a=s.nextInt();
System.out.println("Enter second number");
b=s.nextInt();
if(a>b)
	c=a-b;
else
	c=b-a;
System.out.println("The difference of two numbers is : "+c);
}
}