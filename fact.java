import java.util.*;
class fact{

int factorial(int x)
{
if(x==1)
return 1;
else
return(x*factorial(x-1));
}
static Scanner ui=new Scanner(System.in);
public static void main(String[]args){
fact obj=new fact();
System.out.println("Enter the number");
int n=ui.nextInt();
int factNumber=obj.factorial(n);
System.out.println("Factorial of number is :"+factNumber);
}
}