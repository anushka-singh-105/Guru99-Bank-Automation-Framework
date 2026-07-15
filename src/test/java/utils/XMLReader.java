package utils;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;

public class XMLReader {

	private Document doc;

	public XMLReader() {

		try {

			File file = new File("src/test/resources/testdata.xml");

			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

			DocumentBuilder builder = factory.newDocumentBuilder();

			doc = builder.parse(file);

			doc.getDocumentElement().normalize();

		} catch (Exception e) {

			e.printStackTrace();

		}
	}

	public String getData(String parentTag, String childTag) {

		return doc.getElementsByTagName(parentTag)
				.item(0)
				.getChildNodes()
				.item(getChildIndex(parentTag, childTag))
				.getTextContent()
				.trim();

	}

	private int getChildIndex(String parentTag, String childTag) {

		for (int i = 0; i < doc.getElementsByTagName(parentTag).item(0).getChildNodes().getLength(); i++) {

			if (doc.getElementsByTagName(parentTag).item(0).getChildNodes().item(i).getNodeName().equals(childTag)) {

				return i;

			}

		}

		return -1;

	}
}