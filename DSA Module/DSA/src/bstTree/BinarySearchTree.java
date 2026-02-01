package bstTree;

public class BinarySearchTree<T extends Comparable<T>> {

	Node<T> root;

	public BinarySearchTree() {
		// TODO Auto-generated constructor stub
		root = null;
	}

	public void insertData(T data) {
		root = insert(root, data);
	}

	public Node<T> insert(Node<T> temp, T data) {
		// Checks if root node is Empty or not
		if (temp != null) {
			// Smaller than parent node or root Node
			if (data.compareTo(temp.getData()) < 0) {

				// left node
				// insert data in left child node and update the left child node with return
				// node and smaller values to left child node
				temp.setLeft(insert(temp.getLeft(), data));
				return temp;
			} else {
				// Greater than parent node or root Node
				// right node
				// insert data in right child node and update the left child node with return
				// node and Bigger values to right child node
				temp.setRight(insert(temp.getRight(), data));
				return temp;
			}
		}
		// Creates a new Bst root node when current BST is empty
		Node<T> temp1 = new Node<T>(data);
		return temp1;
	}

	public void display(int choice) {
		switch (choice) {
		case 1:
			System.out.println("Inorder Traversal:");
			inOrder(root);
			break;

		case 2:
			System.out.println("Preorder Traversal:");
			preOrder(root);
			break;

		case 3:
			System.out.println("Postorder Traversal:");
			postOrder(root);
			break;

		default:
			System.out.println("Invalid choice");
		}
	}

	public void inOrder(Node<T> temp) {
		if (temp != null) {
			// first left
			inOrder(temp.getLeft());
			// while returning printing the data
			System.out.println(temp.getData());
			// then right
			inOrder(temp.getRight());
		}
	}

	public void preOrder(Node<T> temp) {
		if (temp != null) {
			// while returning print value
			System.out.println(temp.getData());
			// First Left
			preOrder(temp.getLeft());
			// Then Right
			preOrder(temp.getRight());
		}
	}

	public void postOrder(Node<T> temp) {
		if (temp != null) {
			// First Left
			postOrder(temp.getLeft());
			// Then Right
			postOrder(temp.getRight());
			// Then Print
			System.out.println(temp.getData());

		}
	}

	public void deleteNode(T data) {
		root = delete(data, root);
	}

	public Node<T> delete(T data, Node<T> temp) {
		// Tree/Subtree is Empty to avoid null pointer Exception
		if (temp == null) {
			return null;
		}
		// Search in left SubTree
		if (data.compareTo(temp.getData()) < 0) {
			temp.setLeft(delete(data, temp.getLeft()));
			return temp;
		} // Search in Right SubTree
		if (data.compareTo(temp.getData()) > 0) {
			temp.setRight(delete(data, temp.getRight()));
			return temp;
		} // Node found and deletion cases
		else {
			// Leaf Node .no childrens
			if (temp.getLeft() == null && temp.getRight() == null) {
				return null;
			}
			// Only Right Child
			if (temp.getLeft() == null) {
				return temp.getRight();
			}
			// Only Left Child
			if (temp.getRight() == null) {
				return temp.getLeft();
			} // Two Childrens
			else {
				Node<T> x = temp.getRight();
				while (x.getLeft() != null) {
					x = x.getLeft();
				}
				temp.setData(x.getData());
				temp.setRight(delete(x.getData(), temp.getRight()));
			}
			return temp;
		}
	}

	public boolean search(T data) {
		return searchRec(root, data);
	}

	public boolean searchRec(Node<T> temp, T data) {
		// Tree /Leaf Node empty or not found
		if (temp == null) {
			return false;
		}

		// Child Node found
		if (data.compareTo(temp.getData()) == 0) {
			return true;
		}

		// Child Node is Smaller then go left
		if (data.compareTo(temp.getData()) < 0) {
			return searchRec(temp.getLeft(), data);
		}
		// Child Node is Bigger then go Right
		else {
			return searchRec(temp.getRight(), data);
		}

	}

}
