class Solution {
    public boolean isHappy(int n) {
        
        int count=0;
       
        
        while(count<30)
        {
            int sum=0;
            int rem=0;
            while(n>0)
            {
                rem=n%10;
                sum=sum+(rem*rem);
                n=n/10;
                count++;
            }
            n=sum;
        

            if(sum==1)
            {
                return true;
            }
        }return false;

           
        

            
    }
}