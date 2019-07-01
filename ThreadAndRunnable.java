public class ThreadAndRunnable {
	
	public static void main(String[] args) {
		new Thread(new Runnable() {
			/**
			 * 重写Runnable中的run方法
			 */
			@Override
			public void run() {
				while(true){
					System.out.println("Runnable:"+Thread.currentThread().getName());
				}
			}
		}){
			/**
			 * 重写Thread中的run方法
			 */
			@Override
			public void run() {
				while(true){
					System.out.println("Thread:"+Thread.currentThread().getName());
				}
			}
		}.start();
	}
 
}