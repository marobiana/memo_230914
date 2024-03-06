package com.memo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.function.Function;

import org.junit.jupiter.api.Test;

public class EnumTest1 {

	public enum CalcType {
		// 열거형 정의
		CALC_A(value -> value),
		CALC_B(value -> value * 10),
		CALC_C(value -> value * 3),
		CALC_ETC(value -> 0);
		
		// enum에 정의된 function
		private Function<Integer, Integer> expression;
		
		// 생성자
		CalcType(Function<Integer, Integer> expression) {
			this.expression = expression;
		}
		
		// 계산 적용 메소드
		public int calculate(int value) {
			return expression.apply(value);
		}
	}
	
	@Test
	void cal테스트() {
		// given - 준비
		CalcType calcType = CalcType.CALC_ETC;
		
		// when - 실행
		int result = calcType.calculate(500);
		
		// then - 검증
		assertEquals(0, result);
	}
}









