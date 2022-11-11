/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

 */

package datstr;

public class Check {
    
 public static void main(String[] args) {
         
        LinkedList listA  =  new LinkedList();
        LinkedList listB  =  new LinkedList();

        listA.insertAtFront(24);
        listA.insertAtFront(37);
        listA.insertAtFront(40);
        listA.insertAtFront(59);
        listA.insertAtBack(2);
        listA.insertAtBack(93);
        listA.insertAtBack(78);
        listA.insertAtBack(32);

        listB.insertAtFront(15);
        listB.insertAtFront(6);
        listB.insertAtFront(1);
        listB.insertAtFront(45);
        listB.insertAtBack(11);
        listB.insertAtBack(21);
        listB.insertAtBack(87);
        listB.insertAtBack(13);
        
        System.out.println("Linked lists is sorted:\t");
        System.out.println(listA.isSorted(listB));
        
        System.out.println("Concatenated lists :\n "+listA.concantenate(listB)+"\t");
       
        System.out.print("Merged lists : \t"+listA.merge(listB)+"\n");  
        
    }
}

