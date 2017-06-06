package org.configuration.spring.web.dao;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

@Repository
public class PruebaDaoImp implements PruebaDao {
	final static Logger logger = Logger.getLogger(PruebaDaoImp.class);
	
	
	
	
	@Override
	public void findAll() {
		logger.info("Busca todo los archivos del daoImpl");
		
	}

}
