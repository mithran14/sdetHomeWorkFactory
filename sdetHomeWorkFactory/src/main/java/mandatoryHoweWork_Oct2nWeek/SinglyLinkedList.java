package mandatoryHoweWork_Oct2nWeek;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SinglyLinkedList {

	Node head;
	Node tail;
	int size = 0;

	public class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public SinglyLinkedList() {
		head = tail = null;
	}

	public Node newNode(int data) {
		Node newNode = new Node(data);
		return newNode;
	}

	public void addAll(int index, Set<Integer> elements) {
		if (index < 0 || index > size) return;

		Node currentNode = head, previousNode = null;
		int currentIndex = 0;

		while (currentIndex < index) {
			previousNode = currentNode;
			currentNode = currentNode.next;
			currentIndex++;
		}

		for (int element : elements) {
			Node newNode = newNode(element);
			newNode.next = currentNode;
			if (previousNode == null) {
				head = newNode;
			} else {
				previousNode.next = newNode;
			}
			previousNode = newNode;
			size++;
		}
	}

	public void addAllint(int[] elements) {
		for (int data : elements) {
			addToFront(data);
		}
	}

	public void addToFront(int data) {
		Node newNode = newNode(data);
		if (head == null) {
			head = tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		size++;
	}

	public int sizeNode() {
		System.out.println(size);
		return size;
	}

	public void removeNode(int index) {
		if (index < 0 || index >= size) return;

		else if (index == 0) head = head.next;
		else {
			int currentIndex = 0;
			Node currentNode = head;
			Node previousNode = head;

			while (currentNode != null) {
				if (currentIndex++ == index) {
					previousNode.next = currentNode.next;
					break;
				}
				previousNode = currentNode;
				currentNode = currentNode.next;
			}
		}
		size--;
	}
	public void insert(int data, int index) {
		if (index < 0 || index > size) return;

		Node newNode = newNode(data);
		if (index == 0) {
			newNode.next = head;
			head = newNode;
			if (size == 0) {
				tail = newNode;
			}
		} else {
			Node currentNode = head, previousNode = null;
			int currentIndex = 0;

			while (currentIndex < index) {
				previousNode = currentNode;
				currentNode = currentNode.next;
				currentIndex++;
			}

			previousNode.next = newNode;
			newNode.next = currentNode;

			if (currentNode == null) {
				tail = newNode;
			}
		}
		size++;
	}

	public void removeAll() {
		head = tail = null;
		size = 0;
	}

	public int lastIndexOf(int data) {
		if (head == null) return -1; 

		int lastIndex = -1, currentIndex = 0;
		Node currentNode = head;

		while (currentNode != null) {
			if (currentNode.data == data) {
				lastIndex = currentIndex;
			}
			currentNode = currentNode.next;
			currentIndex++;
		}
		System.out.println("Last index:"+lastIndex);
		return lastIndex;
	}
	public SinglyLinkedList clone() {
		SinglyLinkedList newList = new SinglyLinkedList();

		Node currentNode = head;

		while (currentNode != null) {
			newList.addToFront(currentNode.data);
			currentNode = currentNode.next;
		}

		return newList;
	}
	public void display() {
		Node currentNode = head;
		while (currentNode != null) {
			System.out.print(currentNode.data + " ");
			currentNode = currentNode.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {

		SinglyLinkedList list = new SinglyLinkedList();
		int[] intelementsToAdd1 = { 1, 2, 5 };
		Set<Integer> elementsToAdd = new HashSet<>(Arrays.asList(3, 4));
		list.addAllint(intelementsToAdd1);
		list.addAll(2, elementsToAdd);
		list.insert(4, 1);
		list.addToFront(5);
		list.addToFront(6);
		list.sizeNode();
		list.display();
		list.removeNode(1);
		list.lastIndexOf(5);
		list.display();
		list.removeNode(list.lastIndexOf(5));
		list.display();
		SinglyLinkedList clonedList = list.clone();
		clonedList.display(); 
		list.removeAll();
		list.display();
		list.sizeNode();
	}
}


