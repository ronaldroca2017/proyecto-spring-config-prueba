package org.configuration.spring.web.service;

import org.apache.log4j.Logger;
import org.configuration.spring.web.dao.PruebaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PruebaServiceImpl implements PruebaService {
	final static Logger logger = Logger.getLogger(PruebaServiceImpl.class);

	@Autowired
	PruebaDao pruebaDao;
	
	@Override
	public void findAll() {
		logger.info("Invocando mediante la capa service al metodo findAll del dao");
		pruebaDao.findAll();
		
	}
	
	
}
