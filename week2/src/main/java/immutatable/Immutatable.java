package immutatable;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public final class Immutatable {
    private final int id;
	
	private final String name;
	
	private final List<String> testlist;
	
	private final Date date;
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	// Getter function for mutable objects

	public List<String> getTestMap() {
		return new ArrayList<>(testlist);
	}

	public Date getDate() {
	    return new Date(this.date.getTime()); 
	}
	public Immutatable(int i, String n, List<String>li, Date date){
		
		this.id=i;
		this.name=n;
		this.testlist=li;
		this.date=date;
	}
}
