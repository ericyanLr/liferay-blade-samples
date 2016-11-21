package com.liferay.blade.samples.servicebuilder.jndi;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ContextUtil {

	public static DataSource getDataSource(String name) throws NamingException {
		Context context = new InitialContext();

		Context envCtx = (Context)context.lookup("java:comp/env");

		DataSource dataSource = (DataSource)envCtx.lookup(name);

		return dataSource;
	}

}