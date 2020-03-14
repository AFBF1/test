package text;

import java.util.*;

public class J {
	static int maze[][];//矩阵
     static int n;
    static int space;//步数
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("输入N的值\n");
          Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
    	while(n<=3||n>10)
    	{
    		System.out.print("输入错误，请重新输入:\n");
    		 n=sc.nextInt();
    	}
	        space=n*n;
    	maze=new int[n][n];
    	System.out.print("请输入矩阵的值，空格隔开\n");
          for(int i=0;i<n;i++)
        	  for(int j=0;j<n;j++)
        		  maze[i][j]=sc.nextInt();
          
          jisuan(1,1,0);
          if(space==n*n)
          {
        	  System.out.print("无");
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
				jisuan(x, y+1, space1+1);			//右
			}
			if(x<n-1 && maze[x+1][y]==0) {
				jisuan(x+1, y, space1+1);			//下
			}
			if(x>1 && maze[x-1][y]==0) {
				jisuan(x-1, y, space1+1);			//上
			}
			if(y>1 && maze[x][y-1]==0) {
				jisuan(x, y-1, space1+1);			//左
		}
	}
		maze[x][y]=0;

}
}
