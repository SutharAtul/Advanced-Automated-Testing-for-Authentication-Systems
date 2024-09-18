public class BestPatterns {
    public static void main(String[] args) {

        System.out.println("1.Ractangle Shape:");
        System.out.println();
        // Ractangle Shape
        int n = 4;
        int m = 5;
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=m;j++) {
                System.out.print("*");
            }
        System.out.println();
        }

        System.out.println();
        System.out.println("2.HollowRactangale Shape:");
        System.out.println();

        // HollowRactangale Shape
        int x = 4;
        int y = 5;
        for (int i = 1; i <= x; i++) {
            for (int j = 1 ; j <= y; j++) {
                if( i == 1 || j == 1 || i==x || j==y ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
                System.out.println();
        }

        System.out.println();
        System.out.println("3.HalfPyramid Shape:");
        System.out.println();

        // HalfPyramid Shape
        int a = 4;
        for(int i=0;i<=a;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
        System.out.println();
        }

        System.out.println();
        System.out.println("4.Inverted HalfPyramid Shape:");
        System.out.println();

        
        // Inverted HalfPyramid Shape

        int b = 4;
        for(int i=b;i>=1;i--) {
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
        System.out.println();
        }
        
        System.out.println();
        System.out.println("5.Inverted HalfPyramid Shape (Rotate 180)");
        System.out.println();
        // Inverted HalfPyramid Shape (Rotate 180)

        int c = 4;
        // outer loop
        for(int i=1 ;i <= c ; i++) {
            // inner loop -> space print
            for(int j=1; j <= c-i; j++) {
                System.out.print(" ");
            }
            
            // inner loop -> star print
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // HalfPyramid with number 
        System.out.println();
        System.out.println("6.HalfPyramid with number");
        System.out.println();

        int d = 5;
        // outer loop
        for(int i=1 ;i <= d ; i++) {
            // inner loop -> space print
            for(int j=1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        // Inverted HalfPyramid with numbers (Rotate 180)
        System.out.println();
        System.out.println("7.Inverted HalfPyramid with numbers (Rotate 180)");
        System.out.println();

        int e = 5;
        // outer loop
        for(int i=1 ; i<=e ; i++) {
            // inner loop -> space print
            for(int j=1; j <= e-i+1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        // Floyd's Triangle
        System.out.println();
        System.out.println("8.Floyd's Triangle:");
        System.out.println();

        int f = 5;
        int number = 1;
        // outer loop
        for(int i=1 ;i <= f ; i++) {
            // inner loop -> space print
            for(int j=1; j <= i; j++) {
                System.out.print(number+ " ");
                number++;
            }
            System.out.println();
        }

        // 0-1 Triangle
        System.out.println();
        System.out.println("9.0-1 Triangle:");
        System.out.println();
        int g = 5;
        // outer loop
        for(int i=1 ;i <= g ; i++) {
            // inner loop -> space print
            for(int j=1; j <= i; j++) {
                int sum = i + j;
                if(sum % 2 == 0){
                    System.out.print("1 ");
                }else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

    }
}
