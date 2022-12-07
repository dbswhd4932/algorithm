package greedy;

// 서로소 집합 문제 Union&Find
import java.util.Scanner;


public class f친구인가_Union_Find {
    static int[] unf;
    static int n;
    static int m;

    public static int Find(int v) {
        if ( v == unf[v]) return v;
        else return unf[v] = Find(unf[v]);
    }

    public static void Union(int a, int b) {
        int fa = Find(a);
        int fb = Find(b);
        if (fa != fb) unf[fa] = fb;
    }

    public static void main(String[] args) {
        f친구인가_Union_Find T = new f친구인가_Union_Find();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        unf = new int[n + 1];
        for (int i = 1; i <= n; i++) unf[i] = i;
        for (int i = 1; i <= m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            Union(a, b);
        }
        int a = sc.nextInt();
        int b = sc.nextInt();
        int fa = Find(a);
        int fb = Find(b);
        if ( fa == fb ) System.out.println("YES");
        else System.out.println("NO");
    }
}
