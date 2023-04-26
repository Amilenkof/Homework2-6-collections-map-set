import java.util.*;

public class Main {
    private static List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    private static List<String> words = new ArrayList<>(List.of("one", "two", "one", "three", "two", "four"));
    private static List<String> words2 = new ArrayList<>(List.of("один", "один", "два", "два", "два", "три", "три", "три"));

    public static void printEvenNumbers(List<Integer> arr) {
        for (Integer i : arr) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void printUnicEvenNumber(List<Integer> arr) {
        Set<Integer> result = new HashSet<>(arr);
        ArrayList<Integer> list = new ArrayList<>(result);
        Collections.sort(list);
        for (Integer integer : list) {
            if (integer % 2 == 0) {

                System.out.println(integer);
            }
        }
    }

    public static void printUnicWords(List<String> arr) {
        ArrayList<String> result = new ArrayList<>();
        for (String s : arr) {
            if (!result.contains(s)) {
                result.add(s);
            }
        }
        System.out.println(result);
    }

    public static void calcDublicateWords(List<String> arr) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.size(); i++) {
            String s = arr.get(i);
            boolean b = map.containsKey(arr.get(i));
            if (!b) {
                map.put(s,0);
            }else {
                map.put(arr.get(i), map.get(arr.get(i))+1);
            }
        }
        System.out.println(map);


    }


    public static void main(String[] args) {
       // Задание 1
        printEvenNumbers(nums);
        //Задание 2
        printUnicEvenNumber(nums);
        //Задание 3
        printUnicWords(words);
        //Задание 4
        calcDublicateWords(words2);

    }
}
