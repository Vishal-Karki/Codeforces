import java.util.Scanner;

public class MultiplicationTable {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int n = s.nextInt();
        int x = s.nextInt();

        int count = 0;

        for(int i=1;i<=n;i++){
            if(x%i == 0 && x/i <= n){
                count++;
            }
        }

        System.out.println(count);

        }

    }