import java.util.Scanner;

public class Array {

    String str1[]= {"kal", "pri", "mok"};
   public void Array2(String S)
    {
        for(int i=0;i<str1.length;i++)
            System.out.println(str1[i]);

    }
    public void numArray()
    {
        int num[] = new int[5];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            num[i] = in.nextInt();
            System.out.println(num[i]);
        }
    }

    public static void main(String[] args) {
//        Array a=new Array();
        Array a2=new Array();
        System.out.println("Enter numbers....");
        a2.numArray();
        System.out.println("Calling String Array2()....");
        a2.Array2("Y");
    }
}
