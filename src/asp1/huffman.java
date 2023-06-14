package asp1;

import java.util.*;

public class huffman {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        System.out.println("Speicherverbrauch vorher: " + input.length()*8);

        BinaryTree tree = new BinaryTree();


    }


    public static SortedMap<Character, Integer> getLetterFrequency(String word) {
        SortedMap<Character, Integer> result = new TreeMap<>();
        for(char c : word.toCharArray()) {
            if(result.containsKey(c)) {
                int count = result.get(c);
                result.remove(c);
                result.put(c, count+1);
            } else {
                result.put(c, 1);
            }
        }
        return result;
    }

}

