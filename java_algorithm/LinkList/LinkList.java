import java.util.*;
import java.lang.*;

public class LinkList{
	Node Head=null;
	//定义节点类型

//自定义异常
/*	public class myException extends Exception{
		public myException(){}
		public myException(String s){
			super(s);
		}
	}*/
//增加节点
	public void add(Node p){
		if(Head == null){
			Head = p;
			return;
		}else{
			Node temp = Head;
			while(temp.next!=null){
				temp = temp.next;
			}
			temp.next=p;
			return;
		}
	}
//插入节点
	public void add(int i,Node p){
		if(i<0 || i>length()){
			System.out.println("位置异常！操作失败");
			return;
		}
		i=i-1;
		int a=1;
		Node temp=Head;
		if(i==0){
			p.next=temp;
			Head=p;
			return;
		}
		while(temp.next!=null){
			if(a==i){
				break;
			}
			temp=temp.next;
			a++;
		}
		p.next=temp.next;
		temp.next=p;
		return;
	}
//删除第i个节点
	public boolean delate(int i){
		if(i<1 || i>length()){
			return false;
		}else if(i==1){
			Head=Head.next;
			return true;
		}
		int a=2;
		Node preNode=Head;
		Node curNode=Head.next;
		while(curNode!=null){
			if(a==i){
				preNode.next=curNode.next;
				return true;
			}
			preNode=curNode;
			curNode=curNode.next;
			a++;
		}
		return false;
	}
//查询Node节点，返回位置, 
	public int search(Node p){
		int i=1;
		Node temp = Head;
		while(temp!=null){
			if(temp.data==p.data){
				return i;
			}
			temp=temp.next;
			i++;
		}
		System.out.println("查询失败！节点不存在");
		return -1;
	}
//得到第i个数据的节点
	public Node get(int i){
		if(i<1 || i>length()){
			System.out.println("位置异常！操作失败");
			return null;
		}
		int a=1;
		Node temp = Head;
		while(temp!=null){
			if(a==i){
				return temp;
			}
			temp=temp.next;
			a++;
		}
		System.out.println("操作失败！");
		return null;
	}
//得到链表长度
	public int length(){
		int i=0;
		Node temp=Head;
		while(temp!=null){
			i++;
			temp=temp.next;
		}
		return i;
	}
//遍历
	public void printlist(){
		Node temp = Head;
		if(Head==null){System.out.println("链表为空！");return;}
		int i=1;
		while(temp!=null){
			System.out.println("第"+i+"个元素为： "+temp.data);
			temp=temp.next;
			i++;
		}
	}
}