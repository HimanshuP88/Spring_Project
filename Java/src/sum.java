import java.util.Scanner;
class Sum {

    static int m = 3;
    static int n = 3;
    static void row_sum(int arr[][])
    {

        int i, j, sum = 0;

        System.out.print("\nFinding Sum of each row:\n");

        for (i = 0; i < m; ++i) {
            for (j = 0; j < n; ++j) {


                sum = sum + arr[i][j];
            }


            System.out.println("Sum of the row " + i + " = "
                    + sum);


        }
    }
    static void column_sum(int arr[][])
    {

        int i, j, sum = 0;

        System.out.print(
                "\nFinding Sum of each column:\n");


        for (i = 0; i < m; ++i) {
            for (j = 0; j < n; ++j) {

                // Add the element
                sum = sum + arr[j][i];
            }

            System.out.println("Sum of the column " + i
                    + " = " + sum);


        }
    }


    public static void main(String[] args)
    {
        int i, j;
        int[][] arr = new int[m][n];
        Scanner sc=new Scanner(System.in);

        for (i = 0; i < m; i++)
        {
            System.out.println("Enter value for row "+i);

            for (j = 0; j < n; j++)

                arr[i][j] = sc.nextInt();
        }

        row_sum(arr);


        column_sum(arr);
    }
}