import java.util.ArrayList;
import java.util.Stack;

class ListNode {
    int val;
    ListNode next = null;
    ListNode (int val) {
        this.val = val;
    }
}

class Question6 {
    // 递归方式
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> ret = new ArrayList<>();
        if (listNode != null) {
            ret.addAll(printListFromTailToHead(listNode.next));
            ret.add(listNode.val);
        }
        return ret;
    }

    // 头插法
    public ArrayList<Integer> printListFromTailToHead2(ListNode listNode) {
        // 头插法侯建逆序列表
        ListNode head = new ListNode(-1);
        while (listNode != null) {
            ListNode memo = listNode.next;
            listNode.next = head.next;
            head.next = listNode;
            listNode = memo;
        }
        // 构建 ArrayList
        ArrayList<Integer> ret = new ArrayList<>();
        head = head.next;
        while (head != null) {
            ret.add(head.val);
            head = head.next;
        }
        return ret;
    }

    // 使用栈
    public ArrayList<Integer> printListFromTailToHead3(ListNode listNode){
        Stack<Integer> stack = new Stack<>();
        while (listNode != null) {
            stack.add(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> ret = new ArrayList<>();
        while (!stack.empty())
            ret.add(stack.pop());
        return ret;
    }
}


public class Solution6 {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        listNode.next = listNode2;
        listNode2.next = listNode3;

        Question6 q6 = new Question6();
        ArrayList<Integer> ret = q6.printListFromTailToHead3(listNode);

        for(int i=0; i<ret.size(); i++){
            System.out.println(ret.get(i));
        }
    }
}
