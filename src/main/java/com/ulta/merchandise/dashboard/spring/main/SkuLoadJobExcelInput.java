package com.ulta.merchandise.dashboard.spring.main;

import java.util.Date;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SkuLoadJobExcelInput {

	public static void main(String args[]) throws Exception {
		
		String[] springConfigFiles = 
			{ "/META-INF/spring/initialize/initialize-database-context.xml",
			  "/META-INF/spring/batch-infrastructure-context.xml",
			  "/META-INF/spring/load-sku-job-context-excel.xml"
			};
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext(springConfigFiles);
		
		JobLauncher jobLauncher = ctx.getBean(JobLauncher.class);
		Job job = ctx.getBean(Job.class);
		
		jobLauncher.run(job,
						new JobParametersBuilder()
							.addString("sourceDirectory", "")
							.addDate("date", new Date()).toJobParameters());
		
		((ConfigurableApplicationContext)ctx).close();
		
	}
	
}
