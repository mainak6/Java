# User input Two Number Sum..

``` Java

import java.io.*;
class Aa{
	int i,j;
	void get(){
		
		InputStreamReader obj = new InputStreamReader(System.in);
		BufferedReader ob = new BufferedReader(obj);

		try{
			System.out.println("Enter the First Number");
			String s = ob.readLine();
			int n1 = Integer.parseInt(s);
			
			System.out.println("Enter the Second Number");
			String s2 = ob.readLine();
			int n2 = Integer.parseInt(s2);
	
			set(n1,n2);
		}
		catch(IOException m){}

	}
	void set(int i, int j){

		this.i=i; this.j=j;
	}

	void show(){
		System.out.println("I value is : "+i+"\nJ value is : "+j);
		int sum=i+j;
		System.out.println("Sum is a : "+ sum);
	}
}
class Ab{
	public static void main(String[] args){
		Aa ob = new Aa();

		ob.get();
		ob.show();
	}
}

```