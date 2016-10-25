package com.ulta.merchandise.dashboard.spring.bean;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Entity")
public class UltaSkuXml {

	private String ultaSkuType;
	private String brand;
	private String featureCode;
	private String retailProductId;
	private String retailProductName;
	private String itemDescription;
	private String productKey;
	private String ultaSkuNumber;
	private String upcNumber;
	private String addUpcNumber;
	private String defaultUpcNumber;
	private String vendorStyleNumber;
	private String colorOrShade;
	private String shadeName;
	
	
	@XmlAttribute(name="")
	public String getUltaSkuType() {
		return ultaSkuType;
	}
	public void setUltaSkuType(String ultaSkuType) {
		this.ultaSkuType = ultaSkuType;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getFeatureCode() {
		return featureCode;
	}
	public void setFeatureCode(String featureCode) {
		this.featureCode = featureCode;
	}
	public String getRetailProductId() {
		return retailProductId;
	}
	public void setRetailProductId(String retailProductId) {
		this.retailProductId = retailProductId;
	}
	public String getRetailProductName() {
		return retailProductName;
	}
	public void setRetailProductName(String retailProductName) {
		this.retailProductName = retailProductName;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	public String getProductKey() {
		return productKey;
	}
	public void setProductKey(String productKey) {
		this.productKey = productKey;
	}
	public String getUltaSkuNumber() {
		return ultaSkuNumber;
	}
	public void setUltaSkuNumber(String ultaSkuNumber) {
		this.ultaSkuNumber = ultaSkuNumber;
	}
	public String getUpcNumber() {
		return upcNumber;
	}
	public void setUpcNumber(String upcNumber) {
		this.upcNumber = upcNumber;
	}
	public String getAddUpcNumber() {
		return addUpcNumber;
	}
	public void setAddUpcNumber(String addUpcNumber) {
		this.addUpcNumber = addUpcNumber;
	}
	public String getDefaultUpcNumber() {
		return defaultUpcNumber;
	}
	public void setDefaultUpcNumber(String defaultUpcNumber) {
		this.defaultUpcNumber = defaultUpcNumber;
	}
	public String getVendorStyleNumber() {
		return vendorStyleNumber;
	}
	public void setVendorStyleNumber(String vendorStyleNumber) {
		this.vendorStyleNumber = vendorStyleNumber;
	}
	public String getColorOrShade() {
		return colorOrShade;
	}
	public void setColorOrShade(String colorOrShade) {
		this.colorOrShade = colorOrShade;
	}
	public String getShadeName() {
		return shadeName;
	}
	public void setShadeName(String shadeName) {
		this.shadeName = shadeName;
	}
	
	
	
}
