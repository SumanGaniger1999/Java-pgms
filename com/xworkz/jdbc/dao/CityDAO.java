package com.xworkz.jdbc.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import com.xworkz.jdbc.constants.Constants;
import com.xworkz.jdbc.dto.CityDTO;

public class CityDAO {
	public boolean saveCity(CityDTO dto) {
		Connection connection=null;
		try {
			Class.forName(Constants.DRIVER);
			connection=DriverManager.getConnection(Constants.URL,Constants.USERNAME,Constants.PASSWORD);
			String insertSql="insert into city_details values("+dto.getId()+",'"+dto.getName()+"','"+dto.getPopulation()+"')";
		    Statement stat=connection.createStatement();
		    int rowsAffected=stat.executeUpdate(insertSql);
		    System.out.println("inserted rows ".concat(insertSql));
		    if(rowsAffected==1) {
		    	return true;
		    }
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (SQLException sql) {
			// TODO Auto-generated catch block
			sql.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
		
	}
	public boolean deleteCity(int id) {
		Connection connection=null;
		try {
			Class.forName(Constants.DRIVER);
			connection=DriverManager.getConnection(Constants.URL,Constants.USERNAME,Constants.PASSWORD);
			String sql="delete from city_details where city_Id="+id;
			Statement state=connection.createStatement();
			int rows=state.executeUpdate(sql);
			System.out.println("Deleted rows "+rows);
			if(rows==1) {
				return true;
			}
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException s ) {
			s.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
    }
    }
