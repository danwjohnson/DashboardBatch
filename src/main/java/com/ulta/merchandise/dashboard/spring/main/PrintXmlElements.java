<<<<<<< HEAD
package com.ulta.merchandise.dashboard.spring.main;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class PrintXmlElements {

	public static void main(String args[]) throws Exception {
		
		DocumentBuilder db = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		org.w3c.dom.Document doc = db.parse(new File("src/main/resources/xml/cotyTest.xml"));
		
		doc.getDocumentElement().normalize();
		
		Node n = doc.getLastChild();
		
		NodeList nodeList = n.getChildNodes();
		for (int j = 0; j < nodeList.getLength(); j++) {
			
			Node childNode = nodeList.item(j);
			
			if (childNode.getNodeType() == Node.ELEMENT_NODE) {
				
				System.out.println(childNode.getNodeName() + " " + childNode.getFirstChild().getNodeValue());
				System.out.println(childNode.getNodeName() + " " + childNode.getNextSibling().getNodeValue());
				
			}
			
		}
		
		/*
		System.out.println("Root element : " + doc.getDocumentElement().getNodeName());
		
		NodeList entity = doc.getElementsByTagName("Entity");
		
		System.out.println("------------------------------");
		
		for (int temp = 0; temp < entity.getLength(); temp++) {
			
			Node nNode = entity.item(temp);
			
			
			System.out.println("\nCurrent Element : " + nNode.getNodeName());
			
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				
				Element eElement = (Element) nNode;
				
				System.out.println("Action : " + eElement.getAttribute("Action"));
				System.out.println("ExternalId :" + eElement.getAttribute("ExternalId"));
				
				
				
				NodeList attribute = doc.getElementsByTagName("Attribute");
				
				for(int atemp = 0; atemp < attribute.getLength(); atemp++) {
				
					Node aNode = attribute.item(atemp);
				
					System.out.println("\nCurrentElement : " + aNode.getNodeName());
					
					if (aNode.getNodeType() == Node.ELEMENT_NODE) {
						Element aElement = (Element) aNode;
						
						System.out.println("Attribute Action : " + aElement.getAttribute("Action"));
						System.out.println("Attribute Long Name : " + aElement.getAttribute("LongName"));
					
					}
					
				} 
				
			}
			
			
		} 
		
		
		
		/* -- commented this out to try something new with the DOM
		NodeList attribute = doc.getElementsByTagName("Attribute");
		
		
		System.out.println("entity node list size : " + entity.getLength());
		Node entityNode = entity.item(0);
		System.out.println("Entity toString : " + entity.item(0).toString());
		
		System.out.println(entityNode.getNodeName() + getAttributesAsString(entityNode.getAttributes()));

		
		System.out.println("attribute node list size : " + attribute.getLength());

		Node attributeNode = attribute.item(0);
		System.out.println(attributeNode.getNodeName() + getAttributesAsString(attributeNode.getAttributes()));
		
		NodeList children = entityNode.getChildNodes();
		
		for (int i = 0; i < children.getLength(); i++) {
			
			Node item = children.item(i);
			if (item.getNodeType() == Node.ELEMENT_NODE) {
				
				System.out.println(item.getNodeName() + getAttributesAsString(item.getAttributes()));
				
			}
			
		}
		
		*/
	}
	
	
	private static String getAttributesAsString(NamedNodeMap attributes) {
		
		StringBuilder sb = new StringBuilder("\n");
		
		for (int j = 0; j < attributes.getLength(); j++) {
			
			sb.append("\t- ").append(attributes.item(j).getNodeName()).append(": ").append(attributes.item(j).getNodeValue()).append("\n");
			
		}
		
		return sb.toString();
		
	}
	
}
=======
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
		org.w3c.dom.Document doc = db.parse(new File("src/main/resources/xml/cotyTest.xml"));
		
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
>>>>>>> branch 'master' of https://github.com/djboy71/DashboardBatch.git
