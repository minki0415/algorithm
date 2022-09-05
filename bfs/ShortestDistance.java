package bfs;


import java.util.LinkedList;
import java.util.Queue;

public class ShortestDistance {
    Node root;

    public int bfs(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        int L = 0;
        while(!q.isEmpty()) {
            int len = q.size();
            for(int i = 0 ; i < len ; i++) {
                Node x = q.poll();
                if(x.lt != null) q.offer(x.lt);
                if(x.rt != null) q.offer(x.rt);
                if(x.lt == null && x.rt == null) return L;
            }
            L++;
        }
        return 0;
    }

    public static void main(String[] args) {
        ShortestDistance tree = new ShortestDistance();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        System.out.println(tree.bfs(tree.root));
    }
}
