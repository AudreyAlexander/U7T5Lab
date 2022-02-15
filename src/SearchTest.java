import java.util.ArrayList;
import java.util.Arrays;

public class SearchTest {
    public static void main(String[] args) {

        int[] numArray = {3, -2, 9, 38, -23, 9, 100};
        Search search = new Search();
        // TEST PART A
        // write test code to search numArray for 38 and print result; should print 3
        System.out.println(search.linearSearch(38, numArray));

        // write test code to search numArray for 9 and print result; should print 2
        System.out.println(search.linearSearch(9, numArray));
        // write test code to search numArray for 5 and print result; should print -1
        System.out.println(search.linearSearch(5, numArray));

        // TEST PART B
        // use the same numArray and test the same three values as above, in the
        // same order, printing each result:  should print true, true, false
        System.out.println(search.booleanSearch(38, numArray));

        // write test code to search numArray for 9 and print result; should print 2
        System.out.println(search.booleanSearch(9, numArray));
        // write test code to search numArray for 5 and print result; should print -1
        System.out.println(search.booleanSearch(5, numArray));



        // TEST PARTS C & D -- UNCOMMENT TEST CODE

        ArrayList<Integer> numArrayList = new ArrayList<Integer>(Arrays.asList(3, -2, 9, 38, -23, 9, 100));
        System.out.println("Tests of linear search Integer ArrayList:");
        System.out.println(search.linearSearch(3, numArrayList));
        System.out.println(search.linearSearch(9, numArrayList));
        System.out.println(Search.linearSearch(-23, numArrayList));
        System.out.println(Search.linearSearch(99, numArrayList));

        System.out.println("Tests of linear search String array:");
        String[] arr1 = {"blue", "red", "purple", "green", "purple"};
        System.out.println(Search.linearSearch("purple", arr1));
        System.out.println(Search.linearSearch("pink", arr1));


        // TEST PART E -- UNCOMMENT TEST CODE

        int[] numArray2 = {5, 1, 5, 4, 7, 5, 2, 5, 8, 8, 5, 10, 5};
        System.out.println(Search.linearSearchLast(4, numArray2));
        System.out.println(Search.linearSearchLast(8, numArray2));
        System.out.println(Search.linearSearchLast(5, numArray2));
        System.out.println(Search.linearSearchLast(9, numArray2));


        // TEST PART F -- UNCOMMENT TEST CODE

        System.out.println(Search.linearSearchCount(5, numArray2));
        System.out.println(Search.linearSearchCount(9, numArray2));

        ArrayList<Integer> numArrayList2 = new ArrayList<Integer>(Arrays.asList(5, 1, 5, 4, 7, 5, 2, 5, 8, 8, 5, 10, 5));
        System.out.println(Search.linearSearchCount(5, numArrayList2));
        System.out.println(Search.linearSearchCount(9, numArrayList2));

    }
}
