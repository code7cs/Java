package session09;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.*;
import java.util.regex.Pattern;

/**
 * @author Hanfan Wang
 */

public class SpellCheck {
    public static void main(String[] args) {
        // https://raw.githubusercontent.com/StevensDeptECE/Dictionaries/master/usen-spelling-dict.txt
        // read the file into a HashMap where the key is the word
        // the value is the number
        // ex. "aa" --> 0
        //    "aal" --> 1
        LinkedHashMap<String, Integer> rawDataMap = new LinkedHashMap<>();
        try {
            URL url = new URL("https://raw.githubusercontent.com/StevensDeptECE/Dictionaries/master/usen-spelling-dict.txt");
            Scanner s = new Scanner(url.openStream());
            int index = 0;
            while (s.hasNext()) {
                String str = s.next();
                rawDataMap.put(str, index);
                index++;
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        try {
            // read the file treasureisland.txt from the data directory
            Scanner s2 = new Scanner(new FileReader("data/treasureisland.txt"));
            // put every word into a list named words
            List<String> words = new ArrayList<>();
            String patten = "(^([A-Z]|[a-z])[a-z]*$)";
            while (s2.hasNext()) {
                String[] arr = s2.nextLine().replaceAll("\\p{P}", "").split("[^A-Za-z]+");
                for (String s : arr) {
                    if (!s.equals("") && Pattern.matches(patten, s)) words.add(s);
                }
            }

            // count all the words
            LinkedHashMap<String, Integer> allWordsMap = new LinkedHashMap<>();
            for (String word : words) {
                Integer count = allWordsMap.get(word);
                allWordsMap.put(word, (count == null) ? 1 : count + 1);
            }

            // search for each word in the rawDataMap, and if not, put it in a new list of resultMap
            LinkedHashMap<String, Integer> resultMap = new LinkedHashMap<>();
            int wrongWordsCounts = 0;
            for (Map.Entry<String, Integer> entry : allWordsMap.entrySet()) {
                if (!rawDataMap.containsKey(entry.getKey()) && !rawDataMap.containsKey(lowerCase(entry.getKey())) && !rawDataMap.containsKey(upperCase(entry.getKey()))) {
                    resultMap.put(entry.getKey(), entry.getValue());
                    wrongWordsCounts += entry.getValue();
                }
            }
            // display a count of the words found spelled incorrectly
            System.out.println("The count of words found spelled incorrectly is: " + wrongWordsCounts);
            // print all incorrect words with their counts
            System.out.println(resultMap);


            // print the first 100 incorrect words
            int i = 0;
            System.out.println("The first 100 incorrect words are: ");
            for (Map.Entry<String, Integer> entry : resultMap.entrySet()) {
                if (i < 100) {
                    System.out.print(entry.getKey() + ", ");
                }
                i++;
            }
            System.out.println();


//            // print all incorrect words with their counts, ordered by values
//            List<Map.Entry<String, Integer>> sortResult = new ArrayList<>(resultMap.entrySet());
//            Collections.sort(sortResult, new Comparator<Map.Entry<String, Integer>>() {
//                @Override
//                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
//                    return o2.getValue().compareTo(o1.getValue());
//                }
//            });
//            System.out.println(sortResult);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static String lowerCase(String str) {
        char[] ch = str.toCharArray();
        if (ch[0] >= 'A' && ch[0] <= 'Z') {
            ch[0] = (char) (ch[0] + 32);
        }
        return new String(ch);
    }

    private static String upperCase(String str) {
        char[] ch = str.toCharArray();
        if (ch[0] >= 'a' && ch[0] <= 'z') {
            ch[0] = (char) (ch[0] - 32);
        }
        return new String(ch);
    }

}
