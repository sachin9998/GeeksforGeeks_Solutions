//{ Driver Code Starts
import java.io.*;
import java.util.*;
class Node
{
    int data;
    Node next;
    
    Node(int x)
    {
        data = x;
        next = null;
    }
}
class GfG
{
    public static void printList(Node node) 
    { 
        while (node != null)
        { 
            System.out.print(node.data);
            node = node.next; 
        }  
        System.out.println();
    } 
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Node head = new Node( s.charAt(0) - '0' );
                    Node tail = head;
                    for(int i=1; i<s.length(); i++)
                    {
                        tail.next = new Node( s.charAt(i) - '0' );
                        tail = tail.next;
                    }
                    Solution obj = new Solution();
                    head = obj.addOne(head);
                    printList(head); 
                }
        }
}
// } Driver Code Ends


/*
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
} 
*/

class Solution
{
    public static Node addOne(Node head) 
    { 
        //code here.
        head = reverse(head);
        int carry = 1;
        
        Node dummy = new Node(0);
        Node curr = dummy;
        
        while(head != null || carry == 1) {
            int sum = 0;
            
            if(head != null) {
                sum += head.data;
                head = head.next;
            }
            
            sum += carry;
            carry = sum / 10;
            int digit = sum % 10;
            
            Node temp = new Node(digit);
            curr.next = temp;
            curr = curr.next;
            
        }
        
        dummy = dummy.next;
        dummy = reverse(dummy);
        
        return dummy;
        
    }
    
    public static Node reverse(Node head) {
        
        Node prev = null;
        Node curr = head;
        Node next = null;
        
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        return prev;
        
    }
    
    
}
