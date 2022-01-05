package com.xworkz.train.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.train.dto.TrainDTO;
import com.xworkz.train.util.SqlUtil;

public class TrainDAO {

	public boolean save(TrainDTO dto) {
		Connection connection = null;
		try {
			connection = SqlUtil.getConnection();
			String sql = "insert into train.train_details values(?,?,?,?,?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setObject(1, dto.getTid());
			preparedStatement.setObject(2, dto.getTrainNo());
			preparedStatement.setObject(3, dto.getBoarding());
			preparedStatement.setObject(4, dto.getDestination());
			preparedStatement.setObject(5, dto.getSeatNO());
			preparedStatement.setObject(6, dto.getPrice());
			preparedStatement.setObject(7, dto.getCls());
			preparedStatement.setObject(8, dto.getName());
			int rows = preparedStatement.executeUpdate();
			return rows > 0 ? true : false;

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			SqlUtil.closeConnection(connection);
		}
		return false;
	}

	public boolean deleteByTrainNo(int tNo) {
		Connection connection = null;
		int affectedRow = 0;
		try {
			connection = SqlUtil.getConnection();
			String sql = "delete from train_details where trainNo=?";
			PreparedStatement prepareStatement = connection.prepareStatement(sql);
			prepareStatement.setObject(1, tNo);
			affectedRow = prepareStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			SqlUtil.closeConnection(connection);
		}
		return affectedRow > 0 ? true : false;

	}

	public boolean deleteByTrainNoAndId(int trainNo, int id) {
		Connection connection = null;
		int affectedRow = 0;
		try {
			connection = SqlUtil.getConnection();
			String sql = "delete from train_details where trainNo=? and tid=?";
			PreparedStatement prepareStatement = connection.prepareStatement(sql);
			prepareStatement.setObject(1, trainNo);
			prepareStatement.setObject(2, id);
			affectedRow = prepareStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			SqlUtil.closeConnection(connection);
		}
		return affectedRow > 0 ? true : false;

	}

	public TrainDTO getByTrainNo(int trainNo) {
		Connection connection = null;
		TrainDTO dto = new TrainDTO();

		try {
			connection = SqlUtil.getConnection();
			String sql = "select * from train_details where trainNo=?";
			PreparedStatement prepareStatement = connection.prepareStatement(sql);
			prepareStatement.setObject(1, trainNo);
			ResultSet resultSet = prepareStatement.executeQuery();
			while (resultSet.next()) {
				dto.setTid(resultSet.getInt(1));
				dto.setTrainNo(resultSet.getInt(2));
				dto.setBoarding(resultSet.getString(3));
				dto.setDestination(resultSet.getString(4));
				dto.setSeatNO(resultSet.getInt(5));
				dto.setPrice(resultSet.getInt(6));
				dto.setCls(resultSet.getString(7));
				dto.setName(resultSet.getString(8));
				System.out.println(dto);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			SqlUtil.closeConnection(connection);
		}
		return dto;

	}

	public Collection getAll() {
		Collection<TrainDTO> dto = new ArrayList<TrainDTO>();
		TrainDTO dto1 = new TrainDTO();
		Connection connection = null;
		try {
			connection = SqlUtil.getConnection();
			String sql = "select * from train_details";
			PreparedStatement prepareStatement = connection.prepareStatement(sql);
			ResultSet resultSet = prepareStatement.executeQuery();
			while (resultSet.next()) {
				dto1.setTid(resultSet.getInt(1));
				dto1.setTrainNo(resultSet.getInt(2));
				dto1.setBoarding(resultSet.getString(3));
				dto1.setDestination(resultSet.getString(4));
				dto1.setSeatNO(resultSet.getInt(5));
				dto1.setPrice(resultSet.getInt(6));
				dto1.setCls(resultSet.getString(7));
				dto1.setName(resultSet.getString(8));
				dto.add(dto1);
				System.out.println(dto1);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
          SqlUtil.closeConnection(connection);
		}
		return dto;

	}

	public TrainDTO getAllByBoarding(String boarding) {
		Connection connection = null;
		TrainDTO dto = new TrainDTO();

		try {
			connection = SqlUtil.getConnection();
			String sql = "select * from train_details where boarding=?";
			PreparedStatement prepareStatement = connection.prepareStatement(sql);
			prepareStatement.setObject(1, boarding);
			ResultSet resultSet = prepareStatement.executeQuery();
			while (resultSet.next()) {
				dto.setTid(resultSet.getInt(1));
				dto.setTrainNo(resultSet.getInt(2));
				dto.setBoarding(resultSet.getString(3));
				dto.setDestination(resultSet.getString(4));
				dto.setSeatNO(resultSet.getInt(5));
				dto.setPrice(resultSet.getInt(6));
				dto.setCls(resultSet.getString(7));
				dto.setName(resultSet.getString(8));
				System.out.println(dto);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			SqlUtil.closeConnection(connection);
		}
		return dto;

	}

	public TrainDTO getAllByDestination(String destination) {
		Connection connection = null;
		TrainDTO dto = new TrainDTO();

		try {
			connection = SqlUtil.getConnection();
			String sql = "select * from train_details where destination=?";
			PreparedStatement prepareStatement = connection.prepareStatement(sql);
			prepareStatement.setObject(1, destination);
			ResultSet resultSet = prepareStatement.executeQuery();
			while (resultSet.next()) {
				dto.setTid(resultSet.getInt(1));
				dto.setTrainNo(resultSet.getInt(2));
				dto.setBoarding(resultSet.getString(3));
				dto.setDestination(resultSet.getString(4));
				dto.setSeatNO(resultSet.getInt(5));
				dto.setPrice(resultSet.getInt(6));
				dto.setCls(resultSet.getString(7));
				dto.setName(resultSet.getString(8));
				System.out.println(dto);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			SqlUtil.closeConnection(connection);
		}
		return dto;

	}

	public boolean updateDestinationByTrainNo(String destination, int trainNo) {
		Connection connection = null;

		try {
			connection = SqlUtil.getConnection();
			String sql = "update train_details set destination=? where trainNo=?";
			PreparedStatement prepareStatement = connection.prepareStatement(sql);
			prepareStatement.setObject(1, destination);
			prepareStatement.setObject(2, trainNo);
			int rows = prepareStatement.executeUpdate();
			return rows > 0 ? true : false;
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			SqlUtil.closeConnection(connection);
		}
		return false;
	}

	public boolean updateDestinationAndBoardingByTrainNo(String destination, String boarding,int trainNo ) {
		Connection connection = null;

		try {
			connection = SqlUtil.getConnection();
			String sql = "update train_details set destination=?,boarding=? where trainNo=?";
			PreparedStatement prepareStatement = connection.prepareStatement(sql);
			prepareStatement.setObject(1, destination);
			prepareStatement.setObject(2, boarding);
			prepareStatement.setObject(3, trainNo);
			int rows = prepareStatement.executeUpdate();
			return rows > 0 ? true : false;
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			SqlUtil.closeConnection(connection);
		}
		return false;
	}
	public int getTotal() {
		Connection connection = null;
		int count1=0;

		try {
			connection = SqlUtil.getConnection();
			String sql = "select count(*) from train_details ";
			PreparedStatement prepareStatement = connection.prepareStatement(sql);
			ResultSet resultSet = prepareStatement.executeQuery();
		while(resultSet.next()) {
			count1=resultSet.getInt(1);
			System.out.println(count1);
		}
		
		
		
	}catch (SQLException e) {
		// TODO: handle exception
		e.printStackTrace();
	}finally {
		SqlUtil.closeConnection(connection);
	}
		return 1;
}
	
}