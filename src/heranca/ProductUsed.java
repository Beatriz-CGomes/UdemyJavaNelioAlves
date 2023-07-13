package heranca;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProductUsed extends Product{
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY");
	
	private Date manuFacture;
	
	public ProductUsed(){}

	public ProductUsed(String name, Double price, Date manuFacture) {
		super(name, price);
		this.manuFacture = manuFacture;
	}

	public Date getManuFacture() {
		return manuFacture;
	}

	public void setManuFacture(Date manuFacture) {
		this.manuFacture = manuFacture;
	}
	
	public String priceTag() {
		return getName() + "(used) R$" +   
     String.format("%.2f", getPrice())	 + " (Manufacture date: "  +  sdf.format(manuFacture);
	}
	
	
}
