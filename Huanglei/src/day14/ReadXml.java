package day14;

import java.io.File;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
/**
 * getRootElement();��ȡ��Ԫ��
 * .elements();��ȡ��Ԫ�ؼ���
 * attributeValue("name");��ȡԪ�����������ֵ <P name="ֵ"></P>
 * getStringValue();��ȡԪ���е����� <P>����</P>
 * @author kyaccp
 *
 */

public class ReadXml {

	public static void main(String[] args) {
		SAXReader reader=new SAXReader();
		try {
			//�����ĵ���ȡXML�ļ�
			Document doc=reader.read(new File("src/day14/phone.xml"));
			//��ȡ��Ԫ��
			Element root=doc.getRootElement();
			//��ȡ��һ����Ԫ�ؼ���
			List<Element> brands=root.elements();
			//������һ����Ԫ��
			for (Element brand : brands) {
				//��ȡ��һ����Ԫ�ص�������
				String brandName=brand.attributeValue("name");
				//��ȡ�ڶ�����Ԫ�ؼ���
				List<Element> types=brand.elements();
				for (Element type : types) {
					String typeName=type.attributeValue("name");
					//��ȡ�ڶ�����Ԫ���е�����
					String content=type.getStringValue();
					//�����������Ԫ������
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
