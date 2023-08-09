package ch09.unit03;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateUtil3 {
	/**
	 * 날짜 형식이 올바른지 여부를 판별
	 * 
	 * @param date		문자열의 날짜
	 * @return			날짜 형식이 올바른지의 여부(true/false)
	 */	
	public boolean isValidDate(String date) {
		try {
			if (date.length() != 8 && date.length() != 10) {
				return false;
			}
			
			date = date.replaceAll("(\\-|\\.|\\/)", "");
			
			String s;
			
			DateTimeFormatter formatter;
			formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
			
			LocalDate localDate = LocalDate.parse(date, formatter);
			// 2001-02-31=>2001-02-28로 변환, 2000-02-32=>예외발생
			
			s = localDate.format(formatter);
			if( date.equals(s) ) {
				return true;
			}
			
		} catch (Exception e) {
			return false;
		}
		
		return false;
	}
	
	/**
	 * 문자열을 LocalDate 형으로 변환하여 반환
	 * @param date		변환 할 날짜(String)
	 * @return			변환 된 날짜(LocalDate)
	 */
	public LocalDate toLocalDate(String date) {
		LocalDate result = null;
		
		if (!isValidDate(date)) {
			// 메소드의 인자값이 잘못 되었다는 예외를 발생 시킴
			throw new IllegalArgumentException("Invalid date format(yyyyMMdd, yyyy-MM-dd): " + date);
		}
		
		try {
			date = date.replaceAll("\\-|\\/|\\.", "");
			
			DateTimeFormatter formatter;
			formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
			
			result = LocalDate.parse(date, formatter);
			
		} catch (Exception e) {
			throw new IllegalArgumentException("Invalid date format(yyyyMMdd, yyyy-MM-dd): " + date);
		}
		
		return result;
	}
	
	/**
	 * 생년월일을 이용하여 나이를 계산
	 * 
	 * @param birth		생년월일
	 * @return			나이
	 */
	public int toAge(String birth) {
		int age = -1;

		try {
			LocalDate today = LocalDate.now();
			
			LocalDate birthDate = toLocalDate(birth);
			age = (int)birthDate.until(today, ChronoUnit.YEARS);
			
			/*
			LocalDate date = today.withYear(birthDate.getYear());
			age = today.getYear() - birthDate.getYear();
			if(date.isBefore(birthDate)) {  // date < birthDate
				age--;
			}
			*/
		} catch (Exception e) {
			throw new IllegalArgumentException("Invalid date format(yyyyMMdd, yyyy-MM-dd): " + birth);
		}
		
		return age;
	}
	
	/**
	 * 두 날짜 사이의 차이(일자)를 구하여 반환
	 * 
	 * @param startDate	차이를 구할 시작 날짜
	 * @param endDate	차이를 구할 끝나는 날짜
	 * @return			날짜 차이(일자)
	 */
	public long toDiffDays(String startDate, String endDate) {
		long diff = 0;
		
		try {
			LocalDate beginLocal = toLocalDate(startDate);
			LocalDate endLocal = toLocalDate(endDate);
			
			diff = beginLocal.until(endLocal, ChronoUnit.DAYS);
			
		} catch (Exception e) {
			throw new IllegalArgumentException("Invalid date format(yyyyMMdd, yyyy-MM-dd)");
		}
		
		return diff;
	}

	/**
	 * 두 날짜 사이의 차이(시간)를 구하여 반환
	 * 
	 * @param startDateTime	차이를 구할 시작 날짜 및 시간(yyyyMMdd HH:mm:ss)
	 * @param endDateTime	차이를 구할 끝나는 날짜 및 시간(yyyyMMdd HH:mm:ss)
	 * @return				날짜 차이(시간)
	 */
	public long toDiffHours(String startDateTime, String endDateTime) {
		long diff = 0;
		
		try {
			startDateTime = startDateTime.replaceAll("\\-|\\/|\\.", "");
			endDateTime = endDateTime.replaceAll("\\-|\\/|\\.", "");
			
			DateTimeFormatter formatter;
			formatter = DateTimeFormatter.ofPattern("yyyyMMdd HH:mm:ss");
			
			LocalDate beginLocal = LocalDate.parse(startDateTime, formatter);
			LocalDate endLocal = LocalDate.parse(endDateTime, formatter);
			
			diff = beginLocal.until(endLocal, ChronoUnit.HOURS);
			
		} catch (Exception e) {
			throw new IllegalArgumentException("Invalid date format(yyyyMMdd HH:mm:ss, yyyy-MM-dd HH:mm:ss)");
		}
		
		return diff;
	}
	
	/**
	 * 날짜가 윤년인지를 판별
	 * 
	 * @param date	날짜
	 * @return		윤년 여부를 판별하여 윤년이면 true를 리턴
	 */
	public boolean isLeapYear(String date) {
		boolean b = false;

		try {
			LocalDate localDate = toLocalDate(date);
			
			b = localDate.isLeapYear();
			
		} catch (Exception e) {
			throw new IllegalArgumentException("Invalid date format(yyyyMMdd, yyyy-MM-dd)");
		}

		return b;
	}
	
	/**
	 * 기준날짜의 며칠째 되는 날을 구하는 메소드
	 * 
	 * @param date 기준날짜
	 * @param days 며칠째 되는 날을 계산할 일자
	 * @return 며칠후의 날짜(yyyy-MM-dd)
	 */
	public String toDaysLater(String date, long days) {
		String result = null;

		try {
			LocalDate localDate = toLocalDate(date);
			LocalDate targetDate = localDate.plusDays(days);
			
			result = targetDate.toString();
			
		} catch (Exception e) {
			throw new IllegalArgumentException("Invalid date format(yyyyMMdd, yyyy-MM-dd)");
		}

		return result;
	}

}
