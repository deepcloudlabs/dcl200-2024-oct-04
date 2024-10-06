package com.example;

public class Exercise03 {

	public static void main(String[] args) {
		var t1 = Thread.ofPlatform(); // kernel thread
		var t2 = Thread.ofVirtual();  // jvm/programmer/library --> kernel thread
		// parallel programming -> multi-core programming -> platform thread -> # of logical processors
        // async + io -> kernel thread -> vcs
		//               virtual thread -> switching to another vt
		// new Thread() -> 1024 -> Memory (Stack: 8M) x 1024 -> 8GB -> Virtual Memory
		// -Xss1m -> 1014 x 1M = 1GB -> Virtual Memory
		// reactive programming -> Thread.ofVirtual()
		// 1. cpu isolation -> kernel parameter 0,7,24
		// 2. cpu affinity/binding
		
		
	}

}
