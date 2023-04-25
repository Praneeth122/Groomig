package factory;

public class MotorBikeVehicleFactory extends VehicleFactory{

	@Override
	protected Vehicle createVehicle() {
		return new MotorBikeVehicle();
	}

}
