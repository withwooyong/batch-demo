package com.example.batchdemo.application.job;

import org.junit.Test;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class CreateBoardJobConfigTest {

    @Autowired
    private Job createBoardJob;

    @Autowired
    private JobLauncher jobLauncher;

    @Test
    public void run() throws Exception {
        jobLauncher.run(createBoardJob, new JobParametersBuilder()
                .addDate("date", new Date())
                .toJobParameters());
    }

}