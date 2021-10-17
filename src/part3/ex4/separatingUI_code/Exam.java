package part3.ex4.separatingUI_code;

public class Exam {
	int kor;
	int eng;
	int math;
	
	public Exam() {
		this(0, 0, 0); // 집중화
	}
	
	public Exam(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor1) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int total() {
		
		return kor+eng+math;
	}
	public float avg() {
		
		return this.total()/3.0f; // this 생략 가능.
	}
	
	
}
