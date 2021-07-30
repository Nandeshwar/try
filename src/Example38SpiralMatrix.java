import java.util.ArrayList;
import java.util.List;

public class Example38SpiralMatrix {
    public static void main(String[] args) {
        int[][] m1 = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };

        List m2 = new ArrayList<Integer>();

        int l = 0;
        int r = m1[0].length - 1;
        int t = 0;
        int b = m1.length -1 ;

        while(l <= r && t <= b) {

            for(int i = l; i <= r; i++) {
                m2.add(m1[t][i]);
            }
            t++;

            for(int i = t; i <= b; i++) {
                m2.add(m1[i][r]);
            }
            r--;

            for(int i = r; i >= l; i--) {
                m2.add(m1[b][i]);
            }
            b--;
            for(int i = b; i >= t; i--) {
                m2.add(m1[i][l]);
            }
            l++;
        }

        m2.forEach(x -> System.out.println(x));
    }
}
