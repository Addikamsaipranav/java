#include<stdio.h>
void main(){
    int x, i,j,n,m;
    printf("enter the no of employes you need to enter: ");
    scanf("%d",&n);
    char a[n+1][15]; 
    int b[n+1][15];
    int total;
    int t[n+1];
   
    float per[n+1];
     for(i=0;i<n+1;i++)
      {
        for(j=0;j<15;j++)
         {
           if(i==0){
            printf("enter the meta data elements at %d column",(j+1));
	     scanf("%c",&a[i][j]);
              }
           else if(j==0 && i>0){
            printf("enter the employe names: ");
            scanf("%c",&a[i][j]);
           }
           else if(i>0 && j>1 && j<=13){
             printf("enter the absent days in %c : ",a[0][j-1]);
             scanf("%d",&b[i][j-1]);
           }
        }
      }
     for(i=1;i<n+1;i++)
    { 
        total=0;
         for(j=1;j<=13;j++)
        {
             total=total+b[i][j];
       }
          t[i]=total;
           per[i] = (t[i]/200)*100;
      }
                   
    
    for(i=0;i<n+1;i++)
    {
      for(j=0;j<15;j++)
      {
         if(i==0)
            printf("%c",a[i][j],"\t"," ");
            
         else if(j==0 && i>0)
            printf("%c",a[i][j],"\t"," ");
            
         else if(i>0 && j>0 && j<13)
            printf("%d",b[i][j],"\t"," ");
            
         else if(i>0 && j==13)
            printf("%d",t[i],"\t"," ");
            
         else if(j==14 && i>0)
           printf("%f",per[i],"\t"," ");
       
       }
       printf("\n");
    }
   
  }
