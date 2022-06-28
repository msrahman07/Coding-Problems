class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] people = new int[n+1];
        
        for(int i=0; i<trust.length; i++){
            people[trust[i][1]] += 1;
            people[trust[i][0]] = -1;    
        }
        for(int i=1; i<=n; i++){
            if(people[i]==n-1){
                return i;
            }
        }
        return -1;
    }
}
