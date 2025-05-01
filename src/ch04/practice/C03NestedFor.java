package ch04.practice;

public class C03NestedFor {
    public static void main(String[] args) {
        /*
         *
         **
         ***
         ****
         *****
         */


        /*
         *
         **
         ***
         ****
         *****
         ****
         ***
         **
         *
         */


/*
        for (int i = 0; i < 10; i++) {
            int a = (i <= 5) ? i : (10 - i);
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
*/


        /*

         *****
         ****
         ***
         **
         *

         */




/*
        for (int i = 5; i > 0; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
*/


        /*
        *****
        ****#
        ***##
        **###
        *####
        #####
        */




/*
        String s = "#";
        for (int i = 4; i >= 0; i--, s += "#") {

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print(s);
            System.out.println();
        }
*/


        /*
//             *
//            **
//           ***
//          ****
//         *****
         */

/*
        String a = "*";
        for (int i = 5; i > 0; i--, a += "*") {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println(a);
        }
*/



        /*
//         *****
//          ****
//           ***
//            **
//             *
         */

/*
        String a = " ";
        for (int i = 5; i >= 0; i--, a += " ") {
            System.out.print(a);
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
*/



        /*
        0
        01
        012
        0123
        01234
         */

/*
        String a = "";
        for (int i = 0; i < 5; i++) {
            a += i;
            System.out.println(a);
        }
*/

        /*
        1
        12
        123
        1234
        12345
         */
/*
        String a = "";
        for (int i = 1; i < 6; i++) {
            a += i;
            System.out.println(a);
        }
*/


        /*
        0
        12
        345
        6789
        01234
         */

        int a = 0;

        for (int i = 0; i <= 5; i++) {

            String s = "";
            for (int j = 0; j < i; j++) {
                if (a > 9) {
                    a = 0;
                }
                s += a;
                a++;
            }
            System.out.println(s);
        }

        System.out.println();

        /*
        1
        23
        456
        7890
        12345
         */
        int k = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++, k++) {
                System.out.print(k % 10);

            }

            System.out.println();
        }


    }
}
