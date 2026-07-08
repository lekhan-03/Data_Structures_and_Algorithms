class Solution905P {
    void sortbyparity(int[] a) {
        int islow = 0;
        int jslow = a.length - 1;
        for (int ifast = 0; ifast < a.length; ifast++) {
            if (a[ifast] % 2 == 0) {
                swap(a, ifast, islow);
                islow++;
            }
        }
        for (int jfast = a.length - 1; jfast >= 0; jfast--) {
            if (a[jfast] % 2 != 0) {
                swap(a, jfast, jslow);
                jslow--;
            }
        }

    }

    public void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public int[] sortArrayByParity(int[] nums) {
        int[] a= new int[nums.length];
        int first=0;
        int last=a.length-1;
        int i=0;
        int j=nums.length-1;
        while(i<nums.length){
            if(nums[i]%2==0){
                a[first]=nums[i];
                first++;
                
            }
            i++;
            if(nums[j]%2!=0){
                a[last]=nums[j];
                last--;

            }
            j--;
        }
        return a;

    }
}

public class P905Leetcode {

}
