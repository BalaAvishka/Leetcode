class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int count;int i,j;int size=arr.length;
        int[] a=new int[size];
        int k=0;
        for(i=0;i<size;i++){
            if(arr[i]==-99)
            continue;
            count=1;
        for(j=i+1;j<size;j++){
            if(arr[i]==arr[j]){
                count++;
                arr[j]=-99;
            }
        }
        a[k++]=count;
        }
        for(i=0;i<k;i++){
            for(j=i+1;j<k;j++){
                if(a[i]==a[j])
                return false;
            }
        }
        return true;
    }}
    