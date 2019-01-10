package com.biz.oracle02.db;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

import com.biz.oracle02.dao.ScoreDao;
import com.biz.oracle02.dao.StdDao;

public class OracleSQLFactory {

	SqlSessionFactory sessionFactory;
	
	public OracleSQLFactory() {
		
		Properties props = new Properties();
		
		props.put("DRIVER", DBContract.ORACLE_PRO.Driver);
		props.put("URL", DBContract.ORACLE_PRO.url);
		props.put("USER", DBContract.ORACLE_PRO.user);
		props.put("PASSWORD", DBContract.ORACLE_PRO.password);
		
		StdDataSourceFactory dataSourceFactory = new StdDataSourceFactory();
		
		dataSourceFactory.setProperties(props);
		
		DataSource dataSource = dataSourceFactory.getDataSource();
		
		TransactionFactory transactionFactory = new JdbcTransactionFactory();
		
		Environment environment = new Environment("stdEnv", transactionFactory, dataSource);
		
		Configuration config = new Configuration(environment);
		config.addMapper(StdDao.class);
		config.addMapper(ScoreDao.class);
		
		this.sessionFactory = new SqlSessionFactoryBuilder().build(config);
	}

	
	public SqlSessionFactory getSessionFactory() {
		return this.sessionFactory;
	}
	
	
}
