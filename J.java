package text;

import java.util.*;

public class J {
	static int maze[][];//����
     static int n;
    static int space;//����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("����N��ֵ\n");
          Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
    	while(n<=3||n>10)
    	{
    		System.out.print("�����������������:\n");
    		 n=sc.nextInt();
    	}
	        space=n*n;
    	maze=new int[n][n];
    	System.out.print("����������ֵ���ո����\n");
          for(int i=0;i<n;i++)
        	  for(int j=0;j<n;j++)
        		  maze[i][j]=sc.nextInt();
          
          jisuan(1,1,0);
          if(space==n*n)
          {
        	  System.out.print("��");
          }
          else
        	  
        	  System.out.print(space);
	}
	
	public static void jisuan(int x,int y,int space1)
	{
		if(x==n-2 && y==n-2)
			space=Math.min(space1, space);
		else
		{
			maze[x][y]=1;
			if(y<n-1 && maze[x][y+1]==0) {
				jisuan(x, y+1, space1+1);			//��
			}
			if(x<n-1 && maze[x+1][y]==0) {
				jisuan(x+1, y, space1+1);			//��
			}
			if(x>1 && maze[x-1][y]==0) {
				jisuan(x-1, y, space1+1);			//��
			}
			if(y>1 && maze[x][y-1]==0) {
				jisuan(x, y-1, space1+1);			//��
		}
	}
		maze[x][y]=0;

}
}
