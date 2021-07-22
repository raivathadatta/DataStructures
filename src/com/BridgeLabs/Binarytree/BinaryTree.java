package com.BridgeLabs.Binarytree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
	static Node root;
	Queue<Node> queqe = new LinkedList<Node>();

	class Node {
		Object data;
		Node left, right;
	}

	public void insert(Object data) {
		Node temp = new Node();
		temp.data = data;

		if (root == null) {
			System.out.println(data);
			root = temp;
			queqe.add(root);
			return;
		}


		while (!queqe.isEmpty()) {

			temp = queqe.peek();
			System.out.println(temp.data + "dataaa");

			if (temp.left == null) {
				temp.left = new Node();
				temp.left.data = data;
				System.out.println(temp.left.data + "left");
				break;
			} else {
				// System.out.println(temp.left.data+"left");
				queqe.add(temp.left);
			}

			if (temp.right == null) {
				temp.right = new Node();
				temp.right.data = data;
				System.out.println(temp.right.data + "rigth");

				break;
			} else
				queqe.add(temp.right);
			queqe.remove();
		}

	}

	static void inorder1(Node temp) {
		
			  if (temp == null)
		            return;
		 
			  inorder1(temp.left);
		 
		        System.out.print(temp.data + " data ");
		 
		        inorder1(temp.right);
	}

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.insert(1);
		tree.insert(10);
		tree.insert(100);
		tree.insert(1000);
		 tree.inorder1(root);

	}
}
