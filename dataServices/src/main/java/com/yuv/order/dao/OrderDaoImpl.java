package com.yuv.order.dao;

import java.sql.SQLException;

import com.yuv.order.dto.Order;

public class OrderDaoImpl implements OrderDao {

	@Override
	public int create(Order order) throws SQLException {
		// TODO Auto-generated method stub
		// we will not implement these since we will mock out these methods
		return 0;
	}

	@Override
	public Order read(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(Order order) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}
