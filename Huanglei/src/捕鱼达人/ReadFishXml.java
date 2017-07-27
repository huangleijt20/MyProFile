package 捕鱼达人;

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
	//创建截取鱼图片大小的方法
	public List<Fish> getFish() {
		
		/**创建Fish类
		 * 把x,y,width,height，fishName储存到Fish对象中
		 * 把截取出来的Fish对象保存到List集合中
		 */
		
		List<Fish> fishs=new ArrayList<Fish>();
		SAXReader saxReader=new SAXReader();
		try {
			
			Document doc=saxReader.read("src/day14/fish.xml");
			Element root = doc.getRootElement();
			//获取根元素
			List<Element> eles=root.elements();
			//遍历根元素中的子元素
			for (Element ele : eles) {
				Fish fish=new Fish();
				if (ele.getName().equals("key")) {
					//如果子元素是key标签则获取他的下标
					int index=eles.indexOf(ele);
					//把key标签里的值付给FishName
						fish.setFishName((ele.getStringValue()));
						//找到key的下一个元素 index+1
						if (eles.get(index+1).getName().equals("dict")) {
							//把dict标签里的元素装入数组
							List<Element> dicts =eles.get(index+1).elements();
							//截取下标 为1，3，5，7的元素中的文字，并付给Fish
							String xString =dicts.get(1).getStringValue();
							String yString=dicts.get(3).getStringValue();
							String wString=dicts.get(5).getStringValue();
							String hString=dicts.get(7).getStringValue();
							fish.setX(Integer.parseInt(xString));
							fish.setY(Integer.parseInt(yString));
							fish.setWidth(Integer.parseInt(wString));
							fish.setHeight(Integer.parseInt(hString));
							//把fish存入数组
							fishs.add(fish);
						}
					
				}		
				
				
			}
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		//返回截取出来的fish图片集合
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
