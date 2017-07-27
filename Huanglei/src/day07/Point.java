package day07;
/*
 * 自定义泛型
 * */
public class Point<T1,T2> {
	private T1 x;
	private T2 y;
	public T1 getX() {
		return x;
	}
	public void setX(T1 x) {
		this.x = x;
	}
	public T2 getY() {
		return y;
	}
	public void setY(T2 y) {
		this.y = y;
	}
	public static void main(String[] args) {
		Point<String, Integer> point=new Point<String, Integer>();
		point.setX("电视机");
		point.setY(5000);
//		String x=point.getX();
//		Integer y=point.getY();
		System.out.println("商品："+point.getX()+",价格："+point.getY()+"元");
	}
}
