class Pro{
	private String name;
	private int count = 1;
	private boolean flag = false;
	
	public synchronized void set(String name){
		if(flag)
			try{this.wait();}catch(Exception e){}
		this.name = name+"--"+count++;
		System.out.println(Thread.currentThread().getName()+"productor:  "+this.name);
		this.flag = true;
		this.notify();
		
	}
	
	public synchronized void out(){
		if(!flag)
			try{this.wait();}catch(Exception e){}
		System.out.println(Thread.currentThread().getName()+"consumer:  "+this.name);
		this.flag = false;
		this.notify();
	}
	
}

class Productor implements Runnable{
	private Pro p;
	Productor(Pro pro){
		this.p = pro;
	}
	public void run(){
		while(true){
			p.set("+pro+");
		}
	}
}

class Consumer implements Runnable{
	private Pro p;
	Consumer(Pro pro){
		this.p = pro;
	}
	public void run(){
		while(true){
			p.out();
		}
	}
}


class ProductConsumer{
	
	public static void main(String[] args){
		Pro p = new Pro();
		Productor productor = new Productor(p);
		Consumer consumer = new Consumer(p);
		
		Thread in = new Thread(productor);
		Thread out = new Thread(consumer);
		
		in.start();
		out.start();
		
	}
}


