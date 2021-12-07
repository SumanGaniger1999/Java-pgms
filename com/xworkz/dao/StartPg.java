package com.xworkz.dao;



public class StartPg {
	public static void main(String[] args) {                    
		PgDAO dao=new PgDAO();                                  
		                                                        
		dao.create("Khushi PG");                                
		dao.create("Manjunath PG");                             
		dao.create("Special PG");                               
		                                                        
		                                                        
		boolean found=dao.find("Khushi PG");                    
		                                                        
		System.out.println(found);                              
		                                                        
		found=dao.findByCaseInSensitive("Khushi Pg");           
		System.out.println(found);                              
		                                                        
		found=dao.findByCaseInSensitiveAndTrimmed("Khushi Pg"); 
		System.out.println(found);                              
	}                                                           
	}                                                           
	                                                            

