/*
** 2.5 
**You have two numbers represented by a linked list, where each node contains a single digit. 
** The digits are stored in reverse order, such that the Ts digit is at the head of the list. 
** Write a function that adds the two numbers and returns the sum as a linked list.
*/

//traverse both lists at the same time
//take the data of the first node of list 1, add it to the data of the first node of list 2 
//and store that number in the first node of the sum list

public static List addLists(List list1, List list2)
{
  List sum = new LinkedList();
  Node curr1 = list1.head;
  Node curr2 = list2.head;
  int theSum;
  int carryOver = 0;
  
  //keep looping through the lists until both of them are finished
  while(!(curr1.next == null && curr2.next == null))
  {
    //both of the lists still have values in them
    if(curr1 != null && curr2 != null)
    {
      theSum = curr1.data + curr2.data + carryOver;
      //only want the 1's digit of the value
      if(theSum > 9)
      {
        oneDigitSum = theSum%10;
        carryOver = theSum/10;
      }
      else
      {
        oneDigitSum = theSum;
        carryOver = 0;
      }
      //keep traversing both lists
      curr1 = curr1.next;
      curr2 = curr2.next;
    }
    
    //only list 2 has values left
    else if(curr1 == null)
    {
      theSum = curr2.data + carryOver;
      if(theSum > 9)
      {
        oneDigitSum = theSum%10;
        carryOver = theSum/10;
      }
      else
      {
        oneDigitSum = theSum;
        carryOver = 0;
      }
      curr2 = curr2.next;
    }
    
    //only list 1 has values left
    else
    {
      theSum = curr1.data + carryOver;
      if(theSum > 9)
      {
        oneDigitSum = theSum%10;
        carryOver = theSum/10;
      }
      else
      {
        oneDigitSum = theSum;
        carryOver = 0;
      }
      curr1 = curr1.next;
    }
    sum.add(OneDigitSum);
  }
  
  return sum;
}
