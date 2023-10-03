# Runnable..

``` Java

class B implements Runnable{
	public void run(){
		for(int i=1; i<=10; i++){
			System.out.println("Hello"+i);
			
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){}
		}
		int []num={1,2,3,4,5,6,6,666,6,6,6,6};
		for(int i: num){
			System.out.println(i);
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){}

		}
	}
}
class C implements Runnable{
	public void run(){
		for(int i=1; i<=10; i++){
			System.out.println("ho"+i);
			try{
				Thread.sleep(1500);
			}catch(InterruptedException e){}
			
		}
	}
}
class A{
	public static void main(String args[]){

		B ob = new B();
		Thread t=new Thread(ob);
		C o = new C();
		Thread tt = new Thread(o);
		tt.start();
		t.start();
	}
}
```
#### ```Ex:-``` Object ot object call