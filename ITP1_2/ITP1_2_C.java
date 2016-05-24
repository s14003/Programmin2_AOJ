import java.util.Arrays;
import java.util.Scanner;

public class ITP1_2_C{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();

        int[] sort = {first,second,third};

        Arrays.sort(sort);

        System.out.println(sort[0]+" "+sort[1]+" "+sort[2]);
    }

}
