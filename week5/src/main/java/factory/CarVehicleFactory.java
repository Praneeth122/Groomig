package factory;

public class CarVehicleFactory extends VehicleFactory {

	@Override
	protected Vehicle createVehicle() {
		return new CarVechicle();
	}
}
