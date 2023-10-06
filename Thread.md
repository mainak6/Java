# Thread..

``` Java

class B extends Thread{
	public void run(){
		System.out.println("Hello");
	}
}
class A{
	public static void main(String args[]){
		
		Thread ob=Thread.currentThread();
		ob.setName("Mainak Sen");
		System.out.println(ob.getName());
		ob.setPriority(7);
		System.out.println(ob.getPriority());

		B o = new B();
		o.start();
		
	}
}
```
#### ```Ex:->``` Thread 