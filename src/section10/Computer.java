package section10;

import java.security.DomainCombiner;

public class Computer {
	//속성(멤버변수)
	String brand;
	String cpu;
	int ram;
	int hdd;
	String gpu;
	
	public void getInfo() {
		System.out.println("brand: "+brand);
		System.out.println("cpu: "+cpu);
		System.out.println("ram: "+ram);
		System.out.println("hdd: "+hdd);
		System.out.println("gpu: "+gpu);
	}


}
