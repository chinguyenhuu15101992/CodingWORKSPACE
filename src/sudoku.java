import java.util.Scanner;

/**
 * Created by chi on 10/10/2016.
 */
public class sudoku {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.printf("nhap so hang");
        int hang = input.nextInt();
        System.out.printf("nhap so cot");
        int cot = input.nextInt();
//        int i,j;
        int[][] mang = new int[hang][cot];


//*int x = (int)  (Math.random*8+1);
        mang[0][0] = (int) (Math.random()*8 + 1);
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                int x = (int) (Math.random() * 8 + 1);

                if (mang[i][j]==x)
                {
                    j=j-1;
                }
                else
                {
                    mang[i][j]=x;
                }
//                else
//                {
//                    j = j + 1;
//                }


            }
//                System.out.println("moi ban nhap so co hang thu" +i+"cot"+j);
//                mang [i][j]= input.nextInt();
//                for (int k=0; k<z;k++)
//                {
//                    if ()
//
//                }
//            }
//
//            System.out.printf(mang[i][j]);
//
        }
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print(mang[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}