package java100Days;

import java.util.*;

public class day_03_DuplicateInCollection {
    public static void main(String[] args) {

        Collection<String> inputCollection = Arrays.asList("apple", "banana", "orange", "apple", "grape", "banana");
        System.out.println(findDuplicates(inputCollection));
    }
    static <T>Set<T> findDuplicates(Collection<T> collection)
    {
        Set<T> duplicates = new LinkedHashSet<>();
        Set<T> uniques = new HashSet<>();
        for(T t : collection){
           if(!uniques.add(t))
            duplicates.add(t);
        }
        System.out.println(duplicates);
        System.out.println(uniques);
        return duplicates;
    }

}
