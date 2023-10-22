//import java.util.HashMap;
//
//class UncrossedLines {
//    private HashMap<Pair<Integer, Integer>, Integer> dp = new HashMap();
//
//    public int maxUncrossedLines(int[] nums1, int[] nums2) {
//        // return helperDfs(0, 0, nums1, nums2);
//        int[] dp = new int[nums2.length+1];
//
//        for(int i = 1; i <= nums1.length; i++) {
//            int[] dpRow = new int[nums2.length+1];
//            for(int j = 1; j <= nums2.length; j++) {
//                if(nums1[i-1] == nums2[j-1]) {
//                    dpRow[j] = dp[j-1] + 1;
//                } else {
//                    dpRow[j] = Math.max(dp[j], dpRow[j-1]);
//                }
//            }
//            dp = dpRow;
//        }
//
//        return dp[nums2.length];
//    }
//
//    private int helperDfs(int i, int j, int[] nums1, int[] nums2) {
//        if(i == nums1.length || j == nums2.length) {
//            return 0;
//        }
//        if(dp.containsKey(new Pair(i, j))) {
//            return dp.get(new Pair(i, j));
//        }
//        if(nums1[i] == nums2[j]) {
//            dp.put(new Pair(i, j), 1+helperDfs(i+1, j+1, nums1, nums2));
//        }
//        else {
//            dp.put(new Pair(i, j), Math.max(helperDfs(i+1, j, nums1, nums2), helperDfs(i, j+1, nums1, nums2)));
//        }
//
//        return dp.get(new Pair(i, j));
//    }
//}