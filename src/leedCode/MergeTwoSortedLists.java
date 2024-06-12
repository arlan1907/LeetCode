package leedCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeTwoSortedLists {
    /*
    You are given the heads of two sorted linked lists list1 and list2.
    Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
    Return the head of the merged linked list.

    Input: list1 = [1,2,4], list2 = [1,3,4]
    Output: [1,1,2,3,4,4]
     */
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,4));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,3,4));
        System.out.println(mergeTwoLists(list1, list2));

    }
    public static List<Integer> mergeTwoLists(List<Integer> list1, List<Integer> list2) {
        list1.addAll(list2);
        Collections.sort(list1);
        return list1;

    }

}
