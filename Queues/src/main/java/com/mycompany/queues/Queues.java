/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.queues;
import java.util.*;
/**
 *
 * @author RSS - Siphelele
 */

/*
Understanding java Queues.
It is a collection that is used to store objects before
they are being proccessed.
It is a FIFO 
The Queue interface is provided in java.util package 
and it implements the Collection interface.
Once an element is processed then it is removed from 
the queue and next item is picked for processing.



classes that implement a Queue to use the functionalities of a Queue 

*/


public class Queues {

    public static void main(String[] args) {
        
        
        
        Queue<Integer> qu = new LinkedList<>();
        
        ///add 5 numbers
        qu.add(2);
        qu.add(5);
        qu.add(10);
        qu.add(8);
        qu.add(12);
        
        System.out.println("------ queue -----");
        //print queue
        for(Integer obj : qu){
            System.out.println(obj);
        }
        System.out.println("\n");
        /*
        Queue already has pull() that is will automatically remove
        first element that was in first.
        Do not use Iterator in this case, we do not seach for an
        element to be removed from the queue.
        */
        Integer remove = qu.poll();
        
        System.out.println("removed element is: " + remove);
        
        
        
        System.out.println("\n");
        for(Integer obj : qu){
            System.out.println(obj);
        }
        
        /*
        2. Customer Service Queue
        Simulate customers waiting in a line.
        Requirements
        Create a queue of customer names
        Add 4 customers
        Serve customers one by one using a loop
        print:
        Goal
        
        Understand:
        
        FIFO (First In First Out)
        Looping until queue becomes empty
        
        */
        System.out.println("\n");
        Queue<String> customer = new LinkedList<>();
        
        //add customers
        customer.add("Smith");
        customer.add("Lihle");
        customer.add("Alex");
        customer.add("John");
        
        /*
        server each customer until queue is empty.
        the served customer must be removed from a queue
        queue keeps getting small we remove each customer
        */
        while(!customer.isEmpty()){
            
            //server a customer and pull
            String out = customer.poll();
            System.out.println("served custome: "+ out);
            System.out.println("done.");
            
        }
        
             
        
    }
}
