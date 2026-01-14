public class Array2D {
    // Array 2D
    public static void main(String[] args) {
        String[][] name = {
                { "apple", "apple", "apple" },
                { "banana", "banana", "banana" },
                { "banana", "banana", "banana" }
        };
        for (int row = 0; row < name.length; row++) {
            for (int colums = 0; colums < name[row].length; colums++) {
                System.out.println(name[row][colums]);
            }
        }
    }
}
