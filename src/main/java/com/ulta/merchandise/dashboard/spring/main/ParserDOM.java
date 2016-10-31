package com.ulta.merchandise.dashboard.spring.main;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.sun.org.apache.xerces.internal.parsers.DOMParser;

public class ParserDOM {

	public static void main(String args[]){
		
		try {
		
			DOMParser parser = new DOMParser();
			parser.parse("src/main/resources/xml/cotyTest.xml");
			Document doc = parser.getDocument();
			
			// get the documents root XML node
			NodeList root = doc.getChildNodes();
			
			// navigate down the hierarchy to get the Entity node
			Node data = getNode("Data", root);
			Node entities = getNode("Entities", data.getChildNodes());
			Node entity = getNode("Entity", entities.getChildNodes());
			Node attributes = getNode("Attributes", entity.getChildNodes());
			Node attribute = getNode("Attribute", attributes.getChildNodes());
			Node values = getNode("Values", attribute.getChildNodes());
			Node value = getNode("Value", values.getChildNodes());
			
			if (value.getNodeType() == Node.CDATA_SECTION_NODE) {
				
				System.out.println("The value node contains cdata.");
			
			}
			
			System.out.println("Value is : " + value.getNodeValue());
					
			
			System.out.println("Parsing completed");
			
		}
		
		catch(Exception ex) {
			
		}
	}
	
	
	protected static Node getNode(String tagName, NodeList nodes){
		
		for (int x = 0; x < nodes.getLength(); x++) {
			
			Node node = nodes.item(x);
			if (node.getNodeName().equalsIgnoreCase(tagName)) {
				
				return node;
				
			}
			
		}
		
		return null;
		
	}
	
	protected static String getNodeValue( Node node ) {
		
	    NodeList childNodes = node.getChildNodes();
	    
	    for (int x = 0; x < childNodes.getLength(); x++ ) {
	    
	    	Node data = childNodes.item(x);
	        
	    	if ( data.getNodeType() == Node.TEXT_NODE )
	        
	    		return data.getNodeValue();
	    }
	    
	    return "";
	
	}
	
	
	protected String getNodeValue(String tagName, NodeList nodeValue ) {
	    
		for ( int x = 0; x < nodeValue.getLength(); x++ ) {
	        
			Node node = nodeValue.item(x);
	        if (node.getNodeName().equalsIgnoreCase(tagName)) {
	            
	        	NodeList childNodes = node.getChildNodes();
	            for (int y = 0; y < childNodes.getLength(); y++ ) {
	                
	            	Node data = childNodes.item(y);
	                if ( data.getNodeType() == Node.TEXT_NODE )
	                    
	                	return data.getNodeValue();
	                
	            }
	        
	        }
	        
	    }
		
	    return "";
	    
	}
	
}
