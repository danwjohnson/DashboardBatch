package com.ulta.merchandise.dashboard.spring.main;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class PrintXmlElements {

	public static void main(String args[]) throws Exception {
		
		DocumentBuilder db = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		org.w3c.dom.Document doc = db.parse(new File("classpath*:/xml/cotyTest.xml"));
		
		NodeList entity = doc.getElementsByTagName("Entity");
		Node entityNode = entity.item(0);
		
		System.out.println(entityNode.getNodeName() + getAttributesAsString(entityNode.getAttributes()));
		
		NodeList children = entityNode.getChildNodes();
		
		for (int i = 0; i < children.getLength(); i++) {
			
			Node item = children.item(i);
			if (item.getNodeType() == Node.ELEMENT_NODE) {
				
				System.out.println(item.getNodeName() + getAttributesAsString(item.getAttributes()));
				
			}
			
		}
	}
	
	
	private static String getAttributesAsString(NamedNodeMap attributes) {
		
		StringBuilder sb = new StringBuilder("\n");
		
		for (int j = 0; j < attributes.getLength(); j++) {
			
			sb.append("\t- ").append(attributes.item(j).getNodeName()).append(": ").append(attributes.item(j).getNodeValue()).append("\n");
			
		}
		
		return sb.toString();
		
	}
	
}
