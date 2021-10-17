package part3.ex3.gettersSetters;

import java.util.Scanner;

public class ExamList {
	private Exam[] exams;
	private int current;
	
	public void printList() {
		this.printList(this.current); // 집중화
	}
	
//	static void printList(ExamList list) {
//		printList(list, list.current); // 집중화
//	}
	
	public void printList(int size) { // overloading
		System.out.println("┌──────────────────────────────────────────────┐");
        System.out.println("│                    성적 출력                                                      │");
        System.out.println("└──────────────────────────────────────────────┘");
        System.out.println();
        
        // int size = list.current;
        Exam[] exams = this.exams;
        
        for(int i=0; i<size; i++) {
	        Exam exam = exams[i];
	        int kor = exam.getKor(); // exam.kor;
	        int eng = exam.getEng(); // exam.eng;
	        int math = exam.getMath(); // exam.math;
	        
		    int total = exam.total(); // kor + eng + math;
		    float avg = exam.avg(); // total / 3.0f;
			
		    System.out.printf("국어: %d\n", kor);
		    System.out.printf("영어: %d\n", eng);
		    System.out.printf("수학: %d\n", math);
	        
	        System.out.printf("총점 : %3d\n", total);
	        System.out.printf("평균 : %6.2f\n", avg);
	        
	        System.out.println("────────────────────────────────────────────────");
        }
	}
	
//	static void printList(ExamList list, int size) { // overloading
//		System.out.println("┌──────────────────────────────────────────────┐");
//        System.out.println("│                    성적 출력                                                      │");
//        System.out.println("└──────────────────────────────────────────────┘");
//        System.out.println();
//        
//        // int size = list.current;
//        Exam[] exams = list.exams;
//        
//        for(int i=0; i<size; i++) {
//	        Exam exam = exams[i];
//	        int kor = exam.kor;
//	        int eng = exam.eng;
//	        int math = exam.math;
//	        
//		    int total = kor + eng + math;
//		    float avg = total / 3.0f;
//			
//		    System.out.printf("국어: %d\n", kor);
//		    System.out.printf("영어: %d\n", eng);
//		    System.out.printf("수학: %d\n", math);
//	        
//	        System.out.printf("총점 : %3d\n", total);
//	        System.out.printf("평균 : %6.2f\n", avg);
//	        
//	        System.out.println("────────────────────────────────────────────────");
//        }
//	}

	public void inputList() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("┌──────────────────────────────────────────────┐");
        System.out.println("│                   성적 입력                                                         │");
        System.out.println("└──────────────────────────────────────────────┘");
        System.out.println();
        
        
			int kor, eng, math;
			
			do {
		        System.out.printf("국어: ");
		        kor = scan.nextInt();
	        
		        if(kor < 0 || 100 < kor)
		        	System.out.println("국어성적은 0~100까지의 범위만 가능합니다.");
		        
	        } while(kor < 0 || 100 < kor);
			
			do {
		        System.out.printf("영어: ");
		        eng = scan.nextInt();
	        
		        if(eng < 0 || 100 < eng)
		        	System.out.println("영어성적은 0~100까지의 범위만 가능합니다.");
		        
	        } while(eng < 0 || 100 < eng);
			
			do {
		        System.out.printf("수학: ");
		        math = scan.nextInt();
	        
		        if(math < 0 || 100 < math)
		        	System.out.println("수학성적은 0~100까지의 범위만 가능합니다.");
		        
	        } while(math < 0 || 100 < math);

			/*
			Exam exam = new Exam();
	        exam.setKor(kor); // exam.kor = kor;
	        exam.setEng(eng); // exam.eng = eng;
	        exam.setMath(math); // exam.math = math;
	        */
			
			Exam exam = new Exam(kor, eng, math);
	        
	        Exam[] exams = this.exams; // this는 parameter로 넘겨 받은 list
	        int size = this.current;	        
		    
	        if(exams.length == size) {
	        	// 1. 크기가 5개 정도 더 큰 새로운 배열을 생성하시오.
	        	Exam[] temp = new Exam[size + 5];
	        	
	        	// 2. 값을 이주시키기.
	        	for(int i=0; i<size; i++)
	        		temp[i] = exams[i];
	        	
	        	// 3. list.exams가 새로 만든 temp 배열을 참조하도록 한다.
	        	this.exams = temp;
	        }
	        
	        this.exams[this.current] = exam;
	        this.current++;
	        
	        System.out.println("────────────────────────────────────────────────");
        
	}
	
//	static void inputList(ExamList list) {
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("┌──────────────────────────────────────────────┐");
//        System.out.println("│                   성적 입력                                                         │");
//        System.out.println("└──────────────────────────────────────────────┘");
//        System.out.println();
//        
//        
//			int kor, eng, math;
//			
//			do {
//		        System.out.printf("국어: ");
//		        kor = scan.nextInt();
//	        
//		        if(kor < 0 || 100 < kor)
//		        	System.out.println("국어성적은 0~100까지의 범위만 가능합니다.");
//		        
//	        } while(kor < 0 || 100 < kor);
//			
//			do {
//		        System.out.printf("영어: ");
//		        eng = scan.nextInt();
//	        
//		        if(eng < 0 || 100 < eng)
//		        	System.out.println("영어성적은 0~100까지의 범위만 가능합니다.");
//		        
//	        } while(eng < 0 || 100 < eng);
//			
//			do {
//		        System.out.printf("수학: ");
//		        math = scan.nextInt();
//	        
//		        if(math < 0 || 100 < math)
//		        	System.out.println("수학성적은 0~100까지의 범위만 가능합니다.");
//		        
//	        } while(math < 0 || 100 < math);
//	        
//			Exam exam = new Exam();
//					
//	        exam.kor = kor;
//	        exam.eng = eng;
//	        exam.math = math;
//	        
//	        Exam[] exams = list.exams;
//	        int size = list.current;	        
//		    
//	        if(exams.length == size) {
//	        	// 1. 크기가 5개 정도 더 큰 새로운 배열을 생성하시오.
//	        	Exam[] temp = new Exam[size + 5];
//	        	
//	        	// 2. 값을 이주시키기.
//	        	for(int i=0; i<size; i++)
//	        		temp[i] = exams[i];
//	        	
//	        	// 3. list.exams가 새로 만든 temp 배열을 참조하도록 한다.
//	        	list.exams = temp;
//	        }
//	        
//	        list.exams[list.current] = exam;
//	        list.current++;
//	        
//	        System.out.println("────────────────────────────────────────────────");
//        
//	}
	
//	public void init() { // this 생략을 권장. cf.) 생략하면 안될 때O
//		exams = new Exam[3];
//		current = 0;		
//	}
	
	public ExamList() { // 생성자. 함수 이름이 아니고 한정사.
		exams = new Exam[3];
		current = 0;		
	}
	
}
