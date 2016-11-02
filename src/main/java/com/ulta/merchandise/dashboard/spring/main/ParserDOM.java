package com.ulta.merchandise.dashboard.spring.main;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
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
			
			System.out.println("Length of root it : " + root.getLength());
			
			NodeList entitiesList;
			
			for (int i = 0; i < root.getLength(); i++) {
				Node data = getNode("Data", root);
				Node entities = getNode("Entities", data.getChildNodes());
				
				entitiesList = entities.getChildNodes();
				System.out.println("Length of entities list : " + entitiesList.getLength());
				
				int count = 1;
				
				Node entity;
				Node attribute;
				Node attributes;
				Node values;
				Node value;
				Element valueElement;
				
				for(int j = 0; j < entitiesList.getLength(); j++){
					
					entity = entitiesList.item(j).getNextSibling();
					// entity = getNode("Entity", entities.getChildNodes());
					attributes = getNode("Attributes", entity.getChildNodes());
					attribute = getNode("Attribute", attributes.getChildNodes());
					values = getNode("Values", attribute.getChildNodes());
					value = getNode("Value", values.getChildNodes());
					
					valueElement = (Element)value;
					
					System.out.println("Value is : " + valueElement.getFirstChild().getNodeValue().trim());
					
					count++;
					
					
			
				}

				System.out.println("Count of entities : " + count);
				
			}
					
			
			
			
			System.out.println("Parsing completed");
			
		}
		
		catch(Exception ex) {
			
			ex.printStackTrace();
			
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
