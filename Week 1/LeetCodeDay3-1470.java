class Solution {
    public int[] shuffle(int[] nums, int n) { 
 
        int x=0; 
        int [] result = new int [n+n];
                        
        for(int i = 0 ; i < nums.length-1; i +=2 ){
            
            result[i]=nums[x++];
            result[i+1]=nums[n++];               
        }
        return result;  
}
}