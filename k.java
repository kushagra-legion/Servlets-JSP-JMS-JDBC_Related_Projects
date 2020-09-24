import java.util.*;
public class k
{  public static void main(String... s)
  { 
	int ar2[];
	int k=0;
	int i,j;
	int flag =0;
	int p=0;
	int uni[]=new int[60];
	int inter[]=new int[60];
	System.out.println("Enter the no. of elements in first set");
	int x1= new Scanner(System.in).nextInt();
	int ar1[]= new int[x1];
	System.out.println("Enter the set 1");
	for(i=0;i<ar1.length;i++)
	{
		ar1[i]= new Scanner (System.in).nextInt();
	}
	System.out.println("Enter the no. of elements in 2nd set");
	int x2 = new Scanner (System.in).nextInt();
	ar2 = new int[x2];
	System.out.println("Enter the set 2");
	for(i=0;i<ar2.length;i++)
	{
		ar2[i]= new Scanner (System.in).nextInt();
		
	}
   if( x1<x2)
	   
   { for (i=0;i<x1;i++)
	   { uni[k]=ar1[i];
          k++;
       }   
     for (i=0;i<x2;i++)
	   {  for( j=0;j<x1;j++)
		   { if( ar1[j]==ar2[i])
			   { break;
			   }
			  else 
			  { flag =1;
              }		  
		   } 
		        if (flag==1)
			{ 
		           uni[k]=ar2[i];
                   k++;
				   flag =0;
			}	   
			
		   
	   }
    if(k==0)
    { 		System.out.println("it is a null set \n");
    }
	else
	{   System.out.println("the union is ...... \n");
        for(i=0;i<k;i++)
		{ System.out.println(uni[i]);
	    }
	}	
   }
   else 
     {  for (i=0;i<x2;i++)
	   { uni[k]=ar2[i];
          k++;
       }   
     for (i=0;i<x1;i++)
	   {  for( j=0;j<x2;j++)
		   { if( ar2[j]==ar1[i])
			   { break;
			   }
			  else 
			  { flag =1;
              }		  
		   } 
		        if (flag==1)
			{ 
		           uni[k]=ar1[i];
                   k++;
				   flag =0;
			}	   
			
		   
	   }
    if(k==0)
    { 		System.out.println("it is a null set \n");
    }
	else
	{   System.out.println("the union is ...... \n");
        for(i=0;i<k;i++)
		{ System.out.println(uni[i]);
	    }
	}
	 }	
	 
	 // for intersection 
	 if (x1<x2)
	 { for(i=0;i<x1;i++)
		 { for(j=0;j<x2;j++)
			 {  if ( ar1[i]==ar2[j])
				 { inter [p]=ar1[i];
			        p++;
				 }	
			 }
         }
		 System.out.println("the intersection is ...... \n");
		 if (p==0)
		 { System.out.println("null set......\n");
	     }
		 else
		 {
		 for (i=0;i<p;i++)
		 {  System.out.println(inter[i]);
		 }
		 }
	 }		 
	 
	 
	 if (x2<x1)
	 { for(i=0;i<x2;i++)
		 { for(j=0;j<x1;j++)
			 {  if ( ar2[i]==ar1[j])
				 { inter [p]=ar2[i];
			        p++;
				 }	
			 }
         }
		 System.out.println("the intersection is ...... \n");
		 if (p==0)
		 { System.out.println("null set......\n");
	     }
		 else
		 { 
		 for (i=0;i<p;i++)
		 {  System.out.println(inter[i]);
		 }
		 }
	 }		 
	 
	 
	 
	 
	 
	 
  }
}
  