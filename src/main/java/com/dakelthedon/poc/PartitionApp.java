package com.dakelthedon.poc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import com.dakelthedon.service.PartitionService;

public class PartitionApp {
	
	private static final Logger logger = Logger.getLogger(PartitionApp.class.getName());
	
	public static void main(String[] args) {
		
		logger.info("Welcome in partition App!");
		
		List<String> argsList = new ArrayList<>(Arrays.asList(args));
		logger.info("Args = " + argsList.toString());
		
		PartitionService partitionService = new PartitionService();
		
		List<List<String>> partitions = new ArrayList<List<String>>();
		
		if (argsList == null || argsList.isEmpty()) {
			logger.info("Partitions = " + partitions.toString());
			return;
		} else if (argsList.size() == 1) {
			partitions.add(argsList);
			logger.info("Partitions = " + partitions.toString());
			return;
		} else {
			Integer partitionSize = null;
			try {
				partitionSize = Integer.valueOf(argsList.get(argsList.size() - 1));
			} catch (NumberFormatException e) {
				logger.info(" Your partition size " + argsList.get(args.length - 1) + " is not a number");
				return;
			}
			if (partitionSize != null) {
				argsList.remove(argsList.size() - 1);
				partitions = partitionService.getPartitions(argsList, partitionSize);
			}
		}
	}
}
