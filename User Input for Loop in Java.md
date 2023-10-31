# User Input "for" Loop in Java
```java

import java.io.*;
class B{
	int i;
	String ss="";
	void s(){
		InputStreamReader ob = new InputStreamReader(System.in);
		BufferedReader obj = new BufferedReader(ob);
		try{
			String s=obj.readLine();
			ss=s;
		}catch(IOException e){}
		int n=Integer.parseInt(ss);
		i=n;
	}
}
class A{
	public static void main(String args[]){	
		
		B ob = new B();
		ob.s();
		for(int i=1; i<=ob.i; i++){
			System.out.print(i+" ");
		}
	}
}

```