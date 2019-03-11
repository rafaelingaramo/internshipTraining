import java.util.*;

public class Collections {
    public static void main(String[] args) {
//        ArrayList<String> arrayList = new ArrayList<>();
//        String a = "a";
//        String b = "b";
//
//        arrayList.add(b);
//        arrayList.add(a);
//        arrayList.add(b);
//
//        for (String o: arrayList) {
//            System.out.println(o);
//        }
//
//        arrayList.remove(b);
//        for (String o: arrayList) {
//            System.out.println(o);
//        }
//
//
//        Set<String> stringSet = new HashSet<String>();
//        stringSet.add("A");
//        stringSet.add("A");
//
//        stringSet.forEach(item -> System.out.println(item));
//
//        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
//        linkedHashSet.add("A");
//        linkedHashSet.add("A");
//        linkedHashSet.add("B");
//
//        linkedHashSet.forEach(item -> System.out.println(item));


        Map<String, String> mapaDeString = new HashMap<>();
        mapaDeString.put("pessoas", "Jose, Joao, Carlos, Inacio");
        mapaDeString.put("carros", "Mercedes, Volks, Audi, Fiat, Ford");
        mapaDeString.put("animais", "Gato, Cachorro, Passarinho");

        mapaDeString.put("pessoas", "Chaves, Madruga, Florinda");


        String pessoas = mapaDeString.get("pessoas");
        pessoas += ", Bruxa 71";

        mapaDeString.put("pessoas", pessoas);

//        mapaDeString.forEach((chave,valor) -> System.out.println("chave " + chave + " valor " + valor));
//
//        Queue<String> queue = new PriorityQueue();
//        queue.add("A");
//        queue.add("B");
//        queue.add("C");
//        queue.add("D");
//        queue.add("E");
//        queue.add("F");
//
//        final String peek = queue.poll();
//        System.out.println(peek);
//        System.out.println(queue);


        Stack<String> stack = new Stack<>();
        stack.add("A");
        stack.add("B");
        stack.add("C");
        stack.add("D");
        stack.add("E");
        stack.add("F");

        final String peek = stack.pop();
        System.out.println(peek);
        System.out.println(stack);
    }

}
