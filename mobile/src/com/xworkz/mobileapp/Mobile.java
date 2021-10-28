package com.xworkz.mobileapp;

import com.xworkz.mobileapp.dto.ApplicationDTO;


public class Mobile {

	
	public ApplicationDTO[] application;
	private int index;
	
	
	
	
	public Mobile(int size) {
		application =new ApplicationDTO[size]; 
		
	}
	
	public boolean createApplicationDetails(ApplicationDTO application) {
		boolean isAdded=false;
		System.out.println("inside createApplicationDetails()");
		boolean applicationAdded;
		if(application!=null) {
			this.application[index++]= application;
			applicationAdded=true;
		}
		else {
			System.out.println("No application is added");
			return applicationAdded=false;
		}
		return applicationAdded;
	}
	public void getApplicationDetails() {
		for(int i=0;i<application.length;i++) {
			System.out.println(application[i]);
		}
	}
	
	public ApplicationDTO getMobileByApplicationId(int applicationId) {
		ApplicationDTO applicationDTO=null;
	  System.out.println("inside application by getMobileByApplicationId()");
		if(applicationId>0) {
			for(int i=0;i<application.length;i++) {
				if(application[i].getApplicationId()==applicationId) {
					System.out.println("Application found by:"+applicationId);
				applicationDTO=application[i];	
				}
				else {
					System.out.println("Application not found by:"+applicationId);
				}
			}
		}
				return applicationDTO;
			}
			public ApplicationDTO getMobileByApplicationName(String applicationName) {
				ApplicationDTO applicationDTO=null;
				System.out.println("inside application by getMobileByApplicationName()");
				if(applicationName!=null) {
					for(int i=0;i<application.length;i++) {
						if(application[i].getApplicationName().equals(applicationName)) {
							System.out.println("Application found by:"+applicationName);
							applicationDTO =application[i];
						}
						else {
							System.out.println("Application not found by:"+applicationName);
						}
					}
				}
						return applicationDTO;
		}
			public void updateApplicationNameByApplicationId(String applicationName,int applicationId) {
				
				System.out.println("inside application by updateApplicationNameByApplicationId");
				if(applicationName!=null&&applicationId>0) {
					for(int i=0;i<application.length;i++) {
						if(application[i].getApplicationId()==(applicationId)) {
							System.out.println("Application Name is updated by:"+applicationId);
						      application[i].setApplicationName(applicationName);
						}
						else {
							System.out.println("Application Name is not updates:"+applicationId);
						}
				
					}
	}
			}
			public void deleteApplicationById(int applicationId) {
				System.out.println("Inside deleteApplicationById()");
				if(applicationId>0) {
					for(int i=0;i<application.length;i++) {
						if(application[i].getApplicationId()==(applicationId)) {
							System.out.println("Application Id is deleted by:"+applicationId);
							application[i].setApplicationId(applicationId);
							
						}
						else {
							System.out.println("Application Id is not deleted:"+applicationId);
						}
					}
				}
				
			}
				
	}

