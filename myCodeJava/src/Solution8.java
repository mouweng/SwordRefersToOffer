
class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}

class Question {
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        if (pNode.right != null) {
            TreeLinkNode r = pNode.right;
            while (r.left != null) {
                r = r.left;
            }
            return r;
        } else {
            while (pNode.next !=null) {
                TreeLinkNode p = pNode.next;
                if (p.left == pNode)
                    return p;
                pNode = pNode.next;
            }
        }
        return null;
    }
}

public class Solution8 {
    public static void main(String[] args) {

    }
}
