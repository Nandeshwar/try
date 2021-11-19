import java.util.HashMap;
import java.util.Map;

public class Example46FruitsInBasket {
    public static void main(String[] args) {
        Map<Integer, Integer> m = new HashMap();
        int[] list = new int[]{3, 3, 3, 1,  2, 1, 1, 2, 3, 3, 4};
        int max = 0;
        int cnt = 0;
        int previousCnt = 0;
        int previousCntBackup = 0;
        for(int v: list) {
            m.put(v, v);
            cnt++;
            previousCnt++;

            if(m.size() == 2 || m.size() == 3) {
                previousCntBackup = previousCnt - 1;
                previousCnt = 1;
            }

            if(m.size() == 3) {
                cnt--;
                max = Math.max(max, cnt);
                cnt = 1 + previousCntBackup;
                m.clear();
                m.put(v, v);
                previousCnt = 1;
                previousCntBackup = 0;
            }
        }
        System.out.println(max);
    }
}
