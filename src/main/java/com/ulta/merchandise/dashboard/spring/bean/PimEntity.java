package com.ulta.merchandise.dashboard.spring.bean;

import java.util.ArrayList;

public class PimEntity {

	private String category;
	private String categoryPath;
	private String externalId;
	private String longName;
	
	private ArrayList<PimAttribute> attributes = new ArrayList<PimAttribute>();

	
	// Getter and Setters
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCategoryPath() {
		return categoryPath;
	}

	public void setCategoryPath(String categoryPath) {
		this.categoryPath = categoryPath;
	}

	public String getExternalId() {
		return externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public String getLongName() {
		return longName;
	}

	public void setLongName(String longName) {
		this.longName = longName;
	}

	public ArrayList<PimAttribute> getAttributes() {
		return attributes;
	}

	public void setAttributes(ArrayList<PimAttribute> attributes) {
		this.attributes = attributes;
	}

	public void addAttribute(PimAttribute pimAttribute){
		attributes.add(pimAttribute);
	}
	
	
	// Overridden toString()
	@Override
	public String toString() {
		return "Entity [category=" + category + ", categoryPath=" + categoryPath + ", externalId=" + externalId
				+ ", longName=" + longName + ", attributes=" + attributes + "]";
	}
	
	
	
}
