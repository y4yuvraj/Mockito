package com.yuv.order.businessObject;

//import static org.junit.jupiter.api.Assertions.*;

//import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;


import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

import java.sql.SQLException;

import com.yuv.order.businessObject.Exception.BOException;
import com.yuv.order.dao.OrderDao;
import com.yuv.order.dao.OrderDaoImpl;
import com.yuv.order.dto.Order;

@ExtendWith(MockitoExtension.class)
class OrderBoImplTest {


	@InjectMocks
	private OrderBoImpl bo;
	
	@Mock
	OrderDaoImpl dao;

	@BeforeEach
	public void setup() {

	}

	@Test
	void placeOrderShouldCreateOrder() throws SQLException, BOException {

		System.out.println("started test 1");

		Mockito.when(dao.create(Mockito.any(Order.class))).thenReturn(1);
		
		boolean result = bo.placeOrder(Mockito.any(Order.class));
		assertTrue(result);
		verify(dao).create(Mockito.any(Order.class));
	}

//	@Test
//	void placeOrderShouldNotCreateOrder() throws SQLException, BOException {
//
//		System.out.println("test2");
//		Order order = new Order();
//
//		when(dao.create(order)).thenReturn(new Integer(0));
//		boolean result = bo.placeOrder(order);
//
//		System.out.println("test3");
//		Assertions.assertTrue(result);
//		verify(dao).create(order);
//	}

}
