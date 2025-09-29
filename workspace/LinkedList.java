/*
Problem:  Write a program that keeps and manipulates a linked list of
	    String data. The data will be provided by the user one item at a time.
      The user should be able to do the following operations:
                     -add "String"
                                adds an item to your list (maintaining alphabetical order)
                     -remove "String"
                                if the item exists removes the first instance of it
                     -show
                                should display all items in the linked list
                     -clear
                               should clear the list
	Input:  commands listed above
	Output:  the results to the screen of each menu
	    choice, and error messages where appropriate.
*/

//Code written by William Walker
//Written on 09/27/2025

public class LinkedList{

  //instance varialbes go here (think about what you need to keep track of!)
  new ListNode header(null, null);

  //constructors go here
  public LinkedList(){
    
  }

  //precondition: the list has been initialized
  //postcondition: the ListNode containing the appropriate value has been added and returned
  public ListNode addAValue(String line)
  {
    if(header == null) 
      header = new ListNode(line, null);
    else{
      new ListNode node = header;
      while(node.getNext() != null && node.getValue().compareTo(line) > 0)
        node = node.getNext();
      if(node.getNext() == null)
        node.setNext(new ListNode(line, null));
      else
        node.setNext(new ListNode(line, node.getNext()));
      return node.getNext();
    }
  }

  //precondition: the list has been initialized
  //postcondition: the ListNode containing the appropriate value has been deleted and returned.
  //if the value is not in the list returns null
  public ListNode deleteAValue(String line)
  {
    if(header == null)
      return null;
    else{
      new ListNode node = header;
      while(node.getNext() != null && !node.getValue().equals(line)){
        prevNode = node;
        node = node.getNext();
      }
      if(node.getNext() == null)
        return null;
      else
        prevNode.setNext(node.getNext());
      return node;
    }
  }

  //precondition: the list has been initialized
  //postconditions: returns a string containing all values appended together with spaces between.
  public String showValues()
  {
    String list = "";
    new ListNode node = header;
    while(node != null)
      list = list + " " + node.getValue();
      node = node.getNext();
    return list;
  }

  //precondition: the list has been initialized
  //postconditions: clears the list.
  public void clear()
  {
    header = null;
  }
}
