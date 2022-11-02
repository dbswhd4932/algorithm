package Recursive_Tree_Graph;

import java.util.LinkedList;
import java.util.Queue;

class Node4 {
    int data;
    Node4 lt, rt;

    public Node4(int val) {
        data = val;
        lt = rt = null;
    }
}

public class g이진트리레벨탐색_BFS {
    Node4 root;

    public void BFS(Node4 root) {
        Queue<Node4> queue = new LinkedList<>();
        queue.add(root);
        int length = 0;

        while (!queue.isEmpty()) {
            int len = queue.size();
            System.out.print(length + "레벨 : ");

            for (int i = 0; i < len; i++) {
                Node4 cur = queue.poll();
                System.out.print(cur.data + " ");
                if (cur.lt != null) queue.add(cur.lt);
                if (cur.rt != null) queue.add(cur.rt);
            }

            length++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        g이진트리레벨탐색_BFS tree = new g이진트리레벨탐색_BFS();
        tree.root = new Node4(1);
        tree.root.lt = new Node4(2);
        tree.root.rt = new Node4(3);
        tree.root.lt.lt = new Node4(4);
        tree.root.lt.rt = new Node4(5);
        tree.root.rt.lt = new Node4(6);
        tree.root.rt.rt = new Node4(7);
        tree.BFS(tree.root);
    }
}
