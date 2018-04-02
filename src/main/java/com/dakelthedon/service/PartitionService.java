package com.dakelthedon.service;

import java.util.List;
import java.util.logging.Logger;

public class PartitionService implements IPartitionService {

	private static final Logger logger = Logger.getLogger(PartitionService.class.getName());
	
	@Override
	public List<List<String>> getPartitions(List<String> lst, Integer partitionSize) {
		
		logger.info(" In partition service | args = "+ lst.toString());
		return null;
	}

}
