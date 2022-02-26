package medium;

public class MergeNodesInBetweenZeros {

    static class ListNode {
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

    static class MergeResult {
        public MergeResult(int sum, ListNode zeroElement) {
            this.sum = sum;
            this.zeroElement = zeroElement;
        }

        int sum;
        ListNode zeroElement;
    }

    public ListNode mergeNodes(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        var result = startMerging(head.next);
        head.val = result.sum;
        if (result.zeroElement.next != null) {
            head.next = result.zeroElement;
        } else {
            head.next = null;
        }

        mergeNodes(head.next);

        return head;
    }

    private MergeResult startMerging(ListNode firstNonZeroNode) {
        var temp = firstNonZeroNode;
        var sum = 0;
        while (temp.val != 0) {
            sum += temp.val;
            temp = temp.next;
        }
        return new MergeResult(sum, temp);
    }


}
