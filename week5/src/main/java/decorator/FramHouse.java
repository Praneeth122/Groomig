package decorator;

public class FramHouse extends Pizza
{
    public FramHouse() { 
    	this.description = "FarmHouse"; 
    }
    
    public int getCost() { 
    	return 200; 
    }
}