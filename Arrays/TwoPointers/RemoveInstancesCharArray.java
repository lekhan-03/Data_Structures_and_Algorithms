class RemoveCharSolution{
    int removeInstances(char [] a, char val){
        int slow=0;
        for (int fast=0;fast<a.length;fast++){
            if(a[fast]!=val){
                a[slow]=a[fast];
                slow++;
            }
        }
        return slow;
    }
}

public class RemoveInstancesCharArray {
    
}
