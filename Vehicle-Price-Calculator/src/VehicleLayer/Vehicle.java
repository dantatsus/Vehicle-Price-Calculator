package VehicleLayer;

public class Vehicle {
	
	private String vehicleID;
	private String monthOfSale;
	private String cityOfSale;
	private int ProductionYear;
	private double vat;          // Value-added tax
	private int basePrice;    // 
	private double scp;          // Special Consumption Price
	private double tpp;          // total price paid
	
	
	
	public Vehicle(String vehicleid, String monthofsale, String cityofsale, int productionyear, double vat) {
		this.vehicleID = vehicleid;
		this.monthOfSale = monthofsale;
		this.cityOfSale = cityofsale;
		this.ProductionYear = productionyear;
		this.vat = vat;
	}
	
	// Copy Costructor
	
	public Vehicle(Vehicle vehicle) {
		vehicleID =vehicle.vehicleID;
		monthOfSale =vehicle.monthOfSale;
		cityOfSale =vehicle.cityOfSale;
		ProductionYear = vehicle.ProductionYear;
		vat = vehicle.vat;
	}

	public double getVat() {
		return vat;
	}

	public String getVehicleID() {
		return vehicleID;
	}

	public String getMonthOfSale() {
		return monthOfSale;
	}

	public String getCityOfSale() {
		return cityOfSale;
	}

	public int getProductionYear() {
		return ProductionYear;
	}

	public int getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(int basePrice) {
		this.basePrice = basePrice;
	}

	public double getScp() {
		return scp;
	}

	public void setScp(double scp) {
		this.scp = scp;
	}

	public double getTpp() {
		return tpp;
	}

	public void setTpp(double tpp) {
		this.tpp = tpp;
	}

	public void setVat(double vat) {
		this.vat = vat;
	}

	
	
	
}