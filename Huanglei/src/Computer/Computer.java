package Computer;

public class Computer {
	CPU cpu;
	EMS ems;
	HardDisk hardDisk;
	
	public CPU getCpu() {
		return cpu;
	}
	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}
	public EMS getEms() {
		return ems;
	}
	public void setEms(EMS ems) {
		this.ems = ems;
	}
	public HardDisk getHardDisk() {
		return hardDisk;
	}
	public void setHardDisk(HardDisk hardDisk) {
		this.hardDisk = hardDisk;
	}
	public Computer (CPU cpu,EMS ems,HardDisk hardDisk) {
		this.cpu=cpu;
		this.ems=ems;
		this.hardDisk=hardDisk;
	}
	public void showComputer() {
		System.out.println("计算机的信息如下：");
		System.out.println("CPU的品牌是："+cpu.getCPUBrand()+"，主频："+cpu.getFrequency()+"GHz");
		System.out.println("硬盘容量是："+hardDisk.getCapacity()+"GB");
		System.out.println("内存容量是："+ems.getSize()+"GB");
	}
	public Computer() {
		// TODO Auto-generated constructor stub
	}
}
