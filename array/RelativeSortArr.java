class RelativeSortArr {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int max = 0;
        for(int i = 0 ;i < arr1.length; i++){
            max=Math.max(max, arr1[i]);
        }
        int countarr[] = new int[max+1];
        for(int i = 0 ;i < arr1.length; i++){
            int element= arr1[i];
            countarr[element]++;
        }
        int res[] = new int[arr1.length];
        int j=0;
        for(int i=0 ;i<arr2.length;i++){
         int element= arr2[i];
           while(countarr[element]>0){
            res[j] = element;
            j++;
            countarr[element]--;
           }


        }
        for(int i =0;i<max+1;i++){
            while(countarr[i]>0){
            res[j] = i;
            j++;
            countarr[i]--;
        }
    }
    return res;
}
}