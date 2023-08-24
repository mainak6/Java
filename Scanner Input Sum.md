# Scanner Input

``` Java
import java.util.Scanner;
class B{
    public static void main(String args[]){
        int a,b,sum;
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the first number");
		a=ob.nextInt();
		System.out.println("Enter the Senond Numbner");
		b=ob.nextInt();
		sum=a+b;
		System.out.println("Addition is "+sum);
    }
}
```