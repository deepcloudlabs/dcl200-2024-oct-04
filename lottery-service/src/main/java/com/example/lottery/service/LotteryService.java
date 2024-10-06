package com.example.lottery.service;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.stereotype.Service;

import com.example.lottery.dto.response.LotteryModel;

@Service
public class LotteryService {

	public LotteryModel draw() {
		return new LotteryModel(ThreadLocalRandom.current().ints(1, 60)
				                .distinct()
				                .limit(6)
				                .sorted()
				                .boxed()
				                .toList());
	}

}
