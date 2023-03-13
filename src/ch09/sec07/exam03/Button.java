package ch09.sec07.exam03;

public class Button {
	// 정적 멤버 인터페이스
	public static interface ClickListener {
		// 추상 메서드
		void onClick();
	}
	
	// 필드
	private ClickListener clickListner;
	
	// 메서드
	public void setClickListener(ClickListener clickListener) {
		this.clickListner = clickListener;
	}
	
	// Button이 클릭되었을 때 실행하는 메서드 선언
	public void click() {
		this.clickListner.onClick();
	}
}
