package ch05.unit04;

/*
 cmd>java Ex01 a b c
 =>와 같이 실행하면
 =>명령행 인수
 args[0]:"a",args[1]:"b",args[2]:"c"
 */
public class Ex01 {
	public static void main(String[] args) {
		//명령행 인수
		
		System.out.println("명령행 인수 개수 : "+args.length);
		
		System.out.println("명령행 인수값...");
		for(int i=0;i<args.length;i++) {
			System.out.print(args[i]+"  ");
		}
		System.out.println();
		
		/*
		 for(String s : args){
		  System.out.print(s+"  ");
		  }
		  System.out.println();
		 
		 */
		
		
		
		
		
		
		
	}

}
