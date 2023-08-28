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
    
    public static void main (String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            while(n-- > 1){
		        tail.next = new Node(sc.nextInt());
		        tail = tail.next;
		    }
		   
		      head = new Solution().mergeSort(head);
		     printList(head);
		    System.out.println();
        }
    }
    public static void printList(Node head)
    {
        if(head == null)
           return;
           
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
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
    Node(int key)
    {
        this.data = key;
        next = null;
    }
} */

class Solution
{
    //Function to sort the given linked list using Merge Sort.
    static Node mergeSort(Node head)
    {
        // Base condition
        if (head == null || head.next == null) {
            return head;
        }
        
        // Step 1 - Find middle node
        Node mid = getMiddle(head);
        Node midNext = mid.next;
        
        // Breaking into two parts
        mid.next = null;
        
        // Step 2 - Sort left and right lists
        Node left = mergeSort(head);
        Node right = mergeSort(midNext);
        
        // Step 3 - Merge two Sorted lists
        return merge(left, right);
    }
    
    static Node merge(Node left, Node right) {
        
        if(left == null) {
            return right;
        }
        
        if(right == null) {
            return left;
        }
        
        Node dummy = new Node(-100);
        Node temp = dummy;
        
        while(left != null && right != null) {
            
            if(left.data < right.data) {
                temp.next = left;
                left = left.next;
            } else {
                temp.next = right;
                right = right.next;
            }
            
            temp = temp.next;
            
        }
        
        if (left != null) {
            temp.next = left;
        }
        
        if (right != null) {
            temp.next = right;
        }
        
        return dummy.next;
    }
    
    static Node getMiddle(Node head) {
        
        if(head == null || head.next == null) {
            return head;
        }
        
        Node slow = head;
        Node fast = head;
        
        while(fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        
        return slow;
    }
    
}


