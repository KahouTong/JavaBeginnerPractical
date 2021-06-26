package day3;

public class Stationary {
	enum PencilBox {
	    PEN,
	    PENCIL,
	    MARKER	
	  }
	  public static void main(String[] args) { 
		 for(PencilBox box : PencilBox.values())
		 {
			 System.out.println(box);
		 }
		 PencilBox mybox = PencilBox.MARKER;
		 System.out.println("my box have "+mybox);	 
	  } 	  
}
