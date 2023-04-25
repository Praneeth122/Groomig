package facade;

public class Shop {
	Mobile iphone = new Iphone();
	Mobile samsung  = new Samsung();
	
    public void Sale(String name){  
        switch(name) {
        
        case "Iphone":
        	iphone.name();
        	iphone.price();
        	break;
        
    	case "Samsung":
    		samsung.name();
    		samsung.price();
    		break;
    	}	
    }  
}
