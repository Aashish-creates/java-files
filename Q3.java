import java.util.Scanner;

class Q3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of the student ");
        int n = sc.nextInt();
        int roll1 = 0, roll2 = 0;
        int big = 0, total = 0, t1 = 0;
        System.out.println("Enter the no of the sub ");
        int m = sc.nextInt();
        int a[][] = new int[n][m];
        int t[] = new int[m];
        for (int i = 0; i < n; i++) {
            total = 0;
            for (int j = 0; j < m; j++) {
                System.out.print("Enter the marks of roll no " + (i + 1) + " of subject " + (j + 1) + " :- ");
                a[i][j] = sc.nextInt();
                total = total + a[i][j];
            }
            if (t1 <= total) {
                t1 = total;
                roll1 = (i + 1);
            }
            System.out.println();
        }
        for (int i = 0; i < m; i++) {
            roll2 = 0;
            big = 0;
            for (int j = 0; j < n; j++) {
                if (a[j][i] >= big) {
                    big = a[j][i];
                    roll2 = (j + 1);
                }
            }
            t[i] = roll2;
        }
        for (int i = 0; i < m; i++) {
            System.out.print("The heighest marks in subject " + (i + 1) + " is of roll no " + t[i]);
            System.out.println();
        }
        System.out.println("total heighest marks is of rollno " + roll1);
        sc.close();
    }
}
