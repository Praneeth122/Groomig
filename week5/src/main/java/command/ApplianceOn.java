package command;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ApplianceOn implements Command{
	
	Appliance appliance;
	
	@Override
	public void execute() {
		appliance.on();
	}

}
