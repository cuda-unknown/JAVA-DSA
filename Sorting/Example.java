package Sorting;

// import java.util.Arrays;
// import java.util.Collections;
import java.util.*;

public class Example {
    public static void main(String[] args) {
        Integer arr[] = {5,4,1,3,2};
        // Arrays.sort(arr);
        // Arrays.sort(arr, 0, 3);
        // Arrays.sort(arr , Collections.reverseOrder());
        Arrays.sort(arr, 0, 4, Collections.reverseOrder());

        for(int nums : arr) {
            System.out.print(nums + " ");
        }
    }
}
