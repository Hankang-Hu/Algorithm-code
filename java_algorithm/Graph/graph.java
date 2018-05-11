import java.util.Scanner;
public class graph {
	public int size;
	public String[] vertex;
	public adjlist[] list;
	public int[][] edge;
	public graph(int size,String[] vertex,int[][] edge){
		this.size = size;
		this.vertex  = new String[size];
		this.edge = new int[size][size];
		this.vertex = vertex;
		this.edge = edge;
	}
	public graph(int size,adjlist[] list){
		this.size = size;
		this.list = new adjlist[size];
		this.list = list;
	}
	/*public graph(){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入顶点个数：");
		int num=input.nextInt();
		//double dou = input.nextDouble();
		//String str = input.nextLine();
		vertex = new int[num];
		edge = new int[num][num];
		System.out.printf("共有%d个顶点\n",num);
		System.out.println("请输入顶点值");
		for(int i = 0; i < num; i++){
			System.out.printf("顶点%d:",i);
			vertex[i] = input.nextInt();
		}
		System.out.println("请输入边,输入任意字符结束输入");
		int from,to,value;
		while(true){
			System.out.print("edge from :");
			if(input.hasNextInt())
				from = input.nextInt();
			else break;
			System.out.print("edge to   :");
			if(input.hasNextInt())
				to = input.nextInt();
			else break;
			System.out.print("edge value:");
			if(input.hasNextInt())
				value = input.nextInt();
			else break;
			edge[from][to] = value;

		}
		for(int i=0;i < num;i++){
			for(int j = 0; j < num; j++)
				System.out.print(edge[i][j]+" ");
			System.out.print("\n");
		}
	}*/
}
