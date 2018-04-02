package com.dakelthedon.service;

import java.util.List;

public interface IPartitionService {
	
	/**
	 * Method to get partition from a list of string
	 * @param lst
	 * @param partitionSize
	 * @return
	 */
	List<List<String>> getPartitions(List<String> lst, Integer partitionSize);
}
