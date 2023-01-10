package com.yuv.order.businessObject;

import com.yuv.order.businessObject.Exception.BOException;
import com.yuv.order.dto.Order;

public interface OrderBO {

	boolean placeOrder(Order order) throws BOException;

	boolean cancelOrder(int id) throws BOException;

	boolean deleteOrder(int id) throws BOException;

}
