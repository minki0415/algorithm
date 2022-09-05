package dfs;


class Node{
    int data;
    Node lt, rt;
    public Node(int val) {
        data = val;
        lt=rt=null;
    }
}

public class DepthFirstSearch {
    Node root;
    public void dfs(Node root) {
        if(root==null) return;
        else {
//            System.out.print(root.data + " "); // 전위 순환
            dfs(root.lt);
            System.out.print(root.data + " "); // 중위 순환
            dfs(root.rt);
//            System.out.print(root.data + " "); // 후위 순환
        }
    }

    public static void main(String[] args) {
        DepthFirstSearch tree = new DepthFirstSearch();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.dfs(tree.root);
    }
}
