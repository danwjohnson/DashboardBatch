package com.ulta.merchandise.dashboard.spring.item;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.data.mongodb.core.MongoOperations;

public class MongoSkuWriter implements ItemWriter<Object>, InitializingBean{

	private MongoOperations mongoOperations;
	
	private String collectionName = "/sku";
	

	public MongoSkuWriter(MongoOperations mongoOperations) {
		
		this.mongoOperations = mongoOperations;
		
	}
	
	public void setCollectionName(String collectionName) {
		
		this.collectionName = collectionName;
		
	}
	
	
	public void afterPropertiesSet() throws Exception {
		
		if (mongoOperations.collectionExists(collectionName) == false) {
			
			mongoOperations.createCollection(collectionName);
			
		}
		
	}

	public void write(List<? extends Object> items) throws Exception {
		
		mongoOperations.insert(items, collectionName);
		
		
	}

}
