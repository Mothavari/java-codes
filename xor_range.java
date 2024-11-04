public class xor_range {
    public class XOR_cal_range_optimal {
        public static void main(String[] args) {
            int l=3,r=6,a=0,b=0;
            int k=l-1;
    
            if(r%4==1) b=1;
            if(r%4==2) b=r+1;
            if(r%4==3) b=0;
            if(r%4==0) b=r;
    
            if(k%4==1) a=1;
            if(k%4==2) a=k+1;
            if(k%4==3) a=0;
            if(k%4==0) a=k;7+  
    
            int x=a^b;
            System.out.println(x);
        }
    }  
}
