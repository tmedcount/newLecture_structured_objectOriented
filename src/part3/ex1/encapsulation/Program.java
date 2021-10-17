package part3.ex1.encapsulation;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		ExamList list = new ExamList();
		
		ExamList.init(list);
		
		int menu;
        boolean keepLoop = true;
        int current = 0;
		
		while(keepLoop) {
			menu = inputMenu();
	        
	        switch(menu) {	        
	        case 1:
	        	
				ExamList.inputList(list);
	        	       
		        break;
	        case 2:
		        
	        	ExamList.printList(list, 2);
	        	
		        break;
	        case 3:
	        	
	        	System.out.println("Bye~~");
	        	
	        	keepLoop = false;
	        	
				break;	        
	        default:
	        	
	        	System.out.println("입력 오류. 1~3까지만 입력할 수 있습니다..");
	       
	        }
	}
}
	
	
	static int inputMenu() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("┌──────────────────────────────────────────────┐");
        System.out.println("│                   메인 메뉴                                                         │");
        System.out.println("└──────────────────────────────────────────────┘");
        System.out.println("\t1. 성적입력 ");
        System.out.println("\t2. 성적출력 ");
        System.out.println("\t3. 종료 ");
        System.out.println("\t선택> ");
        int menu = scan.nextInt();
		
		return menu;
	}

}
