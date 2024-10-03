import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.Arrays;
import java.util.Collections;

public class Collection_FN {

    public void learnArrayList()
    {
         // Make a collection
         ArrayList<String> cars = new ArrayList<String>();
         cars.add("Volvo");
         cars.add("BMW");
         cars.add("Ford");
         cars.add("Mazda");
         cars.add("Ford");
         //Collections.sort(cars);
        
         ArrayList<String> valid = new ArrayList<String>();
             valid.add("Volvo");
             valid.add("Ford");
             valid.add("Mazda");
         cars.retainAll(valid);
        cars.forEach(car-> System.out.println(car));
    }
    public void learnStack()
    {
         Stack st = new Stack<String>();
         st.add("hello,");
         st.add("My Name");
         st.add("is Khushbu");
         System.out.println(st.pop());
         System.out.println(st);

    }
    public void learnLinkedList()
    {
         Queue queue = new LinkedList<String>();
         List list = new LinkedList<Integer>();

         queue.offer("hello");
         queue.offer("hi");
         queue.offer("GM");

         queue.peek();

         list.add(12);
         list.add(72);
         list.add(27);
         list.add(13);
         list.add(21);
         list.add(89);

         System.out.println();

    }
    public void learnPriorityQueuet()
    {
         Queue queue = new PriorityQueue<String>();
         

         queue.offer("hello");
         queue.offer("hi");
         queue.offer("GM");

         System.out.println(queue.peek());

        queue.poll();
        System.out.println(queue.peek());
        System.out.println(queue.peek());

         System.out.println(queue);

    }
    public void learnArrayDeQue()
    {
         ArrayDeque queue = new ArrayDeque<Integer>();
         

         queue.offer(23);
         queue.offerLast(34);
         queue.offerFirst(56);
         queue.offer(23);
         queue.offerLast(1);
        

         System.out.println(queue.peek());

        //queue.poll();
        //System.out.println(queue.peek());
        //System.out.println(queue.peek());

         System.out.println(queue);

    }
    public void learnSet()
    {
            Set set = new HashSet<Integer>();
            set.add(65);
            set.add(6);
            set.add(165);
            set.add(54);
            set.add(71);
            set.add(89);
           
            set.remove(65);
           
            System.out.println(set);
    }
    public void learnMap()
    {
            Map<String,Integer> map  = new TreeMap<String,Integer>();
            map.put("one",1);
            map.put("thirteen", 13);
            map.put("fortythree", 43);
            map.put("thirtyone",31);
            map.put("sixtyfive", 65);
            map.put("seventy", 70);
           // System.out.println(map.get("one"));
            //System.out.println(map);
            for (Map.Entry<String,Integer> mapElement : map.entrySet()) {
                System.out.println(mapElement);
                
            }
            for(String key : map.keySet())
            {
                System.out.println(key);
            }
            for(Integer val: map.values())
            {
                System.out.println(val);
            }
    }
    public void learnArray()
    {
            int arr[] = {1,3,5,7,8,9,12,13,15,16,19};
            String names[] = {"Khushbu","Rahul","Mishika","Myra","Advit"};
            //System.out.println(Arrays.binarySearch( arr,5));
            
            List<Integer> list = Arrays.asList(1,3,5,7,8,9,12,13,15,16,19);
            List<String> nameList = Arrays.asList(names);
            int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
            List lst = Arrays.asList(arr1);
            System.out.println(lst.size());
            
    }
    public static void main(String args[])
    {
       Collection_FN collection = new Collection_FN();
       collection.learnArray();
    }
    
}
