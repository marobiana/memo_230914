package com.memo.batch;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class TestBatch {

	@Scheduled(cron = "0 */1 * * * *")
	public void task() {
		log.info("####### batch 수행");
	}
}
