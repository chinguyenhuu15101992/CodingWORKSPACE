import java.util.Scanner;

/**
 * Created by chi on 10/17/2016.
 */
public class FixString {
    public static String main(String[] args) {
String chuoi = getInputs();
//        String [] a = new String[3];
//        for (int i=0;i<a.length; i++)
//        {
//            if (int() String a[i])=' ')
//            {
//                a[i]=''
//            }
//
//        }
        String nhap = getInputs();
        fixString(chuoi);
    }

    static String getInputs() {
        Scanner input = new Scanner(System.in);
        String nhap = input.nextLine();
        return nhap;
    }

    static String[] fixString(String chuoi)

    {
        String temp = "";
        for (int i = 0; i < chuoi.length(); i++) {
            if ((int) chuoi.charAt(i) == 32)
            {
                temp = temp + chuoi.charAt(i);
            }
            else
                {
                i =i+1;
            }
        }
        System.out.println(chuoi);


    }
}






//    static void printtest(String[] array) {
//
//        System.out.print("moi ban nhap chuoi");
//        for (int i=0;i<songuoi;i++)
//        {
//            System.out.println(name[i]);
//        }
//    }



//    static String[] sort(String[] fix) {
//        for(int i=0; i<a.length ;i++)
//            for (int j=0; j<a.length ;j++)
//                if(a[i].charAt(j)==' '){
//                    a[i].charAt[j]='';
//                }
//        return fix;

