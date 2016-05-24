import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class ITP1_4_D {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str[] = br.readLine().split(" ");
        long sum = 0;
        int a = 0;
        int max = -1000000;
        int min = 1000000;
        for(int i = 0; i < n; i++){
            a = Integer.parseInt(str[i]);
            if(a > max) {
                max = a;
            }
            if(a < min) {
                min = a;
            }
            sum += a;
        }
        System.out.println(min+" "+max+" "+sum);
    }
}

