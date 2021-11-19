/*
1 0 1
0 1 1


1 is island
0 is water

Max Area is 3 here: as 1 has 2 others links - horizontal and vertical
*/

public class Example44MaxLenIsland {
    boolean[][] seen = new boolean[2][3];

    public static void main(String[] args) {
        int[][] grid = new int[][] {
                {1, 0, 1},
                {0, 1, 1},
        };

        Example44MaxLenIsland e = new Example44MaxLenIsland();

        int max = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                max = Math.max(max, e.islandLen(i, j, grid));
            }
        }
        System.out.println(max);
    }

    int islandLen(int i, int j, int[][] grid) {
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0 || seen[i][j]) {
                return 0;
        }
        seen[i][j] = true;

        return (1 + islandLen(i+1, j, grid) + islandLen(i-1, j, grid) +  islandLen(i, j-1, grid) + islandLen(i, j+1, grid));
    }
}
