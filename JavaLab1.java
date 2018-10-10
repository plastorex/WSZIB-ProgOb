public class Lab1 {
    
    public static boolean Ex1_Teen(int a,int b){
        int count=0;
        if(a>=13 && a<= 19) count++;
        if(b>=13 && b<= 19) count++;
        if(count==1) return true;
        return false;
    }
    
    public static int Ex2_Sum(int a,int b, int c){
        int sum=0;
        if(a==13)return sum;
        sum+=a;
        if(b==13)return sum;
        sum+=b;
        if(c==13)return sum;
        return sum+=c;
    }
    
    public static boolean Ex3_123Seq(int[] array){
        
        for(int i=0;i<array.length-3;i++)
            if(array[i]==1)
            if(array[i+1]==2)
            if(array[i+2]==3)
            return true;
                
                return false;
            
    }
    
    public static void main(String args[]) {
        int a=1;
        int b=13;
        int c=2;
        int[] array = {3,2,14,1,2,3,6};
        
        if(Ex1_Teen(a,b))
        System.out.println("teen");
        System.out.println(Ex2_Sum(a,b,c));
        
        if(Ex3_123Seq(array))
        System.out.println("true");
        
    }
}
