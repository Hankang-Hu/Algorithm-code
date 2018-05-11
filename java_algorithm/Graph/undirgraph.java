import java.util.*;

class undirgraph{
	int size;
	int type;
	String[] vertex;
	adjlist[] list;
	int[][] matrix;
	graph gh;
	Scanner input = new Scanner(System.in);
	public void inp(){
		System.out.printf("请输入图的顶点数：");
		size = input.nextInt();
		System.out.println("请选择存储结构，输入相应序号：\n1：邻接矩阵	2：邻接表");
		type = input.nextInt();
		if(type == 1){
			vertex = new String[size];
			matrix = new int[size][size];
			int x,y,value;
			System.out.println("开始录制顶点信息");
			for(int i = 0; i < size; i++){
				System.out.printf("顶点%d",i+1);
				vertex[i] = input.next();
			}
			for(int i = 0; i < size; i++){
				System.out.printf("vertex[%d]:%s	\n",i+1,vertex[i]);
			}
			System.out.println("开始录制边信息，请输入顶点序号:");
			while(true){
				System.out.print("edge from:");
				x = input.nextInt();
				System.out.print("edge to  :");
				y = input.nextInt();
				System.out.print("边权值   :");
				value = input.nextInt();
				matrix[x-1][y-1] = value;
				System.out.print("输入0结束:");
				int t = input.nextInt();
				if(t == 0)
					break;
			}
			for(int i = 0; i < size; i++){
				for(int j = 0; j < size; j++){
					System.out.printf("%d	",matrix[i][j]);
				}
				System.out.print("\n");
			}
			
		}
	}
	public static void main(String[] args){
		undirgraph gr = new undirgraph();
		gr.inp();
	}
	
}
