
package com.xworkz.hospitalapp.hospital;

import com.xworkz.hospitalapp.dto.AddressDTO;
import com.xworkz.hospitalapp.dto.AreaDTO;
import com.xworkz.hospitalapp.dto.CountryDTO;
import com.xworkz.hospitalapp.dto.DistrictDTO;
import com.xworkz.hospitalapp.dto.PatientDTO;
import com.xworkz.hospitalapp.dto.StateDTO;
import com.xworkz.hospitalapp.dto.StreetDTO;

public class Hospital {
	public PatientDTO[] patients;
	  private int index;
	  
	  
      
	public Hospital(int size){
	  patients=new PatientDTO[size];
	  
	}

	public boolean createPatientDetails(PatientDTO patients){
	boolean patientAdded=false;
	System.out.println("inside createPatient()");
	if(patients!=null){
	  this.patients[index++]=patients;
	  patientAdded=true;
	}

	else{
	System.out.println("No Patient added");
	return patientAdded=false;
	}
	return patientAdded;
	}

	public void getAllPatients(){
	for(int i=0;i<patients.length;i++){
	System.out.println(patients[i]);
	}
	}

	public PatientDTO getPatientByName(String patientName){
	PatientDTO patientDTO=null;
	System.out.println("inside getPatientByName()");
	if(patientName!=null){
	   for(int i=0;i<patients.length;i++){
	     if(patients[i].getPatientName().equals(patientName)){
	System.out.println("Patient found by Name:"+patientName);
	   patientDTO=patients[i];
	     }
	  
	else{
	System.out.println("No Patient Found by Name:"+patientName);
	}
	   }
	}
	return patientDTO;
	}

	public PatientDTO getPatientById(int patientId){
	PatientDTO patientDTO=null;
	System.out.println("inside getPatientById()");
	if(patientId!=0){
	   for(int i=0;i<patients.length;i++){
	     if(patients[i].getPatientId()== patientId){
	System.out.println("Patient found by PatientId:"+patientId);
	   patientDTO=patients[i];
	     }
	  
	
	else{
	System.out.println("No Patient Found by PatientId:"+patientId);
	}
	   }
	}
	return patientDTO;
	}

	public PatientDTO getPatientByAge(int age){
	PatientDTO patientDTO=null;
	System.out.println("inside getPatientByAge()");
	if(age!=0){
	   for(int i=0;i<patients.length;i++){
	     if(patients[i].getAge()== age){
	System.out.println("Patient found by Age:"+age);
	   patientDTO=patients[i];
	     }
	  
	else{
	System.out.println("No Patient Found by Age:"+age);
	}
	   }
	}
	return patientDTO;
	}

	public PatientDTO getPatientByAddress(String address){
	PatientDTO patientDTO=null;
	System.out.println("inside getPatientByAddress()");
	if(address!=null){
	   for(int i=0;i<patients.length;i++){
	     if(patients[i].getAddress().equals(address)){
	System.out.println("Patient found by Address:"+address);
	   patientDTO=patients[i];
	     }
	  
	else{
	System.out.println("No Patient Found by Address:"+address);
	}
	}
}
	return patientDTO;
	}

	public PatientDTO getPatientByBloodGroup(String bloodGroup){
	PatientDTO patientDTO=null;
	System.out.println("inside getPatientByBloodGroup()");
	if(bloodGroup!=null){
	   for(int i=0;i<patients.length;i++){
	     if(patients[i].getBloodGroup().equals(bloodGroup)){
	System.out.println("Patient found by BloodGroup:"+bloodGroup);
	   patientDTO=patients[i];
	     }
	  
	else{
	System.out.println("No Patient Found by BloodGroup:"+bloodGroup);
	}
	}
}
	return patientDTO;
	}

	public PatientDTO getPatientByContactNo(long contactNo){
	PatientDTO patientDTO=null;
	System.out.println("inside getPatientByContactNo()");
	if(contactNo!=0L){
	   for(int i=0;i<patients.length;i++){
	     if(patients[i].getContactNo()==contactNo){
	System.out.println("Patient found by ContactNo:"+contactNo);
	   patientDTO=patients[i];
	     }
	  
	
	else{
	System.out.println("No Patient Found by ContactNo:"+contactNo);
	}
	   }
	   }
	return patientDTO;
	}

	public PatientDTO getPatientByGender(char gender){
	PatientDTO patientDTO=null;
	System.out.println("inside getPatientByGender()");
	if(gender!='\u0000'){
	   for(int i=0;i<patients.length;i++){
	     if(patients[i].getGender()==gender){
	System.out.println("Patient found by Gender:"+gender);
	   patientDTO=patients[i];
	     }
	  
	else{
	System.out.println("No Patient Found by Gender:"+gender);
	}
	   }
	}
	return patientDTO;
	}
	public PatientDTO getPatientByStreetName(String streetName) {
		PatientDTO patientDTO=null;
		System.out.println("inside getPatientByStreetName()");
		if(streetName!=null) {
			for(int i=0;i<patients.length;i++) {
				
				PatientDTO patient=patients[i];
				
			
				if(patients[i].getAddress().getCountry().getState().getDistrict().getArea().getStreet().getStreetName().equals(streetName)) {
					System.out.println("State found by Name:"+streetName);
					patientDTO=patients[i];
				}
					
				
		
		else {
			System.out.println("No State found by Name:"+ streetName);
		}
			}
		}
		return patientDTO;
		}

	public PatientDTO getPatientByStateName(String stateName) {
					PatientDTO patientDTO=null;
					System.out.println("inside getPatientByStateName()");
					if(stateName!=null) {
						for(int i=0;i<patients.length;i++) {
							
							PatientDTO patient=patients[i];
							
						
							if(patients[i].getAddress().getCountry().getState().getStateName().equals(stateName)) {
								System.out.println("State found by Name:"+stateName);
								patientDTO=patients[i];
							}
								
							
					
					else {
						System.out.println("No State found by Name:"+ stateName);
					}
						}
					}
					return patientDTO;
					}
				
				
				public  PatientDTO getPatientByAreaName(String areaName) {
					PatientDTO	patientDTO=null;
					System.out.println("inside getPatientByAreaName()");
					if(areaName!=null) {
						for(int i=0;i<patients.length;i++) {
							PatientDTO patient=patients[i];
							if(patients[i].getAddress().getCountry().getState().getDistrict().getArea().getAreaName().equals(areaName)) {
								System.out.println("Area found by Name:"+areaName);
								patientDTO=patients[i];
							}
						
					else {
						System.out.println("No Area found by Name:"+areaName);
					}
						}
					}
					return patientDTO;
				}
				

     public PatientDTO getPatientByStreetNo(int streetNo) {
    	PatientDTO  patientDTO=null;
    	 System.out.println("inside getPatientByStreetNo()");
    	 if(streetNo!=0) {
    		 for(int i=0;i<patients.length;i++) {
    			 PatientDTO patient=patients[i];
					
    			 
    			 if(patients[i].getAddress().getCountry().getState().getDistrict().getArea().getStreet().getStreetNo()==streetNo) {
						System.out.println("Street found by No:"+streetNo);
						patientDTO=patients[i];
					}
				
			
			else {
				System.out.println("No Street found by Name:"+streetNo);
			}
    	 }
    	 }
    	 return patientDTO;
    		 
    	 }
   
     
    
public void updateContactNoById(int patientId,long contactNo){
	System.out.println("inside updateContactNoById()");
	if(patientId>0&&contactNo>0){
	   for(int i=0;i<patients.length;i++){
	     if(patients[i].getPatientId()==(patientId)){
	System.out.println("Patient contact No updated by:"+contactNo);
	   patients[i].setContactNo(contactNo);
	     }
	  }
	}

	else{
	System.out.println("Patient contact No not updated");
	}
	}

public void deletePatientById(int patientId){
	System.out.println("Inside deletePatientById()");
	if(patientId > 0){
	for(int i=0; i<patients.length; i++){
	if(patients[i].getPatientId()==(patientId)){
	System.out.println("Patient deleted by id : "+patientId);
	patients[i].setPatientId(patientId);
	}
	}
	}
	else
	{
	System.out.println("Patient is not deleted");
	}
	
	}
}
	
	
	
	
	
	
	