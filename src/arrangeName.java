import java.util.Scanner;

/**
 * Created by chi on 10/10/2016.
 */

public class arrangeName {
    public static void main(String[] args) {
/* bai tap nhap 5 ten nguoi va sap xep theo a->z*/
        int i,j;
        String temp;
        Scanner input = new Scanner (System.in);
        System.out.println("so ten nguoi can nhap la:");
        int songuoi = input.nextInt();
        String name[]=new String[songuoi];
        System.out.println("moi ban nhap ten:"+songuoi+"nguoi:");
        for (i=0;i<songuoi;i++)
        {
            name[i]=input.nextLine();
        }

        for (i=0;i<songuoi;i++)
        {
            for (j=i+1;j<songuoi;j++)
            {
                if (name[j-1].compareTo(name[j])>0)
                {
                    temp = name[j-1];
                    name[j-1]=name[j];
                    name [j]=temp;
                }
            }
        }
        System.out.print("\ndanh sach ten theo thu tu tu a->z la:\t");
        for (i=0;i<songuoi;i++)
        {
            System.out.println(name[i]);
        }

    }
}
