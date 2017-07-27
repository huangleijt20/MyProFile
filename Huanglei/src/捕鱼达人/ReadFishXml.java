package �������;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class ReadFishXml {
	//������ȡ��ͼƬ��С�ķ���
	public List<Fish> getFish() {
		
		/**����Fish��
		 * ��x,y,width,height��fishName���浽Fish������
		 * �ѽ�ȡ������Fish���󱣴浽List������
		 */
		
		List<Fish> fishs=new ArrayList<Fish>();
		SAXReader saxReader=new SAXReader();
		try {
			
			Document doc=saxReader.read("src/day14/fish.xml");
			Element root = doc.getRootElement();
			//��ȡ��Ԫ��
			List<Element> eles=root.elements();
			//������Ԫ���е���Ԫ��
			for (Element ele : eles) {
				Fish fish=new Fish();
				if (ele.getName().equals("key")) {
					//�����Ԫ����key��ǩ���ȡ�����±�
					int index=eles.indexOf(ele);
					//��key��ǩ���ֵ����FishName
						fish.setFishName((ele.getStringValue()));
						//�ҵ�key����һ��Ԫ�� index+1
						if (eles.get(index+1).getName().equals("dict")) {
							//��dict��ǩ���Ԫ��װ������
							List<Element> dicts =eles.get(index+1).elements();
							//��ȡ�±� Ϊ1��3��5��7��Ԫ���е����֣�������Fish
							String xString =dicts.get(1).getStringValue();
							String yString=dicts.get(3).getStringValue();
							String wString=dicts.get(5).getStringValue();
							String hString=dicts.get(7).getStringValue();
							fish.setX(Integer.parseInt(xString));
							fish.setY(Integer.parseInt(yString));
							fish.setWidth(Integer.parseInt(wString));
							fish.setHeight(Integer.parseInt(hString));
							//��fish��������
							fishs.add(fish);
						}
					
				}		
				
				
			}
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		//���ؽ�ȡ������fishͼƬ����
		return fishs;
	}
	public static void main(String[] args) {
		ReadFishXml rfx = new ReadFishXml();
		List<Fish> fishs = rfx.getFish();
		try {
			BufferedImage image = ImageIO.read(new File("d:/fish/fish.png"));
			for(Fish f:fishs){
				BufferedImage pic = image.getSubimage(f.getX(),f.getY(),f.getWidth(),f.getHeight());
				ImageIO.write(pic,"png",new File("d:/fish/image/"+f.getFishName()));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
