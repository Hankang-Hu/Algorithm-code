import java.lang.*;
import java.util.*;


class prime{
	public static void main(String[] args) {
		boolean r;
		ArrayList<Integer> input = new ArrayList<Integer>();
		Scanner readnum = new Scanner(System.in);
		while(true){    
			int number = readnum.nextInt();
			if(number != 0){
				input.add(number);
			}else break;
		}
		for(int i=0;i<input.size();i++){
			r = judge(input.get(i));
			if (r==true){
				System.out.println(input.get(i)+": "+"yes");
			} else{
				System.out.println(input.get(i)+": "+"no");
			}
		}
	}
	public static boolean judge(int num){
		if(num==2 || num==3){
			return true;
		}else if(num%6!=5 && num%6!=1){
			return false;
		}else{
			for(int i=5;i<=Math.sqrt(num);i+=6){
				if(num%i==0 || num%(i+2)==0)
					return false;
			}
			return true;
		}
	}

}