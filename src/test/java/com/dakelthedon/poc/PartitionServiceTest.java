package com.dakelthedon.poc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import com.dakelthedon.service.PartitionService;

public class PartitionServiceTest {

	private PartitionService partitionService = Mockito.mock(PartitionService.class);
	
	@Test
	public void testGetPartition() {
		List<String> args = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5", "6"));
		List<List<String>> expectedPartition = this.getPartitionMock();
		System.out.println("expectedPartition = " + expectedPartition);
		Mockito.when(partitionService.getPartitions(args, 2)).thenReturn(expectedPartition);
		Assert.assertEquals(expectedPartition.size(), partitionService.getPartitions(args, 2).size());
	}

	/**
	 * Method to get Partition Mock
	 * @return
	 */
	private List<List<String>> getPartitionMock() {
		List<List<String>> partition = new ArrayList<List<String>>();
		
		List<String> firstPart = new ArrayList<>(Arrays.asList("1", "2"));
		List<String> secondPart = new ArrayList<>(Arrays.asList("3", "4"));
		List<String> thirdPart = new ArrayList<>(Arrays.asList("5", "6"));
		partition.add(firstPart);
		partition.add(secondPart);
		partition.add(thirdPart);
		return partition;
	}
}
