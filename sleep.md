# Sleep Method..

``` Java

class B extends Thread{
	public void run(){
		for(int i=1; i<10; i++){
			System.out.println("Mainak = "+i);
			Thread.yield();
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){}
		}

	}
}
class C extends Thread{
	public void run(){
		for(int i=1; i<10; i++){
			System.out.println("Sen = "+i);
			Thread.yield();
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){}
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
	
}
```
#### ```Ex:->``` sleep(1000) is use -> Thread.sleep(1000) => error (unreported exception InterruptedException) => try{Thread.sleep(1000)}catch(InterruptedException e){}