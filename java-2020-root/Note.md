#### Java

### May 22

>StringBuffer vs StringBuilder
    
    mutable
    
    StringBuffer sb = new StringBuffer("helo");
    sb.append("hi");
    
    
    StringBuilder sbuilder = new StringBuilder("hello");
    
    StringBuffer is synchronized, StringBuilder is not.

>Exception handling

    class A {
        psvm(String[] args) {
             int a = 10;
             int b = 0;
             Sout("line one");
             Sout(a/b);
             Sout("line two");
        }
    }

### May 26
> Java.util

   **collection(I)**
    
> List(I)     
   - if we want to store duplicate objects
    - ArrayList
        - searching is fast
        - DT is indexed based array
    10 20 30 40
    0  1. 2.  3
    
    - LinkedList
        - insertion and deletion
        - DT is double linked list
       
    10 -> 20 -> 30 -> 40   
       
> Set
   - if we want unique objects to be stored
    HashSet

> Map
   - if we want to store objects as key value pair 
        HashMap
        
        HashMap hm = new HashMap();
        hm.put("a", 10);
        hm.put("b", 20);
        hm.put("a", 30);
        hm.get("a");
        hm.remove();
        
        
