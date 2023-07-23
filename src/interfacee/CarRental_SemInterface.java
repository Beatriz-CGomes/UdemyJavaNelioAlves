package interfacee;

import java.time.LocalDateTime;

public class CarRental_SemInterface {

	private LocalDateTime start;
	private LocalDateTime finish;

	private Vehicle_SemInterface vehicle;
	private Invoce_SemInterface invoice;

	public CarRental_SemInterface() {
	}

	public CarRental_SemInterface(LocalDateTime start2, LocalDateTime finish, Vehicle_SemInterface vehicle) {
		this.start = start2;
		this.finish = finish;
		this.vehicle = vehicle;
	}
	
	
	public CarRental_SemInterface(LocalDateTime start, LocalDateTime finish, Vehicle_SemInterface vehicle, Invoce_SemInterface invoice) {
		this.start = start;
		this.finish = finish;
		this.vehicle = vehicle;
		this.invoice = invoice;
	}

	public LocalDateTime getStart() {
		return start;
	}

	public void setStart(LocalDateTime start) {
		this.start = start;
	}

	public LocalDateTime getFinish() {
		return finish;
	}

	public void setFinish(LocalDateTime finish) {
		this.finish = finish;
	}

	public Vehicle_SemInterface getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle_SemInterface vehicle) {
		this.vehicle = vehicle;
	}

	public Invoce_SemInterface getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoce_SemInterface invoice) {
		this.invoice = invoice;
	}

}
