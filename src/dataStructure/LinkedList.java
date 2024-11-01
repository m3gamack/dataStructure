package dataStructure;

class Node{
	
	int jerseyNumber;
	Node next;
	
	public Node(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}
}

public class LinkedList {
	private Node head;
	private int size = 0;

	public void add(int jerseyNumber) {
		
		Node newNode = new Node(jerseyNumber);
		
		if(head == null) {
			/* head is null means Linked List not created so create Linked List by assigning 					newNode to head*/
			head = newNode;
			this.size++;
			
		} else {
			// head is not null means, Linked List already created so add newNode at the end of the 				LinkedList by traversing until the end by using head
			
			Node currentNode = head;
			
			while (currentNode.next != null) {
				// current Node is not null means, next node is there so go to next node
				
				//Move to next node
				currentNode = currentNode.next;
			}
			//After while loop currentNode points to last node so add newNode to currentNode next
			currentNode.next = newNode;
			this.size++;
		}
	}
	
	public void remove(int jerseyNumber) {	
		
		Node currentNode = head;
		Node temp = null;
		
		if(currentNode != null && currentNode.jerseyNumber == jerseyNumber){	
			head = currentNode.next;
			this.size--;
			return;
		// if the first node is the jerseyNumber we're looking for, we will assign the next after the 		head to break the link. 
		}
		
		while(currentNode != null && currentNode.jerseyNumber != jerseyNumber) {
			temp = currentNode;
			currentNode = currentNode.next;
			// the while loop traverses the List. temp keeps track of the last node traversed
		}
		
		if(currentNode == null) {
			return;
			// if this is true, we have reached the end of the list
		}
		
		temp.next = currentNode.next;
		this.size--;
		// we assign the node after temp to be the node after the currentNode to break the link
	}
	
	public Node search(int jerseyNumber) {
		if(head == null) {
			System.out.println("Head of the linkedlist is currently null");
			return null;
		}
		
		Node currentNode = head;
		while(currentNode != null) {
			if(currentNode.jerseyNumber == jerseyNumber) {
				return currentNode;
			}
			currentNode = currentNode.next;
		}
		
		System.out.println("Value " + jerseyNumber + " was not found in this List");

		return null;
		
	}
	
	public Node reverse(Node head) {	
		if(head == null) {
			return head;
		}
		// there is no list to reverse
		
		Node current = head;
		Node previous = null;
		Node next = null;
		
		while(current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
			//hard to explain right now but the shit makes sense.....
			//https://youtu.be/jY-EUKXYT20?si=oa_BGAAmZm9zvVbI
		
		return previous;
		
	}
	
	public int size() {	
		return this.size;
	}
	
	public void combine(LinkedList l2) {	
		if(l2 == null) {
			System.out.println("You gave a null input for the LinkedList you want to combine");
			return;
		}
		Node currentNode = head;
		
		while(currentNode != null) {
			if(currentNode.next == null) {
				currentNode.next = l2.head;
				this.size = this.size() + l2.size();
				return;
			}
			currentNode = currentNode.next;
		}
	
		
	}
	
	public String toString() {
		Node current = this.head;
		String result = new String();
		
		while(current != null) {
			result += current.jerseyNumber + " -> ";
			current = current.next;
		}
		return result + "null";
	}
	
}

