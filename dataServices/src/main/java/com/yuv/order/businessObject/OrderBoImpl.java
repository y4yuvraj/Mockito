package com.yuv.order.businessObject;

import java.sql.SQLException;

import com.yuv.order.businessObject.Exception.BOException;
import com.yuv.order.dao.OrderDao;
import com.yuv.order.dto.Order;

public class OrderBoImpl implements OrderBO {

	public OrderDao dao;


	public OrderBoImpl(OrderDao dao) {
		super();
		this.dao = dao;
	}

	@Override
	public boolean placeOrder(Order order) throws BOException {
		try {
			int result = dao.create(order);
			if (result == 0) {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new BOException(e);
		}
		return true;
	}

	@Override
	public boolean cancelOrder(int id) throws BOException {
		try {
			Order order = dao.read(id);
			order.setStatus("cancelled");
			int result = dao.update(order);
			if (result == 0) {
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new BOException(e);
		}
		return true;
	}

	@Override
	public boolean deleteOrder(int id) throws BOException {
		try {
			int result = dao.delete(id);
			if (result == 0) {
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new BOException(e);
		}
		return false;
	}

}
