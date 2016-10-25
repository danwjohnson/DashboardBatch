package com.ulta.merchandise.dashboard.spring.bean;

public class UltaSku {

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
	
	
	// Constructor with all fields
	public UltaSku(String ultaSkuType, String brand, String featureCode, String retailProductId,
			String retailProductName, String itemDescription, String productKey, String ultaSkuNumber, String upcNumber,
			String addUpcNumber, String defaultUpcNumber, String vendorStyleNumber, String colorOrShade,
			String shadeName) {
	
		this.ultaSkuType = ultaSkuType;
		this.brand = brand;
		this.featureCode = featureCode;
		this.retailProductId = retailProductId;
		this.retailProductName = retailProductName;
		this.itemDescription = itemDescription;
		this.productKey = productKey;
		this.ultaSkuNumber = ultaSkuNumber;
		this.upcNumber = upcNumber;
		this.addUpcNumber = addUpcNumber;
		this.defaultUpcNumber = defaultUpcNumber;
		this.vendorStyleNumber = vendorStyleNumber;
		this.colorOrShade = colorOrShade;
		this.shadeName = shadeName;
	
	}
	
	
	public UltaSku() {}

	
	// Getters and Setters
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
