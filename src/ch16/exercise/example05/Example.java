package ch16.exercise.example05;

public class Example {
	public static void main(String[] args) {

		Button btnOk = new Button();

//		btnOk.setClickListener(new Button.ClickListener() {
//			@Override
//			public void onClick() {
//				System.out.println("Ok 버튼을 클릭했습니다.");
//			}
//		});

		btnOk.setClickListener(() -> System.out.println("Ok 버튼을 클릭했습니다."));
		btnOk.click();

		Button btnCancel = new Button();

//		btnCancel.setClickListener(new Button.ClickListener() {
//			@Override
//			public void onClick() {
//				System.out.println("Cancel 버튼을 클릭했습니다.");
//			}
//		});
		btnCancel.setClickListener(() -> System.out.println("Cancel 버튼을 클릭했습니다."));
		btnCancel.click();
	}
}
