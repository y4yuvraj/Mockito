package com.yuv.order.businessObject.Exception;

import java.sql.SQLException;

public class BOException extends Exception {

	private static final long serialVersionUID = 1L;

	public BOException(SQLException e) {
		// TODO Auto-generated constructor stub
		super(e);
	}

}
