package com.prog2.labs;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

/**
 * DO NOT MODIFY ANYTHING IN THIS FILE.
 */
class LabEightTests {

	@Test
	void rightSideViewTest1() {
		LabEight labEight = new LabEight();
		
		TreeNode input = new TreeNode(1);
		
		input.left = new TreeNode(2);
		input.left.right = new TreeNode(5);
		input.right = new TreeNode(3);
		input.right.right = new TreeNode(4);
		
		int[] actual = labEight.rightSideView(input)
				.stream()
				.mapToInt(i -> i)
				.toArray();
		
		// System.out.println(Arrays.toString(actual));
		
		int[] expected = {1, 3, 4};
		
		assertArrayEquals(expected, actual);
	}
	
	@Test
	void rightSideViewTest2() {
		LabEight labEight = new LabEight();
		
		TreeNode input = new TreeNode(1);
		
		input.right = new TreeNode(3);
		
		int[] actual = labEight.rightSideView(input)
				.stream()
				.mapToInt(i -> i)
				.toArray();
		
		// System.out.println(Arrays.toString(actual));
		
		int[] expected = {1, 3};
		
		assertArrayEquals(expected, actual);
	}
	
	@Test
	void rightSideViewTest3() {
		LabEight labEight = new LabEight();
		
		TreeNode input = null;
		
		int[] actual = labEight.rightSideView(input)
				.stream()
				.mapToInt(i -> i)
				.toArray();
		
		// System.out.println(Arrays.toString(actual));
		
		int[] expected = {};
		
		assertArrayEquals(expected, actual);
	}
	
	@Test
	void rightSideViewTest4() {
		LabEight labEight = new LabEight();
		
		TreeNode input = new TreeNode(23);
		
		input.left = new TreeNode(31);
		input.left.right = new TreeNode(32);
		input.right = new TreeNode(11);
		input.right.right = new TreeNode(43);
		input.right.left = new TreeNode(99);
		
		
		int[] actual = labEight.rightSideView(input)
				.stream()
				.mapToInt(i -> i)
				.toArray();
		
		// System.out.println(Arrays.toString(actual));
		
		int[] expected = {23, 11, 43};
		
		assertArrayEquals(expected, actual);
	}
}