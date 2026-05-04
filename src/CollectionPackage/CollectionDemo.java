package CollectionPackage;

import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        //1. List => ordered collection that allow duplicates and positional element access
        List<String> languages   = new ArrayList<>();

        languages.add("java");
        languages.add("python");
        languages.add("C++");
        languages.add("python");

        //access elements
        System.out.println("Item in 0th index " + languages.get(2));
        System.out.println("check the size of the list " + languages.size());

        System.out.println(languages);

        //iterate over lists
        for(String lan:languages){
            System.out.println(lan);
        }

        // remove elements
        languages.remove("python");
        languages.remove(0);

        System.out.println(languages);


        // LInkedList
        LinkedList<Integer> numbers = new LinkedList<>();

        // add elements
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.addFirst(999);
        numbers.addLast(1000);
        numbers.add(5, 500);


        //stack implmentation
        numbers.push(199);
        System.out.println(numbers);
        numbers.pop();
        System.out.println(numbers);


        //queue implementation
        numbers.offer(17);
        System.out.println(numbers);
        numbers.poll();
        System.out.println(numbers);


        // 2. Set interface
        System.out.println();
        System.out.println("Set Interface");
        HashSet<String> set1 = new HashSet<>();

        // adding elements
        set1.add("Apple");
        set1.add("Banana");
        set1.add("Cherry");
        set1.add("Orange");
        set1.add("Apple");  // ignored for duplicates
        System.out.println(set1);
        System.out.println("check the size " + set1.size());

        if(set1.contains("Apple")){
            System.out.println("Eat It");
        }

        // Treeset with sorted data
        TreeSet<String> names = new TreeSet<>();
        names.add("David");
        names.add("Dev");
        names.add("John");
        names.add("Sara");
        names.add("Mihir");

        System.out.println(names);

        // treeset methods
        System.out.println("check the first name " + names.first());
        System.out.println("check the last name " + names.last());
        System.out.println("names higher than john " + names.higher("John"));
        System.out.println("names lower than John " + names.lower("John"));


        //3. Queue implematation
        System.out.println();
        System.out.println("Queue Interface");
        PriorityQueue<String> pq = new PriorityQueue<>();

        //add elements
        pq.add("Apple");
        pq.add("Banana");
        pq.add("Grapes");
        pq.add("Pipeapple");
        pq.add("Apple");  // have duplicates

        System.out.println(pq);
        System.out.println("check the Front element " + pq.peek());
        System.out.println("Removing front element " + pq.poll());
        System.out.println("checking queue is empty or not " + pq.isEmpty());

        ArrayDeque<String> dq = new ArrayDeque<>(); // VIP addition
        dq.addFirst("Apple");
        dq.addLast("Banana");
        dq.addFirst("Grapes");
        dq.addLast("Pipeapple");
        System.out.println(dq);

        System.out.println("remove from the first " + dq.removeFirst());
        System.out.println("remove from the last " + dq.removeLast());

        //4. Map Interface
        Map<Integer,String> rollNumber = new HashMap<>();
        // add elements
        rollNumber.put(1, "David");
        rollNumber.put(2, "Grapes");
        rollNumber.put(3, "Pipeapple");
        rollNumber.put(4, "Apple");
        rollNumber.put(5, "Banana");

        System.out.println(rollNumber);

        rollNumber.put(3, "Mihir");  // updatting the existing value
        System.out.println(rollNumber);

        // access the elements by keys
        System.out.println("name for the roll number 3 is " + rollNumber.get(3));

        //iterate over
        System.out.println("iteration over the entire map");
        for(Map.Entry<Integer, String> entry : rollNumber.entrySet()){
            System.out.println("Key " +  entry.getKey() + " Value " + entry.getValue());
        }

        // iterate over keys only
        for(Integer key : rollNumber.keySet()){
            System.out.println("Key " +  key + " Value " + rollNumber.get(key));
        }
        //iterate over values
        for(String val : rollNumber.values()){
            System.out.println(val);
        }

        //treeMap
        TreeMap<String, String> capitals =  new TreeMap<>();
        capitals.put("Assam", "Guwahati");
        capitals.put("Telangana", "Hyderabad");
        capitals.put("Arunchal Pradesh", "Itanagar");
        capitals.put("Nagaland", "Kohima");
        capitals.put("Meghalaya", "Shilong");
        capitals.put("Mizoram", "Aizawl");
        capitals.put("Manipur", "Imphal");

        System.out.println(capitals);

    }
}
