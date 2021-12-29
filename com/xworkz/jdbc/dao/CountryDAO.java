package com.xworkz.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.jdbc.constants.Constants;
import com.xworkz.jdbc.dto.CountryDTO;

public class CountryDAO {
public boolean saveCountry(CountryDTO dto) {
	Connection connection=null;
	try {
		Class.forName(Constants.DRIVER);
		connection=DriverManager.getConnection(Constants.URL,Constants.USERNAME,Constants.PASSWORD);
		String str="insert into countryl_details values("+dto.getId()+",'"+dto.getCountryName()+"',"+dto.getCode()+",'"+dto.getContinent()+"')";
		Statement stat=connection.createStatement();
		int rows=stat.executeUpdate(str);
		System.out.println(rows);
		if(rows==1) {
			return true;
		}
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}catch(SQLException s) {
		s.printStackTrace();
	}finally {
		if(connection!=null) {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	return false;
	
}
public boolean deleteCountry(int id) {
	Connection connection=null;
	try {
		Class.forName(Constants.DRIVER);
		connection=DriverManager.getConnection(Constants.URL,Constants.USERNAME,Constants.PASSWORD);
		String sql="delete from countryl_details where country_Id="+id;
		Statement state=connection.createStatement();
		int rowsAffected=state.executeUpdate(sql);
		
		System.out.println("Deleted rows "+rowsAffected);
		if(connection!=null) {
			return true;
		}
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}catch(SQLException sql) {
		sql.printStackTrace();
	}finally {
		if(connection!=null) {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	return false;
	
	
}
}
