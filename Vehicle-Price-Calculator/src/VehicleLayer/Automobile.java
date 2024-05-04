package VehicleLayer;

public class Automobile extends Vehicle{
	
	// Automobiles (execpt vehicle parameters) have only one common parameter : engine volume. 
	
	private double engine_volume;
	private int bp = 200000;         // basedPrice for automobiles
	
	
	
	public Automobile(String vehicleid, String monthofsale, String cityofsale, int productionyear, double vat,
			double engine_volume) {
		super(vehicleid, monthofsale, cityofsale, productionyear, vat);
		this.engine_volume = engine_volume;
	}

	public Automobile(Vehicle vehicle, double engine_volume) {
		super(vehicle);
		this.engine_volume = engine_volume;
		vehicle.setBasePrice(bp);
		// TODO Auto-generated constructor stub
	}

	public double getEngine_volume() {
		return engine_volume;
	}
	
}