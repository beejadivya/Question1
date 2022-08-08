import java.util.Scanner;
public class Question1 {

        public static void main (String args[])

        {

            int l1, l2, l3, n;
            Scanner s = new Scanner(System.in);
            l1 = s.nextInt();
            l2 = s.nextInt();
            l3 = s.nextInt();
            n = s.nextInt();
            if (n < l1 && n < l2 && n < l3) {

                if (l1 < l2 && l1 < l3)

                    System.out.println("L1");
                else if (l2 < l3)

                    System.out.println("L2");
                else
                    System.out.println("L3");
            } else if (n < l1 && n < l2) {

                if (l1 < l2)

                    System.out.println("L1");
                else
                    System.out.println("L2");
            } else if (n < l1 && n < l3) {

                if (l1 < l3)

                    System.out.println("L1");
                else
                    System.out.println("L3");
            } else if (n < l2 && n < l3) {

                if (l2 < l3)

                    System.out.println("L2");
                else
                    System.out.println("L3");
            } else if (n < l1)

                System.out.println("L1");
            else if (n < l2)

                System.out.println("L2");
            else if (n < l3)

                System.out.println("L3");
            else
                System.out.println("0");
        }
    }


