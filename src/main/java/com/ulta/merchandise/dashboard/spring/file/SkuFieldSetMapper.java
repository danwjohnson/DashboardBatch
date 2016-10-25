package com.ulta.merchandise.dashboard.spring.file;

import java.math.BigDecimal;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;

import com.ulta.merchandise.dashboard.spring.bean.UltaSku;
import com.ulta.merchandise.dashboard.spring.util.Conversions;

public class SkuFieldSetMapper implements FieldSetMapper<UltaSku>{

	Conversions convert = new Conversions();
	String tempString = new String();
	BigDecimal tempBD;
	
	
	/**
	 * Map the fields from the Spring Batch field set into the UltaSKU object and return
	 * that object.
	 * 
	 * @param FieldSet
	 * @return UltaSKU
	 * 
	 */
	public UltaSku mapFieldSet(FieldSet fieldSet) {
		
		UltaSku ultaSku = new UltaSku();

		ultaSku.setUltaSkuType(fieldSet.readString("skuType"));
		ultaSku.setBrand(fieldSet.readString("brand"));
		ultaSku.setFeatureCode(fieldSet.readString("featureCode"));
		ultaSku.setRetailProductId(fieldSet.readString("retailProductId"));
		ultaSku.setRetailProductName(fieldSet.readString("retailProductName"));
		ultaSku.setItemDescription(fieldSet.readString("itemDescription"));
		ultaSku.setProductKey(fieldSet.readString("productKey"));
		ultaSku.setUltaSkuNumber(fieldSet.readString("ultaSkuNumber"));
		
		
		// check if UPC is is scientific notation and convert it if it is
		if (convert.isScientificNotation(fieldSet.readString("upcNumber"))) {
			
			tempBD = convert.convertStringToBigDecimal(fieldSet.readString("upcNumber"));
			ultaSku.setUpcNumber(tempBD.toPlainString());
			tempBD = null;
			
		}
		else {
			
			ultaSku.setUpcNumber(fieldSet.readString("upcNumber"));
			
		}
		
		
		ultaSku.setAddUpcNumber(fieldSet.readString("addUpcNumber"));
		ultaSku.setDefaultUpcNumber(fieldSet.readString("defaultUpcNumber"));
		ultaSku.setVendorStyleNumber(fieldSet.readString("vendorStyleNumber"));
		ultaSku.setColorOrShade(fieldSet.readString("colorOrShade"));
		ultaSku.setShadeName(fieldSet.readString("shadeName"));
		
		return ultaSku;
	
	}
	
}
