package dataHora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Explicacao {

	public static void main(String[] args) {
		// Instanciação

		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();

		LocalDate d04 = LocalDate.parse("2023-03-10");
		LocalDateTime d05 = LocalDateTime.parse("2023-03-10T01:30:26");
		Instant d06 = Instant.parse("2023-03-10T01:30:26Z");
		Instant d07 = Instant.parse("2023-03-10T01:30:26-03:00");

		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d08 = LocalDate.parse("20/07/2020", fmt1);

		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime d09 = LocalDateTime.parse("20/07/2020 01:30", fmt2);

		LocalDate d10 = LocalDate.of(2023, 3, 10);
		LocalDateTime d11 = LocalDateTime.of(2023, 03, 10, 1, 30);

		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyy");
		DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm");
		DateTimeFormatter fmt5 = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt6 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt7 = DateTimeFormatter.ISO_INSTANT;

		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault()); // convertendo o instante para uma hora loxal
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal")); // convertendo o instante para uma hora loxal
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));

		LocalDate pastWeekLocalDate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusDays(7);

		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);

		Instant pastWeeInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);

		Duration t1 = Duration.between(pastWeekLocalDateTime, d05);
		Duration t2 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
		Duration t3 = Duration.between(d06, pastWeeInstant);
		
		System.out.println("d01 = " + d01);
		System.out.println("d02  = " + d02);
		System.out.println("d03  = " + d03.toString()); // com Fuso horário de Londres
		System.out.println("d04 = " + d04);
		System.out.println("d05  = " + d05);
		System.out.println("d06  = " + d06); // com padrão de londres
		System.out.println("d07 = " + d07);
		System.out.println("d08 = " + d08);
		System.out.println("d09 = " + d09);
		System.out.println("d010 = " + d10);
		System.out.println("d011 = " + d11);
		System.out.println("fmt3 " + d04.format(fmt3) + " ----- " + fmt3.format(d04));
		System.out.println("fmt4 " + d05.format(fmt4) + " ----- " + fmt4.format(d05));
		System.out.println("fmt5 " + fmt5.format(d06));
		System.out.println("fmt6 " + d05.format(fmt6) + " ----- " + fmt6.format(d05));
		System.out.println("fmt7 " + fmt7.format(d06));
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3);
		System.out.println("d04 dia = " + d04.getDayOfMonth());
		System.out.println("d04 mês = " + d04.getMonthValue());
		System.out.println("d04 ano = " + d04.getYear());
		System.out.println("d05 hora = " + d05.getHour());
		System.out.println("d05 minutos = " + d05.getMinute());
		System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
		System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
		System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);
		System.out.println("pastWeeInstant = " + pastWeeInstant);
		System.out.println("nextWeekInstant = " + nextWeekInstant);
		System.out.println("t1 =  " + t1.toDaysPart());
		System.out.println("t2 =  " + t2.toDaysPart());
		System.out.println("t3 =  " + t3.toDaysPart());
	}

}
