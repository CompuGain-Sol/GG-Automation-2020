package com.sacs.utils;


import java.io.File;
import java.util.LinkedList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.DocumentType;
import org.w3c.dom.Element;

public class XMLGenerator {

	private DocumentBuilderFactory docFactory ;
	private DocumentBuilder docBuilder;
	private Document doc;
	private DOMImplementation domImpl;
	
	public  XMLGenerator() throws ParserConfigurationException {
		
		docFactory = DocumentBuilderFactory.newInstance(); 
		docBuilder = docFactory.newDocumentBuilder();
		doc = docBuilder.newDocument();
		domImpl = doc.getImplementation();
	}
	

	public Element rootTag(String a) {
		Element elementName=doc.createElement(a);
		doc.appendChild(elementName);
		return elementName;
	}

	public Element subTag(Element rootTagName,String childTagName)
	{
		Element childElement =doc.createElement(childTagName);
		rootTagName.appendChild(childElement);
		return childElement;
	}

	public void setAttributes(String sattributeKey, String sattributeValue, Element tagName){

		Attr attr=doc.createAttribute(sattributeKey);
		attr.setValue(sattributeValue);
		tagName.setAttributeNode(attr);

	}
	
	public void createXML(String unit, String customerCode, String mainStore, LinkedList<String> failedList) throws TransformerException {
		System.out.println("Enter Into createXMl Block");
		DocumentType doctype = domImpl.createDocumentType("doctype", "suite","http://testng.org/testng-1.0.dtd");
		Element suiteTag=rootTag("suite");
		setAttributes("name", "SACS_FAILED", suiteTag);
		setAttributes("thread-count", "1", suiteTag);
		setAttributes("parallel","false",suiteTag);
		
		Element listnersTag=subTag(suiteTag, "listeners");
		
		Element listnerTag1=subTag(listnersTag,"listener");
		Element listnerTag2=subTag(listnersTag,"listener");
		Element listnerTag3 = subTag(listnersTag, "listener");
		
		setAttributes("class-name", "org.uncommons.reportng.HTMLReporter", listnerTag1);
		setAttributes("class-name", "org.uncommons.reportng.JUnitXMLReporter", listnerTag2);
		setAttributes("class-name", "com.sacs.Reportinglib.CustomReporter", listnerTag3);

		
		Element testTag=subTag(suiteTag,"test");
		setAttributes("name", "IE-Browser", testTag);
		setAttributes("parallel", "false", testTag);
		
		Element parameter1=subTag(testTag, "parameter");
		Element parameter2=subTag(testTag, "parameter");
		Element parameter3=subTag(testTag, "parameter");
		Element parameter4=subTag(testTag, "parameter");
		Element parameter5=subTag(testTag, "parameter");
		Element parameter6=subTag(testTag, "parameter");
		Element parameter7=subTag(testTag, "parameter");
		Element parameter8=subTag(testTag, "parameter");
		Element parameter9=subTag(testTag, "parameter");
		Element parameter10=subTag(testTag, "parameter");
		
		setAttributes("name","project", parameter1);
		setAttributes("value","SACS", parameter1);
		
		setAttributes("name","sbrowser", parameter2);
		setAttributes("value","chrome", parameter2);
		
		setAttributes("name","url", parameter3);
		setAttributes("value","https://azu0sacs6ap03q.gtc.gg.group/SacsQA/", parameter3);
		
		setAttributes("name","username", parameter4);
		setAttributes("value","ggamericas\\shussaini", parameter4);
		
		setAttributes("name","password", parameter5);
		setAttributes("value","Welcome@1", parameter5);
		
		setAttributes("name","usernameInv", parameter6);
		setAttributes("value","rbhatt1", parameter6);
		
		setAttributes("name","passwordInv", parameter7);
		setAttributes("value","sacs11123", parameter7);
		
		setAttributes("name","countryLevel", parameter8);
		setAttributes("value",unit, parameter8);
		
		setAttributes("name","customerCode", parameter9);
		setAttributes("value",customerCode, parameter9);
		
		setAttributes("name","mainStore", parameter10);
		setAttributes("value",mainStore, parameter10);
		
		Element classesTag=subTag(testTag, "classes");
		
		
		Element classTag1=subTag(classesTag, "class");
		setAttributes("name","com.gg.sacs.bvt.testcases.BVTSuiteTest", classTag1);
		
		Element methodTag=subTag(classTag1,"methods");
		
		
		
		for(int i=0;i<failedList.size();i++)
		{
			Element includeTag=subTag(methodTag,"include");
		setAttributes("name",failedList.get(i), includeTag);
		}
		
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		transformer.setOutputProperty(OutputKeys.DOCTYPE_SYSTEM, doctype.getSystemId());
		DOMSource source = new DOMSource(doc);
		//if(fileObj.deleteXMLFile(createXMlFile)) {
		StreamResult result = new StreamResult(new File("failedCases.xml"));
		transformer.transform(source, result);
		
		System.out.println("XML Generated");
		
	}
	
	public void createXML_Module(String module, String unit, String customerCode, String mainStore, LinkedList<String> failedList) throws TransformerException {
		System.out.println("Enter Into createXMl Block");
		DocumentType doctype = domImpl.createDocumentType("doctype", "suite","http://testng.org/testng-1.0.dtd");
		Element suiteTag=rootTag("suite");
		setAttributes("name", "SACS_FAILED", suiteTag);
		setAttributes("thread-count", "1", suiteTag);
		setAttributes("parallel","false",suiteTag);
		
		Element listnersTag=subTag(suiteTag, "listeners");
		
		Element listnerTag1=subTag(listnersTag,"listener");
		Element listnerTag2=subTag(listnersTag,"listener");
		
		setAttributes("class-name", "org.uncommons.reportng.HTMLReporter", listnerTag1);
		setAttributes("class-name", "org.uncommons.reportng.JUnitXMLReporter", listnerTag2);
		
		Element testTag=subTag(suiteTag,"test");
		setAttributes("name", "IE-Browser", testTag);
		setAttributes("parallel", "false", testTag);
		
		Element parameter1=subTag(testTag, "parameter");
		Element parameter2=subTag(testTag, "parameter");
		Element parameter3=subTag(testTag, "parameter");
		Element parameter4=subTag(testTag, "parameter");
		Element parameter5=subTag(testTag, "parameter");
		Element parameter6=subTag(testTag, "parameter");
		Element parameter7=subTag(testTag, "parameter");
		Element parameter8=subTag(testTag, "parameter");
		Element parameter9=subTag(testTag, "parameter");
		Element parameter10=subTag(testTag, "parameter");
		
		setAttributes("name","project", parameter1);
		setAttributes("value","SACS", parameter1);
		
		setAttributes("name","sbrowser", parameter2);
		setAttributes("value","chrome", parameter2);
		
		setAttributes("name","url", parameter3);
		setAttributes("value","https://azu0sacs6ap03q.gtc.gg.group/SacsQA/", parameter3);
		
		setAttributes("name","username", parameter4);
		setAttributes("value","ggamericas\\shussaini", parameter4);
		
		setAttributes("name","password", parameter5);
		setAttributes("value","Welcome@1", parameter5);
		
		setAttributes("name","usernameInv", parameter6);
		setAttributes("value","rbhatt1", parameter6);
		
		setAttributes("name","passwordInv", parameter7);
		setAttributes("value","sacs11123", parameter7);
		
		setAttributes("name","countryLevel", parameter8);
		setAttributes("value",unit, parameter8);
		
		setAttributes("name","customerCode", parameter9);
		setAttributes("value",customerCode, parameter9);
		
		setAttributes("name","mainStore", parameter10);
		setAttributes("value",mainStore, parameter10);
		
		Element classesTag=subTag(testTag, "classes");
		
		
		Element classTag1=subTag(classesTag, "class");
		setAttributes("name","com.gg.sacs.bvt.testcases.BVTSuiteTest", classTag1);
		
		Element methodTag=subTag(classTag1,"methods");
		
		
		
		for(int i=0;i<failedList.size();i++)
		{
			Element includeTag=subTag(methodTag,"include");
		setAttributes("name",failedList.get(i), includeTag);
		}
		
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		transformer.setOutputProperty(OutputKeys.DOCTYPE_SYSTEM, doctype.getSystemId());
		DOMSource source = new DOMSource(doc);
		String xmlPath=System.getProperty("user.dir")+"\\inputFiles\\failedCases\\failedCases_"+module+".xml";
		StreamResult result = new StreamResult(new File(xmlPath));
		transformer.transform(source, result);
		System.out.println("XML Generated");
	}
	
	/*public static void main(String[] args) throws TransformerException, ParserConfigurationException {
		XMLGenerator xmlGenObj=new XMLGenerator();
		
		LinkedList<String> list=new LinkedList<String>();
		list.add("0");
		list.add("10");
		list.add("20");
		list.add("30");
		list.add("40");

		//xmlGenObj.createXML(list);
		
		
	}*/
	
	
}
