package com.example;

public class Exercise01 {

	public static void main(String[] args) throws InterruptedException {
		var start = System.currentTimeMillis();
		for (var i = 0; i < 2_000; ++i) {
			Thread.sleep(2); // voluntary context-switching (vcs)
			// non-voluntary context-switching (nonvcs)
		}
		var stop = System.currentTimeMillis();
		System.err.println("Duration  : %d ms.".formatted(stop-start));
		System.err.println("Cost of cs: %f .".formatted((stop-start)/4000.0));		
	}

}
