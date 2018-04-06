import java.util.*;
public class Linklist_op{
	public static void main (String[] args){
		Scanner read=new Scanner(System.in);
		LinkList list=new LinkList();
		while(true){
			System.out.println("请选择操作：\n1:遍历链表\n2:增加数据\n3:插入数据\n4：按位置删除数据\n5:查询数据位置");
			int sw=read.nextInt();
			switch(sw){
				case 1:
					list.printlist();
					break;
				case 2:
					System.out.print("请输入数据：");
					Node newNode=new Node(read.nextInt());
					list.add(newNode);
					break;
				case 3:
					System.out.print("请输入数据：");
					Node newdata=new Node(read.nextInt());
					System.out.print("请输入位置：");
					int local=read.nextInt();
					list.add(local,newdata);
					break;
				case 4:
					System.out.print("请输入删除位置：");
					list.delate(read.nextInt());
					break;
				case 5:
					System.out.print("请输入数据：");
					Node searchNode=new Node(read.nextInt());
					System.out.println("local:"+list.search(searchNode));
					break;
			}
		}
	}
}