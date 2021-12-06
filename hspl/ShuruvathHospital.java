package com.xworkz.hspl;

public class ShuruvathHospital {
	public static void main(String[] args) throws CloneNotSupportedException {
		Hospital hspl=new Hospital();
		hspl.setName("Nayak Hospital");
		hspl.setNoOfDoctors(8);
		hspl.setNoOfPatients(20);
		
		Object obj= hspl.clone();
		Hospital hp=(Hospital)obj;
		
		System.out.println(hp.getName());
		System.out.println(hp.getNoOfDoctors());
		System.out.println(hp.getNoOfPatients());
		
		
	}

}
