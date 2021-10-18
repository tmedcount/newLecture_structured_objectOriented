package part3.ex5.abstract_;

public abstract class Exam {
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
	public void setKor(int kor) {
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
	
	public abstract int total(); // 추상메소드
	
	protected int onTotal() { // 자식에게만 공유
		
		return kor + eng + math;
	}
	
	public abstract float avg();
	
	
}
