package part3.ex5.abstract_;

public class ExamList {
	private Exam[] exams;
	private int current;

	public Exam get(int i) {
		
		return this.exams[i];
	}

	public void add(Exam exam) {
		 
		Exam[] exams = this.exams;
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
	        
	    this.exams[this.current] = exam; // this는 parameter로 넘겨 받은 list
	    this.current++;
		
	}

	public ExamList() { // 생성자. 함수 이름이 아니고 한정사.
		exams = new Exam[3];
		current = 0;		
	}

	public int size() {
		
		return current;
	}
	
}
