public class RunnableSingleThread {
	private static class PointlessPrint implements Runnable {
		private String message;
		private int n;
		public PointlessPrint(String message, int n) {
            this.message = message;
			this.n = n;
		}
		public void run() {
			for(int i=0;i<n;i++) {
				System.out.println(i + "/" + n + " " + message);
			}
		}
	}
	public static void main(String[] args) {
		PointlessPrint p = new PointlessPrint("Hello",10);
		Thread t = new Thread(p);
		t.start();	// starts the thread by invoking the 
		           	// run() method of PointlessPrint
	}
}