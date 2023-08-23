# BufferedReader Input

``` Java
import java.io.*;
class Ba{
	public static void main(String args[])throws IOException{
		
		InputStreamReader obj2= new InputStreamReader(System.in);
		BufferedReader obj=new BufferedReader(obj2);
		System.out.println("Enter the Numebr");
		String v=obj.readLine();
		System.out.println(v);
	}
}
```