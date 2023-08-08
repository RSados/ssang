package ch09.unit03;

import java.time.LocalDate;

public class DateUtil2 {
	public boolean isValidDate(String date) {
		try {
			if (date.length() != 8 && date.length() != 10) {
				return false;
			}

			/*
			// try ~ catch 안에 있으므로 생략 가능
			String p = "^\\d{4}(\\.|\\-|\\/)?\\d{2}(\\.|\\-|\\/)?\\d{2}$";
			if (! date.matches(p)) {
				return false;
			}
			*/
			
			date = date.replaceAll("(\\-|\\.|\\/)", "");
			if (date.length() != 8) {
				return false;
			}

			int y = Integer.parseInt(date.substring(0, 4));
			int m = Integer.parseInt(date.substring(4, 6));
			int d = Integer.parseInt(date.substring(6, 8));

			LocalDate cal = LocalDate.of(y, m - 1, d);

			int y1 = cal.getYear();
			int m1 = cal.getMonthValue() + 1;
			int d1 = cal.getDayOfMonth();

			if (y != y1 || m != m1 || d != d1) {
				return false;
			}

		} catch (Exception e) {
			// 예외가 발생한 경우 false를 반환
			return false;
		}

		return true;
	}

}
