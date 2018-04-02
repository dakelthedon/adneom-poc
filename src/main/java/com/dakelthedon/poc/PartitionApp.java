package com.dakelthedon.poc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import com.dakelthedon.service.PartitionService;

public class PartitionApp {
	
	private static final Logger logger = Logger.getLogger(PartitionApp.class.getName());
	
	public static void main(String[] args) {
		
		List<String> argsList = new ArrayList<>(Arrays.asList(args));
		logger.info("Args = " + argsList.toString());
		
		PartitionService partition = new PartitionService();
		
		List<List<String>> partitions = new ArrayList<List<String>>();
		
//		if (CollectionUtils.isEmpty(argsList)) {
//			logger.info("Partitions = " + partitions.toString());
//			return;
//		} else if (argsList.size() == 1) {
//			partitions.add(argsList);
//			logger.info("Partitions = " + partitions.toString());
//			return;
//		} else {
//			try {
//				
//			} catch (NumberFormatException e) {
//				logger.info(" Your partition size " + argsList.get(args.length - 1) + " is not a number");
//				
//			}
//		}
		
		partition.getPartitions(argsList, 2);
		
		
		
		logger.info("Hello World!");
		// System.out.println("Hello World!");
	}
}
