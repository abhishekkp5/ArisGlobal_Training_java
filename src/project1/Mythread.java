package project1;

class DemoThread extends Thread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("My Thread...."+Thread.currentThread().getName());
	}
	
}
public class Mythread {
	public static void main(String[] args) {
		DemoThread demothread = new DemoThread();
		Thread t1 = new Thread(demothread);
		t1.setName("/n Raj");
		t1.start();
	}
}
