/**
 * @author papio
 * @version 1.0
 * @description:
 * @date 2022/4/15 下午5:39
 */

public class Test {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l11 = new ListNode(4);
        l1.next = l11;
        ListNode l111= new ListNode(3);
        l11.next = l111;

        ListNode l2 = new ListNode(5);
        ListNode l22 = new ListNode(6);
        l2.next = l22;
        ListNode l222 = new ListNode(4);
        l22.next = l222;
         Solution.addTwoNumbers(l1,l2);
    }
}
