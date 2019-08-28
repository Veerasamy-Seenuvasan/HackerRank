import java.math.BigDecimal;
import java.util.*;
class Solution{

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();
        
        //New code starts here
        Arrays.sort(s,new Comparator<Object>(){
       @Override
       public int compare(Object ob1,Object ob2){
            String str1 =ob1==null?"0":(String)ob1;
            String str2 =ob2==null?"0":(String)ob2;
            BigDecimal bd1=new BigDecimal(str1);
            BigDecimal bd2=new BigDecimal(str2);
            return bd2.compareTo(bd1);
          }});

        List<String> list = new ArrayList<String>();
        for(String st : s) {
           if(st != null && st.length() > 0) {
              list.add(st);
           }
        }
        s= list.toArray(new String[list.size()]);
        ////New code ends here
    
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
