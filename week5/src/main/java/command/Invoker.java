package command;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Invoker{

	private Command command;
	
	public void execute(){
		this.command.execute();
	}
}
