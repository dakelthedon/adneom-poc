package com.dakelthedon.service;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class PartitionService implements IPartitionService {

	private static final Logger logger = Logger.getLogger(PartitionService.class.getName());
	
	@Override
	public List<List<String>> getPartitions(List<String> lst, Integer partitionSize) {
		
		logger.info(" [Partition service] | args = "+ lst.toString());
		
		List<List<String>> partitions = new ArrayList<List<String>>();
		List<String> partition = new ArrayList<>();
		
		for (String arg : lst) {
			// if current partition size is partitionSize
			// then add the current partition to partitions and init a new partition
			if (partition.size() == partitionSize) {
				partitions.add(partition);
				partition = new ArrayList<>();
				partition.add(arg);
			} else {
				// if current partition size is not partitionSize
				// then add the current value to the current partition
				partition.add(arg);
			}
		}
		// if current partition has elements then add the current partition to Partitions
		if (partition.size() > 0) {
			partitions.add(partition);
		}
		logger.info(" [Partition service] | partitions = " + partitions.toString());
		return partitions;
	}
}
