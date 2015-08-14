import java.util.Queue; 
import java.util.LinkedList;

public class cQueue
{

  public static void main(String[] args)
  {
  
    Queue<String> queue = new LinkedList<>();
    
    
    // FIFO
    // This is how we can add elements in the queue
    queue.add("Jozadaque");
    queue.add("Elena");
    queue.add("Paulo");
    queue.add("Luana");
    
    // This too add elements in end of the queue 
    queue.offer("João");
    
    System.out.println(queue);
    
    System.out.println(queue.peek());
    
    // There we remove the next one of the queue
    System.out.println("removed: " + queue.poll());
    
    // We can too remove the next one with remove method
    queue.remove();
    
    System.out.println(queue.peek());
    System.out.println(queue);
    
    /* Other methods from a LinkedList */
    LinkedList<String> f = (LinkedList<String>) queue;
    
    /* So now we can work with methos:
    *  
    *  add(String e)
    *  add(int index, String element)
    *  addAll()
    *  addFirst(String e)
    *  addLast(String e)
    *
     */
    
    // Here we add a element in first position
    f.addFirst("Jhonatas");
    
    // Here we add a element in last position
    f.addLast("Nikolas");
    
    System.out.println(f);
    
    // Here we see the first and last element
    System.out.println(f.peekFirst());
    System.out.println(f.peekLast());
    
    // Here we remove first and last element
    System.out.println(f.pollFirst());
    System.out.println(f.pollLast());
    
    // And here we print the result
    System.out.println(f);
  
  }

}