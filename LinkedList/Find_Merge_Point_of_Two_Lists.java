/*
  class Node {
     int data;
     Node next;
  }
*/
int FindMergeNode(Node headA, Node headB) {
    // Complete this function
    // Do not write the main method. 

    headA = headA.next;
    
    while(headA.next != null){
        Node curB = headB.next;
        while(curB != null){
            if(headA.data == curB.data)
                return headA.data;
            else
                curB = curB.next;
        }
        headA = headA.next;
    }
    return headA.data;
}