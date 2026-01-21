class Solution {
    public int maximum69Number (int num) {
        int count=0;
        int temp=num;
        while(temp>0)
        {
            count++;
            temp/=10;
        }

        int arr[]=new int[count];
        temp=num;
        for(int i=count-1;i>=0;i--)
        {
            arr[i]=temp%10;
            temp/=10;

        }

        for(int i=0;i<count;i++)
        {
            if(arr[i]==6)
            {
                arr[i]=9;
                break;
            }
        }

         int result = 0;
        for (int i = 0; i < count; i++) {
            result = result * 10 + arr[i];
        }

        return result;

        
    }
}