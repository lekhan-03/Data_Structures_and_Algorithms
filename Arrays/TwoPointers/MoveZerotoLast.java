class SolutionZero{
    int [] moveZeros(int [] a){
        int slow=0;
        for (int fast=0;fast<a.length;fast++){
            if(a[fast]!=0){
                int temp= a[fast];
                a[fast]=a[slow];
                a[slow]=temp;
                slow++;
            }
        }
        return a;
    }
}
public class MoveZerotoLast {
    
}
