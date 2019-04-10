package home;

import java.io.*;
import java.util.List;

import javax.sql.rowset.spi.XmlWriter;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.dom4j.*;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class ExcelTest {
	public static void main(String[] args) throws IOException, DocumentException {
		SAXReader reader = new SAXReader();
		Document document = reader.read(new File("src/home/test2.xml"));
		List<Element> selectNodes = document.selectNodes("//½­Äþ");
		System.out.println(selectNodes.size());
		for (Element e : selectNodes) {
//			Element e = (Element) element.selectNodes("..").get(0);
			if (e.attributeValue("name") != null) {
				if((e.attributeValue("name").equals("nihao6")&&
						(e.getParent().getName().equals("ÄÏ¾©")))){
					e.getParent().remove(e);
				}
			}
		}
		OutputFormat format= OutputFormat.createPrettyPrint();
		format.setEncoding("gbk");
		XMLWriter writer = new XMLWriter(new FileWriter(new File("src/home/test2.xml")),format);  
        writer.write(document);  
        writer.close(); 
	}
}
