package com.ulta.merchandise.dashboard.spring.bean;

public class PimAttribute {

	private String attributeParentName;
	private String attributeName;
	private String value;
	
	
	// Getters and Setters
	public String getAttributeParentName() {
		return attributeParentName;
	}
	public void setAttributeParentName(String attributeParentName) {
		this.attributeParentName = attributeParentName;
	}
	public String getAttributeName() {
		return attributeName;
	}
	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	
	
	// Overridden toString()
	@Override
	public String toString() {
		return "Attribute [attributeParentName=" + attributeParentName + ", attributeName=" + attributeName + ", value="
				+ value + "]";
	}
	
}
