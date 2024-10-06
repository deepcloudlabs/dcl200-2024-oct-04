package com.example;

public class Exercise02 {
	private final int ARR_SIZE = 2 * 1024 * 1024;
	private final int[] testData = new int[ARR_SIZE]; // 8MB

	private void touchEveryItem() {
		for (int i = 0; i < testData.length; i++)
			testData[i]++;
	}

	private void touchEveryLine() {
		for (int i = 0; i < testData.length; i += 16)
			testData[i]++;
	}

	private void run() {
		System.err.println("Start: " + System.currentTimeMillis());
		for (int i = 0; i < 15_000; i++) {
			touchEveryLine();
			touchEveryItem();
		}
		System.err.println("Warmup finished: " + System.currentTimeMillis());
		System.err.println("Item Line");
		for (int i = 0; i < 100; i++) {
			long t0 = System.nanoTime();
			touchEveryLine();
			long t1 = System.nanoTime();
			touchEveryItem();
			long t2 = System.nanoTime();
			long elItem = t2 - t1;
			long elLine = t1 - t0;
			double diff = elItem - elLine;
			System.err.println(elItem + " " + elLine + " " + (100 * diff / elLine));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise02 c = new Exercise02();
		c.run();

	}

}
