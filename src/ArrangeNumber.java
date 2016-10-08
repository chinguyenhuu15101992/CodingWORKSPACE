import java.util.Scanner;

/**
 * Created by chi on 10/8/2016.
 */
public class ArrangeNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//        System.out.println("mời bạn nhập giá trị của 10 số vào:");
        System.out.println(" bạn muốn kiểm tra bao nhiêu số:");
        int n=input.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("mời bạn nhập số thứ " + i + " là: ");
            a[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n ; j++) {
                if (a[i] > a[j ]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

            }


        }
        System.out.printf("STT của dãy số đó là:");
        for (int i = 0; i < n; i++)
        {
            System.out.print(a[i] + ", ");
        }
    }
}
