package day14;

import java.io.File;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
/**
 * getRootElement();获取根元素
 * .elements();获取子元素集合
 * attributeValue("name");获取元素里面的属性值 <P name="值"></P>
 * getStringValue();获取元素中的内容 <P>内容</P>
 * @author kyaccp
 *
 */

public class ReadXml {

	public static void main(String[] args) {
		SAXReader reader=new SAXReader();
		try {
			//创建文档读取XML文件
			Document doc=reader.read(new File("src/day14/phone.xml"));
			//获取根元素
			Element root=doc.getRootElement();
			//获取第一级子元素集合
			List<Element> brands=root.elements();
			//遍历第一级子元素
			for (Element brand : brands) {
				//获取第一级子元素的属性名
				String brandName=brand.attributeValue("name");
				//获取第二级子元素集合
				List<Element> types=brand.elements();
				for (Element type : types) {
					String typeName=type.attributeValue("name");
					//获取第二级子元素中的内容
					String content=type.getStringValue();
					//创建对象接收元素内容
					Phone phone=new Phone();
					phone.setBrand(brandName);
					phone.setType(typeName);
					phone.setContent(content);
					System.out.println(phone);
					
				}
				
			}
			
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}

}
