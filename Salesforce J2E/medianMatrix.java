import java.util.*;
public class medianMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m[][]=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                m[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
        int max=0,min=0;
        for(int i=0;i<3;i++){
            if(m[0][i]>max){
                max=m[0][i];
            }
            if(m[2][i]<max){
                max=m[2][i];
            }
        }
        int mid=(max+min)/2;
        int count=0;
        for(int i=0;i<3;i++){
            if(m[2][i]<=mid){
                count+=3;
            }else if(m[2][i]>mid){
                
            }
        }
    }
}
