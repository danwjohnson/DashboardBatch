package com.ulta.merchandise.dashboard.spring.item;

import org.springframework.batch.item.ItemProcessor;

import com.ulta.merchandise.dashboard.spring.bean.UltaSku;



public class SkuProcessor implements ItemProcessor<UltaSku, UltaSku>{

	public UltaSku process(UltaSku ultaSku) throws Exception {
		
		return ultaSku;
		
	}

	
	
}
