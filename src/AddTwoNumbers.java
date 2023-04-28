
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result = new ListNode(0);
        ListNode pointer = result;

        int carry = 0; //Set default carry

        while (l1 != null || l2 != null) {
            int sum = 0 + carry;

            if (l1 != null) { //Use number from first list
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) { //Use number from second list
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            sum = sum % 10;
            pointer.next = new ListNode(sum);
            pointer = pointer.next;
        }

        if (carry == 1) pointer.next = new ListNode(1);

        return result.next;
    }
}

