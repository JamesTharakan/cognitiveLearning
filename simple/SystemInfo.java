package simple;

public class SystemInfo {
	public static void main(String[] args) {
		System.out.println("Available Processors :" + Runtime.getRuntime().availableProcessors());
		System.out.println("Free Memory :" + Runtime.getRuntime().freeMemory());
		System.out.println("Total Memory : " + Runtime.getRuntime().totalMemory());
		System.out.println("JRE Version : " + Runtime.getRuntime().version());
		
		System.out.println("Number of threads " + Thread.activeCount());
	}
}