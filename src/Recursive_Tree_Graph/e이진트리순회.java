package Recursive_Tree_Graph;

class Node1 {
    int data;
    Node1 lt, rt;

    public Node1(int val) {
        data = val;
        lt = rt = null;
    }
}

public class e이진트리순회 {
    Node1 root;

    public void DFS(Node1 root) { // 1번 노드
        if (root == null) return;
        else {
            //System.out.print(root.data+ " "); 전위
            DFS(root.lt);
            //System.out.print(root.data+ " "); //중위
            DFS(root.rt);
            System.out.print(root.data+ " "); //후위
        }
    }

    public static void main(String[] args) {
        e이진트리순회 tree = new e이진트리순회();
        tree.root = new Node1(1);
        tree.root.lt = new Node1(2);
        tree.root.rt = new Node1(3);
        tree.root.lt.lt = new Node1(4);
        tree.root.lt.rt = new Node1(5);
        tree.root.rt.lt = new Node1(6);
        tree.root.rt.rt = new Node1(7);
        tree.DFS(tree.root);
    }

}
