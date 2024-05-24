public class LList {
  private Node head;

  static class Node {
    private Node next;
    private Object data;

    public Node(Object dataValue) {
      next = null;
      data = dataValue;
    }

    // The next four methods are not needed unless a Node is being
    // accessed from outside the LList class.
    
    public Node getNext() { return next; }

    public Object getData() { return data; }

    public void setNext(Node nextValue) { 
      next = nextValue;
    }

    public void setData(Object info) {
      data = info;
    }

  }

  public LList() {
    head = null;
  }
  
  // Adds info as the head node
  public void InsertAtHead(Object info) {
    Node temp = new Node(info);
    temp.next = head;
    head = temp;
  }//

  // Adds info as the last node
  public void InsertAtTail(Object info) {
    Node it = head;
    Node temp = new Node(info);
    if (it != null) {
      while (it.next != null) {
      it = it.next;
    }
    temp.next = null;
		it.next = temp;
    }
  }

  
  // Adds new node 'info' as the node _after_ 'before'
  public void InsertItem(Node before, Object info) 
	{
		Node it = head;
    if (it != null ){
      while(it.next != null && it.next!= before)
			it = it.next;
		Node temp = new Node(info);
		temp.next = it.next;
		it.next = temp;
    }
		
  }

  // Deletes first instance of node with 'info' in data fork
  // Returns true if successful; false if the item is not found
  public boolean DeleteNode(Object info) {
  Node temp = head;
    if (temp == null ){return false;}
    while((temp.next != null) && (temp.next != info)) {
      temp = temp.next;
    }
    if(temp.next == null) {
      return false;
    }
    else
      temp.next = temp.next.next;
    return true;
  }

  // Prints data out, one item per line  
  public void PrintList() {
  Node temp = head;
    if (temp != null)
    {
      while(temp.next != null) {
      System.out.println(temp.data);
      temp = temp.next;
    }
    } 
  }

  // Looks for first instance of a node with 'target' in data fork
  // Returns a pointer to the node if found; null otherwise
  public Node Find(Object target) {
    Node temp = head;
    while (temp != null && temp.data != target){
      //if(temp.data == target)
			//	return temp;
			temp = temp.next;
    }
    return temp;
    
  }//same
}

/*
Node temp = head;
    if (head == null || temp.data==target){return temp;}
    while (temp.next != null && temp.next.data != target) {
      temp = temp.next;
    }
		return null;
*/