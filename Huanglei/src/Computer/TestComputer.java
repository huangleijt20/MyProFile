package Computer;



public class TestComputer {
	public static void main(String[] args) {
		CPU cpu=new MakeCPU();
		EMS ems=new MakeEMS();
		HardDisk hardDisk=new MakeHardDisk();
		Computer computer=new Computer();
		computer.setCpu(cpu);
		computer.setEms(ems);
		computer.setHardDisk(hardDisk);
		computer.showComputer();
	
	}
}
