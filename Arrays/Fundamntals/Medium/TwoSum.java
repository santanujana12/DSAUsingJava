package Arrays.Fundamntals.Medium;

public class TwoSum {
    public static void main(String [] args){
        int nums[] = {1, 6, 2, 10, 3};
        int target = 7;
        int result[] = new int[2]; 
        
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    result[0]=i;
                    result[1]=j;
                }
            }
        }

        for(Integer i:result){
            System.out.println(i);
        }
    }
}
