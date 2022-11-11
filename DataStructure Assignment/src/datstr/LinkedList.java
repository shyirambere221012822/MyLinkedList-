/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datstr;

/**
 *
 * @author isimbi
 */
public class LinkedList {
    

    class Node {
        int data;
        Node next;

        public Node() {
            next = null;
        }

        public Node(int num) {
            data = num;
            next = null;
        }

    }
    Node head;
    Node tail;
    int size;

    public LinkedList() {
        head = null;
        tail = null;
        size = 0;

    }

    public LinkedList(int num) {
        Node node = new Node(num);
        head = node;
        tail = node;
        size = 1;
    }

    public int size() 
    {
        return size;
    }

    public boolean isEmpty() 
    {
        return size() == 0;

    }

    public void insertAtFront(int num)
    {
        Node node = new Node(num);
        if (isEmpty()) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head = node;
        }
        size++;

    }

    public  void insertAtBack(int num){
        Node  node  =  new Node(num);
        if (isEmpty()) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }


  
    public String toString()
    { 
        String str =  new String("");
        if (!isEmpty()) {
            Node newNode = head;
            
            while (newNode != null) {
                str += "  "+newNode.data;
                newNode = newNode.next;
            }
         
        }
        return  str;
    }
	
    public LinkedList concantenate(LinkedList  List1) {
     if(List1.head == null){
        return null;
     }
     else{
        Node node =List1.head;
        while (node !=null) {
            insertAtBack(node.data);
            node =  node.next;
        }
     }
       return this;
    }

    public  boolean isSorted(LinkedList linkedlist){
         
        Node newNode = linkedlist.head;
        while (newNode.next != null) {
            if (newNode.data > newNode.next.data) {
               return false;
            }
            newNode = newNode.next;
        }
        return true;
    }
  


     public   LinkedList  merge(LinkedList linkedlist){ 

     if(!(isSorted(linkedlist) && isSorted(this))){
        return null;
     }
     else{
        this.concantenate(linkedlist);
        System.out.println(this.toString());
        Node newNode = this.head, current = null;  
            
            while(newNode != null) {  
                current = newNode.next;  
                while(current != null) {  
                    if(newNode.data > current.data) {  
                      int  newdata = newNode.data;  
                        newNode.data = current.data;  
                        current.data = newdata;  
                    }  
                    current = current.next;  
                }  
                current = current.next;  
            }      
        }  

     return this;
    }

    
}

