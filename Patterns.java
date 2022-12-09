package com.apnacollege;

public class Patterns {
    public static void hollow_rectangle(int n, int m) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || i == n || j == 1 || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void inverted_rotated_half_pyramid(int n){
        for(int i=1; i<=n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void inverted_haif_pyramid(int n) {
        int i;
        for( i= 1; i<=n; i++){
            for(int j=1; j<=i; j++) {
                System.out.print(j) ;
            }
            System.out.println();
        }
    }
    public static void inverted_haif_numbers_pyramid(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void floyds_triangle(int n ){
        int counter =1;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void zero_one_triangle(int n ) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                if((i+j)%2==0){
                    System.out.print("1" + " ");
                }else{
                    System.out.print("0" + " ");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int n) {
        //1st haif
        for (int i = 1; i <= n; i++) {
            //for *
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                }
           // for spaces " "
            for(int k=1; k<=2*(n-i) ; k++){
                System.out.print(" ");
            }
            //for *
            for (int j = 1; j <= i; j++) {
                    System.out.print("*" );
                }
            System.out.println();
        }

         // 2nd haif
        for (int i = n; i >=1; i--) {
            //for *
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // for spaces " "
            for(int k=1; k<=2*(n-i) ; k++){
                System.out.print(" ");
            }
            //for *
            for (int j = 1; j <= i; j++) {
                System.out.print("*" );
            }
            System.out.println();
        }
    }

    public static void even_diamond(int n) {
        // 1st haif
        for(int i=1; i<=n; i++) {
            //for spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            //for stars
            for(int j=1; j<=2*i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd half
        for(int i=n; i>=1; i--) {
            //for spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            //for stars
            for(int j=1; j<=2*i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void solid_rhombus(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                //for spaces
                System.out.print(" ");
            }
            //for stars
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void holloe_rhombus(int n) {
        for(int i=1; i<=n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
                //hollow rhombus
            for(int j=1; j<=n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void diamond(int n) {
        // 1st half
        for(int i=1; i<=n; i++) {
            //for spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for(int j=1; j<=(2*i)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd half
        for(int i=n; i>=1; i--) {
            //for spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for(int j=1; j<=(2*i)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        int n;
        int m ;
        diamond(4);
    }
}