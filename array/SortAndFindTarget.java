import java.util.ArrayList;
import java.util.List;

class SortAndFindTarget {
    public List<Integer> targetIndices(int[] nums, int target) {
        
        List<Integer> res = new ArrayList();
        int larger=0;
        int smaller=0;
        int n=nums.length;

        for(int i : nums){
            if(i<target){
                smaller++;
            }else if(i>target){
                larger++;
            }
        }
        for(int i = smaller ; i<=n-larger-1 ; i++){
            res.add(i);
        }
        return res;

    }
}