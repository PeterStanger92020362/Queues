/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Peter
 */
public class Queues {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        
        /*
        
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i = 1; i <= 10; i++) {
            queue.add(i); 
        }
        
        System.out.println("Element in the queue: "+queue);
        int removed = queue.remove();
        System.out.println(removed + " was removed");
        
        int top = queue.peek();
        System.out.println("top element is: " + top);
        
        System.out.println(queue);
        
        System.out.println(queue.poll());
        
        System.out.println(queue.element());
        
        System.out.println(queue.offer(44));
        
        System.out.println(queue);

        */
        
        //IceCreamQueue
        
       
        Queue<String> customerQ = new LinkedList<>();
        
        customerQ.add("Simon");
        customerQ.add("Steve");
        customerQ.add("Sean");
        customerQ.add("Samantha");
        customerQ.add("Stella");
        customerQ.add("Stanley");
        customerQ.add("Sara");
        
        
        
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
           @Override
           public void run() {
               
               if(! customerQ.isEmpty()){
                   System.out.println("The customer named " + customerQ.remove() + " has been served ice cream.");
                   if (customerQ.peek() == null){
                       System.out.println("That was the last customer in the queue, good job!");
                   }
               } else {
                   System.out.println("\nThere are no customers left in the queue...");
                   System.out.println("Goodbye...");
                   timer.cancel();
               }
               
           };
           };
        
        timer.schedule( task,0, 4000);
        //Thread.sleep(100000);
           
    }
        
}
    

