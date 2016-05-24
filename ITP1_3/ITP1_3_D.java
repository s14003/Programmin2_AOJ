import java.util.Scanner;

class ITP1_3_D {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();

        int result = 0;
        for (int i = x; i <= y;i++) {
            if ((z % i) == 0) {
                result++;
            }
        }
        System.out.println(result);
    }
}
