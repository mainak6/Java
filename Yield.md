# Yield Method..

``` Java

class B extends Thread{
	public void run(){
		for(int i=1; i<10; i++){
			System.out.println(i);
			Thread.yield();
		}

	}
}
class C extends Thread{
	public void run(){
		for(int i=1; i<10; i++){
			System.out.println(i);
			Thread.yield();
		}

	}

}
class A{
	public static void main(String args[]){
		B ob = new B();
		ob.start();
		C oo = new C();
		oo.start();	
	}
	
}
```
#### ```Ex:-``` Yield() is use - Thread.yield()