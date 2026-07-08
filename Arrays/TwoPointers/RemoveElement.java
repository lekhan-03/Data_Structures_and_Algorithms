class removeEleSolution{
    void removeEle(int [] a,int val){
        int slow=0;
        for (int fast =0;fast<a.length;fast++){
            if(a[fast]!=val){
                a[slow]=a[fast];
                slow++;
            }
        }
    }
}

public class RemoveElement {
    
}
