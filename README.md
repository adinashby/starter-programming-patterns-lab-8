# Programming Patterns - Lab 8

This template repository is the starter project for Programming Patterns Lab 8. Written in Java, and tested with Gradle/JUnit.

### Question(s)

Given the `root` of a binary tree, imagine yourself standing on the **right side** of it, return the values of the nodes you can see ordered from top to bottom.

Example 1:

![](Q1.jpg)

Input: root = [1, 2, 3, null, 5, null, 4]  
Output: [1, 3, 4]

Example 2:

Input: root = [1, null, 3]  
Output: [1, 3]

Example 3:

Input: root = []  
Output: []

**Constraints**

- The number of nodes in the tree is in the range [0, 100].
- -100 <= Node.val <= 100

### Setup Command

`gradle clean`

### Run Command

`gradle test`
