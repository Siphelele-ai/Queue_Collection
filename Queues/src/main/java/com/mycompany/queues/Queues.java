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
the queue and next item is picked for processing
classes that implement a Queue to use the functionalities of a Queue 
*/


public class Queues {

    public static void main(String[] args) {
        
        //Learning collections
        /*
        here I am creating an queue that will store integer elements.
        queues are created where object, element should be proccessed.
        queues are FIFO
        To remove element we do not have to seach for that element, queues
        does not allow it. Always remove the first that was in the queue
        pull() and peek() are used so.
        Linked list constructor creates an empty queue, it implements 
        from queue interface
        -peek() retrieves but does not remove from a queue
        -pull() retrieves and removes element
        */
        Queue<Integer> q = new LinkedList<>();
        
        //add 
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        
        System.out.println(q);
        
        //remove first element
        Integer obj = q.poll();
        
        System.out.println("removed element: "+obj);
        
        System.out.println(q);
        System.out.println("\n");
        //--------------------------------------------
        /*
        customer services:
        -wait in a line.
        
        */
        Queue<String> qu = new LinkedList<>();//store string objects only
        
        //add
        qu.add("asemahle");
        qu.add("zintle");
        qu.add("ayanda");
        qu.add("Nonke");
        qu.add("Siphelele");
        
        while(!qu.isEmpty()){
            String customer = qu.poll();
            System.out.println("serving customer: "+ customer);
        }
        if(qu.isEmpty()){
            System.out.println("queue is empty: "+ qu);
        }
        System.out.println("\n");
        //-----------------------------------------------
        
        /*
        browser download queue
        first file that was downloded will be the one to be uploaded
        
        */
        
        Queue<String> qe = new LinkedList<>();
        
        //add files to a queue
        qe.add("file.zip");
        qe.add("movie.mp4");
        qe.add("song.mp3");
        
        /*
        use a while loop as long queue is not empty keep
        downloading each song
        */
        while(!qe.isEmpty()){
            /*
            download and pull the song out for the queue
            */
            String song = qe.poll();
            System.out.println("downloading: "+ song);
        }
        System.out.println("\n");
        //-------------------------------------------------
        //Reverse First 3 Elements of Queue
        
        Queue<Integer> e = new LinkedList<>();
        
        e.add(10);//0
        e.add(20);//1
        e.add(30);//2
        e.add(40);//3
        e.add(50);//4
        /*
        Think about the algorithm first
        Step 1: Remove first 3 elements from queue and push to stack
        FIFO
        */
        Stack<Integer> st = new Stack<>();//empty stack
        
        /*
        Indexing of each element inside a queue
        start from 0 to 2 by removing each element
        */
        for(int i = 0; i < 3; i++){
            /*
            within empty stack, keep pulling or removing each 
            string element that has been removed from 
            a queue, do not exceed index 3
            */
            st.push(e.poll());
            
        }
        //Step 2: Pop from stack and add back to queue
        
        while(!st.isEmpty()){
            
            e.add(st.pop());
            
        }
        /*Step 3: Fix the order
        Notice the queue is now:
        [40, 50, 30, 20, 10]
        but we want:
        [30, 20, 10, 40, 50]
        How many elements were originally not reversed?
        40, 50
        Move those 2 elements from front to back
        40 -> back
        [50, 30, 20, 10, 40]
        50 -> back
        [30, 20, 10, 40, 50]
        */
        for(int i = 0; i < 2; i++){
            e.add(e.poll());
        }
        System.out.println(e);
    }
}
