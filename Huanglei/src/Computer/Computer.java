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
		System.out.println("���������Ϣ���£�");
		System.out.println("CPU��Ʒ���ǣ�"+cpu.getCPUBrand()+"����Ƶ��"+cpu.getFrequency()+"GHz");
		System.out.println("Ӳ�������ǣ�"+hardDisk.getCapacity()+"GB");
		System.out.println("�ڴ������ǣ�"+ems.getSize()+"GB");
	}
	public Computer() {
		// TODO Auto-generated constructor stub
	}
}
