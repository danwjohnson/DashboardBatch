package com.ulta.merchandise.dashboard.spring.data;

import javax.sql.DataSource;

import org.springframework.batch.item.file.FlatFileParseException;
// import org.springframework.batch.item.file.MultiResourceItemReader;
import org.springframework.jdbc.core.JdbcTemplate;

public class DatabaseSkipListener {

	private JdbcTemplate jdbcTemplate;
	// private MultiResourceItemReader multiResourceItemReader;
	
	public DatabaseSkipListener(DataSource dataSource) {
		
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		
	}
	
	
	public void onSkipInRead(Throwable t) {
		
		if (t instanceof FlatFileParseException) {
			
			FlatFileParseException ffpe = (FlatFileParseException) t;
			jdbcTemplate.update(
					"insert into skipped_sku (line, line_number) values (?, ?)",
					ffpe.getInput(),ffpe.getLineNumber()
			);
			
		}
		
	}
	
}
