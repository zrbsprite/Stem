package com.stem.util;

import java.io.IOException;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class JaxbUtlils {

	public static String bean2Xml(Object obj){
		JAXBContext context;
		String xml = "";
		try{
			context = JAXBContext.newInstance(obj.getClass());
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);
			StringWriter sw = new StringWriter();
			marshaller.marshal(obj, sw);
			xml = sw.toString();
			sw.close();
			sw = null;
		} catch (JAXBException e){
			e.printStackTrace();
		} catch (IOException e){
			e.printStackTrace();
		}  
		return xml;
	}
}
