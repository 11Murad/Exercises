public class Main {
    public static void main(String[] args) {
            int[][] grid = {
                    {0, 1, 0, 0},
                    {1, 1, 1, 0},
                    {0, 1, 0, 0},
                    {1, 1, 0, 0}
            };
            System.out.println(islandPerimeter(grid));  // Çıktı: 16
    }

    public static int islandPerimeter(int[][] grid) {
        int perimeter = 0;

        // Izgaranın boyutları
        int rows = grid.length;
        int cols = grid[0].length;

        // Izgaradaki her hücreyi dolaş
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    // Kara hücresi başına 4 kenar ekle
                    perimeter += 4;

                    // Yukarıdaki hücreyi kontrol et (i-1, j)
                    if (i > 0 && grid[i - 1][j] == 1) {
                        perimeter -= 2;  // Ortak sınırlar için 2 kenar eksilt
                    }

                    // Solundaki hücreyi kontrol et (i, j-1)
                    if (j > 0 && grid[i][j - 1] == 1) {
                        perimeter -= 2;  // Ortak sınırlar için 2 kenar eksilt
                    }
                }
            }
        }

        return perimeter;
    }
}






