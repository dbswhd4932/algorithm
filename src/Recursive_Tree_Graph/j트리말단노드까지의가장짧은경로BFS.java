package Recursive_Tree_Graph;

import java.util.LinkedList;
import java.util.Queue;

class Node6 {
    int data;
    Node6 lt, rt;

    public Node6(int val) {
        data = val;
        lt = rt = null;
    }
}

public class j트리말단노드까지의가장짧은경로BFS {
    Node6 root;

    public int BFS(Node6 root) {
        int answer = 0;
        Queue<Node6> queue = new LinkedList<>();

        queue.add(root);
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                Node6 cur = queue.poll();
                if (cur.lt == null && cur.rt == null) return answer;
                if (cur.lt != null) queue.add(cur.lt);
                if (cur.rt != null) queue.add(cur.rt);
            }
            answer++;
        }
        return answer; //아무값이 가능 , 여기까지 오지 않는다.
    }


    public static void main(String[] args) {
        j트리말단노드까지의가장짧은경로BFS tree = new j트리말단노드까지의가장짧은경로BFS();
        tree.root = new Node6(1);
        tree.root.lt = new Node6(2);
        tree.root.rt = new Node6(3);
        tree.root.lt.lt = new Node6(4);
        tree.root.lt.rt = new Node6(5);
        System.out.println(tree.BFS(tree.root));

    }
}
