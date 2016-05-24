import java.util.Scanner;
class ITP1_2_A{
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if(x < y) {
            System.out.println("x<y");
        } else if( x == y) {
            System.out.println("x==y");
        } else if(x > y) {
            System.out.println("x>y");
        }
    }
}
