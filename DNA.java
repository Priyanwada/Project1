khgkjhg
public class DNAmatching {
        public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int ns=sc.nextInt();
    sc.nextLine();
    String[] patterns=new String[ns];
    for(int i=0;i<ns;i++){
    String pattern=sc.nextLine();
    patterns[i]=pattern;
    
    }String dna=sc.nextLine();
    double [] countPattern=new double[ns];
    int sum=0;
    for(int i=0;i<ns;i++){
    countPattern[i]=search(dna,patterns[i]);
    sum+=countPattern[i];
    }
    for(int i=0;i<ns;i++){
    System.out.println((countPattern[i]*100)/sum);
    }
}
    public static int search(String text,String pattern){
              
            int count=0;
            int n=text.length();
            int m=pattern.length();
            
            for(int i=0;i<=n-m;i++){
             String portion=text.substring(i,i+m);
             if(portion.equals(pattern)){
             count++;
             }
                    
            
            }
            return count; 
            }
            }
    

