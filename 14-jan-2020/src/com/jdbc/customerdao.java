package com.jdbc;

import java.sql.SQLException;

public interface customerdao {

	public customer createcustomer(String name, String email) throws SQLException;
}
