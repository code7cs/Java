### Hashtable 与 HashMap 的简单比较

> _HashTable 基于 Dictionary 类，而 HashMap 是基于 AbstractMap。_
        Dictionary 是任何可将键映射到相应值的类的抽象父类，
        而 AbstractMap 是基于 Map 接口的实现，它以最大限度地减少实现此接口所需的工作。

> _HashMap 的 key 和 value 都允许为 null，而 Hashtable 的 key 和 value 都不允许为 null。_
        HashMap 遇到 key 为 null 的时候，调用 putForNullKey 方法进行处理，而对 value 没有处理；
        Hashtable遇到 null，直接返回 NullPointerException。

> _Hashtable 方法是同步，而HashMap则不是。_
        Hashtable 中的几乎所有的 public 的方法都是 synchronized 的，而有些方法也是在内部通过 synchronized 代码块来实现。
        所以有人一般都建议如果是涉及到**多线程同步时采用 HashTable**，没有涉及就采用 HashMap，
        但是在 Collections 类中存在一个静态方法：**synchronizedMap()**，该方法创建了一个线程安全的 Map 对象，并把它作为一个封装的对象来返回.

> _HashMap还有LinkedHashMap和TreeMap来控制顺序，Hashtable没有_  
        HashMap implementation LinkedHashMap maintains the insertion order 
        and TreeMap sorts the mappings based on the ascending order of keys.
        Hashtable doesn’t guarantee any kind of order. It doesn’t maintain the mappings in any particular order.