import java.util.Scanner;

/**
 * Created by chi on 10/9/2016.
 */
public class maxmin {
    public static void main(String[] args) {
        int max;
        int min;

        int[] a =new int[4];
        Scanner num=new Scanner(System.in);
        for(int i= 0; i<4; i++) {
            System.out.println("nhập số");
            int h = num.nextInt();
            a[i]=h;
        }
        max =a[0];
        min=a[0];
        for (int i= 0; i<4; i++)
        {  if (max<a[i]) { max=a[i];}
            if (min> a[i])  {min=a[i];}
        }
        System.out.println("max" +max);
        System.out.println("min"+min);
    }
}
