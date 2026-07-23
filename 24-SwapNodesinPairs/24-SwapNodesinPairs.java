// Last updated: 7/23/2026, 3:57:41 PM
1/**
2 * Definition for singly-linked list.
3 * class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public ListNode detectCycle(ListNode head) {
14        if (head == null)
15            return null;
16        ListNode slow = head;
17        ListNode fast = head;
18
19        while(fast != null && fast.next != null){
20            fast = fast.next.next;
21            slow = slow.next;
22
23            if(fast == slow){
24                ListNode ptr = head;
25            
26            while (ptr != slow){
27                ptr = ptr.next;
28                slow = slow.next;
29            }
30            return ptr;
31            }
32
33        }
34        return null;
35    }
36}