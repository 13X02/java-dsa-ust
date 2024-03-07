class Problem1{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,6,7,8,9,10,11,12,13,14,15};
        int k=3;
        int i,sum=0;
        for(i=0;i<k;i++){
            sum+=arr[i];
        }
        int max = sum;
        for(i=1;i<=arr.length-k;i++){
            sum = sum - arr[i-1] + arr[i+k-1];
            if(sum>max){
                max = sum;
            }
        }
        System.out.println(max);
    }
}