import java.util.*;

public class Main {
    public static void main(String[] args) {


        //COLLECT

        Collection<String> collStr = new ArrayList<>();

        collStr.add("asd");
        collStr.add("das");
        collStr.add("sad");

//        System.out.println(collStr.stream().max(String::indexOf)); // Optional[sad]
        System.out.println(collStr.iterator());
        Iterator<String> i = collStr.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());

        }


        //LIST
        List<String> stringList = new ArrayList<>();
        stringList.add("asd");
        stringList.add("das");
        stringList.add("sad");

        System.out.println("el: " + stringList.get(1));

        stringList.remove(1);
        System.out.println("Index: " + stringList.indexOf("sad"));
        System.out.println("Iteraator: " + stringList.listIterator(1));



        // queue

        Queue<String> stringQueue = new LinkedList<>();
        stringQueue.add("a");
        stringQueue.add("s");
        stringQueue.add("d");
        stringQueue.add("a");

        System.out.println("Queue: " + stringQueue);
// Удаляем элемент из очереди
        String element = stringQueue.remove();
        System.out.println("Removed element: " + element);
// Печатаем обновленную очередь
        System.out.println("Queue: " + stringQueue);

        // MAP

        // Создаем Map
        Map<String, Integer> map = new  HashMap <>();
// Добавляем элементы в Map
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("orange", 3);
        map.put("orange", 3);  // только уникальные ключи
// Печать Map
        System.out.println("Map: " + map);
// Получаем значение для определенного ключа
        int  value  = map.get( "banana" );
        System.out.println("Value for 'banana': " + value);
// Удаляем элемент из Map
        map.remove("orange");
// Печать обновленной карты
        System.out.println( "Map: " + map);


        // SET

        Set<String> set = new HashSet<>();
        set.add("dec");
        set.add("jan");
        set.add("feb");
        set.add("march");
        set.add("feb");


        System.out.println(set); // упорядочено по хэш-коду, искл повторения

    }
    private transient HashMap map;

    // Конструктор - 1
    // Все конструкторы неявно создают объект HashMap.
    public void HashSet()
    {
        // Создаем неявно объект HashMap
        map = new HashMap();
    }

    // Конструктор- 2
    public void HashSet(int initialCapacity)
    {
        // Создаем неявно объект HashMap
        map = new HashMap(initialCapacity);
    }

    // Объект класса Object, каждый раз выступающий в роли значения в HashMap
    private static final Object PRESENT = new Object();

}