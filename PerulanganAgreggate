import java.io.* ;

public class PerulanganAgreggate 
{
  public static void main(String [] khamim)  throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int sum=0 ;
    int count=0 ;
    int max=0;
    int min=0;
    int a=0;
    double avg=0.0;
	
	int jmlData=Integer.parseInt(br.readLine()) ;
	
	
    while (count<jmlData) 
	{
      a = Integer.parseInt(br.readLine()) ;
      if(a>max)
      {
        max=a;
      }
      
        if(min==0)
        {
        min=a;
        }
        if(a<min)
        {
          min=a;
        }
      
      sum += a;
      count++ ;
    }
    avg = sum/(double)jmlData ;
    System.out.println("Sum = "+sum) ;
    System.out.println("Max = "+max) ;
    System.out.println("Min = "+min) ;
	System.out.println("Avg = "+avg) ;
  }
}
