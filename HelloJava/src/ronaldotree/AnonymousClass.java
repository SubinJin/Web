package ronaldotree;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonymousClass {
	public static void main(String[] args) {
		// 익명 클래스 - 이름 없는 클래스, 일회용 클래스
		// 거의 이벤트 처리용으로 사용하고 사용 후 없애버림
		// 자바 스크립트 : function sayHello(){}
		// function(){}

		// 익명 클래스 선언
		Object o = new Object();
		o = new Object() {
		};

		Button btn = new Button("OK");
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼이 클릭됨!");
			}
		});
	}

}
