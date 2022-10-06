package com.example.batchdemo.application.job;

import org.junit.Test;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SoftDeleteBoardJobConfigTest {

    @Autowired
    private Job softDeleteBoardJob;

    @Autowired
    private JobLauncher jobLauncher;

    @Test
    public void run() throws Exception {
        jobLauncher.run(softDeleteBoardJob, new JobParametersBuilder()
                .addString("createdDate", "2020-01-01")
                .toJobParameters());
    }
}