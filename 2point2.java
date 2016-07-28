import java.util.*

public static int getLength(Node head)
{
  Node cur = head;
  int length = 0;
  while(curr != null)
  {
    length++;
    cur = curr.next;
  }
  return length;
}

public static void removeNth(Node head, int n, int length)
{
  int nthToLast = length - n;
  if(nthToLast < 0)
  {
    System.out.println("Invalid removal value");
    return;
  }
  
  int iterator = 0;
  Node curr = head;
  while(iterator != nthToLast - 1)
  {
    curr = curr.next;
    iterator++;
  }
  curr.next = curr.next.next;
}

public static void main (String[] args)
{
  List list = new List();
  list.head = addElements(list); //arbitrary function that adds to the list and returns the head
  int sizeOf;
  sizeOf = getLength(list.head);
  int n = 3;
  removeNth(list.head, n, sizeOf);
}
