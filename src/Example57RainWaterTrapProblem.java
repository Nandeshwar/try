public class Example57RainWaterTrapProblem {
    public static void main(String[] args) {
        Example57RainWaterTrapProblem e = new Example57RainWaterTrapProblem();
        int totalBlock = e.getTrappedWaterBlock(new int[]{1, 2, 1, 2, 1});
        System.out.println(totalBlock);
    }

    int getTrappedWaterBlock(int[] buildingHeights) {
        int totalBlock = 0;
        int[] left = new int[buildingHeights.length];
        int[] right = new int[buildingHeights.length];

        left[0] = buildingHeights[0];
        for(int i = 1; i < buildingHeights.length; i++) {
            left[i] = Math.max(buildingHeights[i], buildingHeights[i-1]);
        }

        right[buildingHeights.length-1] = buildingHeights[buildingHeights.length-1];
        for(int i = buildingHeights[buildingHeights.length-2]; i >= 0; i--) {
            right[i] = Math.max(buildingHeights[i], buildingHeights[i+1]);
        }

        for(int i = 0; i < buildingHeights.length; i++) {
            int waterBlock = Math.min(right[i], left[i]) - buildingHeights[i];
            if(waterBlock > 0) {
                totalBlock += waterBlock;
            }
        }
        return totalBlock;
    }
}
