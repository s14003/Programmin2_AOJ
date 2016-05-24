import java.util.Scanner;

class ITP1_4_C {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while (true) {
            int a = scan.nextInt();
            String op = scan.next();
            int b = scan.nextInt();

            if (op.equals("?")) {
                break;
            }

            if (op.equals("+")) {
                System.out.println(a + b);
            } else if (op.equals("-")) {
                System.out.println(a - b);
            } else if (op.equals("*")) {
                System.out.println(a * b);
            } else if (op.equals("/")) {
                System.out.println(a / b);
            }
        }
    }
}
