public class prog6 {
    public static void main(String[] args) {
        if (args.length != 9) {
            System.out.println("Please enter exactly 9 numbers for a 3x3 matrix.");
            return;
        }

        int[][] matrix = new int[3][3];
        int index = 0;

        try {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    matrix[i][j] = Integer.parseInt(args[index++]);
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter numeric values only.");
            return;
        }

        System.out.println("3x3 Matrix");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int leftDiagonal = 0, rightDiagonal = 0;
        for (int i = 0; i < 3; i++) {
            leftDiagonal += matrix[i][i];
            rightDiagonal += matrix[i][2 - i];
        }

        System.out.println("Left Diagonal Sum: " + leftDiagonal);
        System.out.println("Right Diagonal Sum: " + rightDiagonal);
    }
}
