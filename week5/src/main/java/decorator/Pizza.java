package decorator;

public abstract class Pizza {
	  String description = "Unkknown Pizza";
	  
	    public String getDescription()
	    {
	        return description;
	    }
	 
	    public abstract int getCost();
}
