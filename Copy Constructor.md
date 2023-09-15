# Copy Constructor..

``` Java

class A{
	int i=4;
	void s(){
		System.out.println(i);
	}
}
class D extends A{
	int i=5;
	void s(){
		System.out.println(i);
	}
	
}
class B extends D{
	int i=77;
	void s(){
		System.out.println(i);
	}
	
}
class C{

	public static void main(String args[]){
		B ob = new B();
		ob.s();
	}
}
```
#### ```Ex:-``` Bike hoga to na main chalayounga