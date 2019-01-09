package com.biz.oracle02.db;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.ibatis.datasource.DataSourceFactory;
import org.apache.ibatis.datasource.pooled.PooledDataSource;

public class StdDataSourceFactory implements DataSourceFactory{

	/*
	 * 클래스의 member변수 영역
	 * 여기에 변수나 객체를 선언하는 것은 이 클래스의 어떤 메서드에서나 읽고 쓰기가 가능하도록 하겟다는 의미
	 */
	Properties props;
	@Override
	public void setProperties(Properties props) {
		// TODO Auto-generated method stub
		this.props = props;
		
	}

	@Override
	public DataSource getDataSource() {
		// TODO Auto-generated method stub
		PooledDataSource pds = new PooledDataSource();
		
		pds.setDriver(props.getProperty("DRIVER"));
		pds.setUrl(props.getProperty("URL"));
		pds.setUsername(props.getProperty("USER"));
		pds.setPassword(props.getProperty("PASSWORD"));
		
		return pds;
	}

}
