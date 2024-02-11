//You are given the heads of two sorted linked lists list1 and list2. 
//
// Merge the two lists into one sorted list. The list should be made by 
//splicing together the nodes of the first two lists. 
//
// Return the head of the merged linked list. 
//
// 
// Example 1: 
// 
// 
//Input: list1 = [1,2,4], list2 = [1,3,4]
//Output: [1,1,2,3,4,4]
// 
//
// Example 2: 
//
// 
//Input: list1 = [], list2 = []
//Output: []
// 
//
// Example 3: 
//
// 
//Input: list1 = [], list2 = [0]
//Output: [0]
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in both lists is in the range [0, 50]. 
// -100 <= Node.val <= 100 
// Both list1 and list2 are sorted in non-decreasing order. 
// 
//
// Related Topics Linked List Recursion 👍 21041 👎 2001


//leetcode submit region begin(Prohibit modification and deletion)

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    public ListNode mergeTwoLists(final ListNode listNode1, final ListNode listNode2) {

        if (listNode1 == null && listNode2 == null) {
            return new ListNode();
        }

        if (listNode1 == null || listNode2 == null) {
            return listNode1 == null ? listNode2 : listNode1;
        }

        ListNode workNode1 = listNode1;
        ListNode workNode2 = listNode2;

        while (workNode2 != null) {

            final ListNode currentNode2 = new ListNode(workNode2.val, null);

            while (workNode1 != null) {
                if (currentNode2.val > workNode1.val &&
                    (workNode1.next != null && currentNode2.val <= workNode1.next.val)) {
                    swapGrElements(workNode1, currentNode2);
                }

                workNode1 = workNode1.next;
            }

            workNode2 = workNode2.next;
            workNode1 = listNode1;
        }

        return workNode1;
    }

    private static void swapGrElements(ListNode el1, ListNode el2) {
        final ListNode next = el1.next;
        el1.next = el2;
        el2.next = next;
    }

    public static void main(String[] args) {
        final ListNode list1 = toLinkedList(List.of(1, 2, 4, 6, 7));
        final ListNode list2 = toLinkedList(List.of(1, 3, 4, 5, 7, 9, 11, 14));

        System.out.println("list1 is: " + toArrayList(list1));
        System.out.println("list2 is: " + toArrayList(list2));

        final ListNode result = new Solution().mergeTwoLists(list1, list2);

        System.out.println("result   is: " + toArrayList(result));
        System.out.println("expected is: [1, 1, 2, 3, 4, 4, 5, 6, 7, 7 , 9, 11, 14]");

    }

    public static ListNode toLinkedList(List<Integer> list) {
        ListNode node = null;
        for (int i = list.size() - 1; i >= 0; i--) {
            node = new ListNode(list.get(i), node);
        }
        return node;
    }

    public static ArrayList<Integer> toArrayList(ListNode node) {
        final ArrayList<Integer> result = new ArrayList<>();

        while (node != null) {
            result.add(node.val);
            node = node.next;
        }

        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
