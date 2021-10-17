package part3.ex3.gettersSetters;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		ExamList list = new ExamList();
		
		int menu;
        boolean keepLoop = true;
        int current = 0;
		
		while(keepLoop) {
			menu = inputMenu();
	        
	        switch(menu) {	        
	        case 1:
	        	
				// ExamList.inputList(list); 스태틱 메소드(고전적)ㅡ 모든 값을 parameter를 통해 전달.
	        	list.inputList(); // 인스턴스 메소드
	        	       
		        break;
	        case 2:
		        
	        	// ExamList.printList(list);
	        	list.printList();
	        	
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
