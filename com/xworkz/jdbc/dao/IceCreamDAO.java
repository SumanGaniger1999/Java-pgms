package com.xworkz.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.jdbc.constants.Constants;
import com.xworkz.jdbc.constants.SQLConstants;
import com.xworkz.jdbc.dto.IceCreamDTO;

public class IceCreamDAO {
	public boolean saveDTO(IceCreamDTO dto) {
		Connection connection = null;
		try {
			Class.forName(SQLConstants.DRIVER);
			connection = DriverManager.getConnection(SQLConstants.URL, SQLConstants.USERNAME, SQLConstants.PASSWORD);
			String insertSql = "insert into icecream_details values(" + dto.getId() + ",'" + dto.getIce_flavour()
					+ "','" + dto.getIce_name() + "',"+dto.getPrice()+")";
			Statement state = connection.createStatement();
			int rowsAffected = state.executeUpdate(insertSql);
			System.out.println("inserted rows".concat(insertSql));
			if (rowsAffected == 1) {
				return true;
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException sql) {
			sql.printStackTrace();
		}
		return false;

	}
	public boolean deleteIceCream(int id) {
		Connection connection=null;
		try {
			Class.forName(SQLConstants.DRIVER);
			connection=DriverManager.getConnection(SQLConstants.URL,SQLConstants.USERNAME,SQLConstants.PASSWORD);
			String delete="delete from icecream_details where ice_id="+id;
			Statement state=connection.createStatement();
			int rows =state.executeUpdate(delete);
			System.out.println("Deleted row "+rows);
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

}
