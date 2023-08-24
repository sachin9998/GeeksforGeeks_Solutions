//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class Driverclass
{
    public static void main (String[] args) throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine().trim());
        
        while(t-- > 0)
        {
            int n =Integer.parseInt(in.readLine().trim());
            String s[] = in.readLine().trim().split(" ");
            Node head = new Node(Integer.parseInt(s[0]));
            Node tail = head;
            for (int i = 1; i < n; i++) {
                tail.next = new Node(Integer.parseInt(s[i]));
                tail = tail.next;
            }

            head = new Solution().segregate(head);
            printList(head, out);
            out.println();
        }
        out.close();
    }
    
    public static void printList(Node head,PrintWriter out)
    {
        if(head == null)
           return;
           
        Node temp = head;
        while(temp != null)
        {
            out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
    
}




// } Driver Code Ends


//User function Template for Java

/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        // add your code here
        Node curr = head;
        Node zeroHead = new Node(-1);
        Node zero = zeroHead;
        Node oneHead = new Node(-1);
        Node one = oneHead;
        Node twoHead = new Node(-1);
        Node two = twoHead;
        
        while(curr != null) {
            
            if(curr.data == 0) {
                zero.next = curr;
                zero = zero.next;
                curr = curr.next;
            } else if(curr.data == 1) {
                one.next = curr;
                one = one.next;
                curr = curr.next;
            } else {
                two.next = curr;
                two = two.next;
                curr = curr.next;
            }
            
            
        }
        
        zeroHead = zeroHead.next;
        oneHead = oneHead.next;
        twoHead = twoHead.next;
        
        
        if(zeroHead == null && oneHead == null) {
            two.next = null;
            return twoHead;
        }
        
        if(zeroHead == null) {
            one.next = twoHead;
            two.next = null;
            return oneHead;
        }
        
        if(oneHead == null) {
            zero.next = twoHead;
            two.next = null;
            return zeroHead;
        }
        
        if(twoHead == null) {
            zero.next = oneHead;
            one.next = null;
            return zeroHead;
        }
        
        zero.next = oneHead;
        one.next = twoHead;
        two.next = null;
        
        return zeroHead;
    }
}


