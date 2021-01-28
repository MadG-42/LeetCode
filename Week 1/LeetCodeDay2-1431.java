class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandy = 0;
        for(int i = 0; i < candies.length; i++){
            maxCandy = Math.max(maxCandy, candies[i]);
        }
        
        List<Boolean> result = new ArrayList<>();
        for(int i = 0; i < candies.length; i++){
            if(extraCandies+candies[i] >= maxCandy){
                result.add(true);
            } else {
                result.add(false);
            }
        } 
        
        return result;
    }
}
