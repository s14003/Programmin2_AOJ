import java.util.Scanner;

class ITP1_7_D {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();
        int l = scan.nextInt();

        int[][] a = new int[n][m];
        int[][] b = new int[m][l];
        long[][] c = new long[n][l];

        for (int i = 0; i < a.length;i++) {
            for (int j = 0;j < a[i].length; j++) {
                a[i][j] = scan.nextInt();
            }
            scan.nextLine();
        }
        for (int i = 0;i < b.length;i++) {
            for (int j = 0; j < b[i].length;j++) {
                b[i][j] = scan.nextInt();
            }
            scan.nextLine();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0;j < l; j++) {
                for (int k = 0;k < m; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.print(c[i][j]);
                if (j != l - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
