package mycaptain;
import java.lang.*;
import java.util.*;
public class Mycaptain {
    public static void main(String[] args) {
        int[][] a={{1,2,3},{4,5,6},{7,8,9}};
        int b[][]={{9,8,7},{6,5,4},{3,2,1}};
        int c[][]=new int[3][3];
        System.out.println("enter your choice:\n1.matrix addition\n2.matrix multiplication");
        Scanner sc=new Scanner(System.in);
        int choice,j,k,sum=0;
        choice=sc.nextInt();
        if(choice==1)
        {
            for(int i=0;i<3;i++){
                for(j=0;j<3;j++){
                    c[i][j]=a[i][j]+b[i][j];
                    System.out.print(c[i][j]+"\t");
                }
                System.out.println();
            }
        }
        else
        {
            for(int i=0;i<3;i++)
            {
                for(j=0;j<3;j++)
                {
                    sum=0;
                    for(k=0;k<3;k++)
                    {
                        sum+=a[i][k]*b[k][j];
                    }
                    c[i][j]=sum;
                    System.out.print(c[i][j]+"\t");
                }
                 System.out.println();
            }
        }
    
    }
    
}
