//{ Driver Code Starts
import java.util.*;
import java.io.*;

class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
    
}
class GFG{
	static void printList(Node node) 
	{ 
		while (node != null) 
		{ 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
		System.out.println(); 
	}
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            new Solution().rearrangeEvenOdd(head);
            printList(head); 
            t--;
        }
    } 
} 

// } Driver Code Ends


/*

class Node {

    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
This is method only submission.
You only need to complete the below method.
*/
class Solution
{

   // Should rearrange given linked list such that all even
   // positioned Nodes are before odd positioned.
   // Returns nothing
    void rearrangeEvenOdd(Node head)
    {
          //  The task is to complete this method
         //// if(head == null || head.next == null) {
            //return head;
         // }
        
          Node even = new Node(1);
          Node odd = new Node(1);
          
          Node evenTail = even;
          Node oddTail = odd;
          Node curr = head;
          
          int count = 0;
          while(curr != null) {
              if(count % 2 == 0) {
                  evenTail.next = curr;
                  evenTail = evenTail.next;
              } else {
                  oddTail.next = curr;
                  oddTail = oddTail.next;
              }
              count++;
              curr = curr.next;
          }
          
          //head = odd;
          oddTail.next = null;
          evenTail.next = odd.next;
          
          //return odd.next;
          
     }
}
