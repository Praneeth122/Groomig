package command;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ApplianceOff implements Command{
	
	Appliance appliance;
	
	@Override
	public void execute() {
		appliance.off();
	}

}