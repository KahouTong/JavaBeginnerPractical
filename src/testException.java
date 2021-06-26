
public class testException {

	static void checkNumber(int num) throws CustomInvalidException {
		if (num <= 0)
		{
			throw new CustomInvalidException("numbers cannot be 0 and smaller");
		}
		
	    else {
	        System.out.println("Number accepted");
	      }
	}
	
	  public static void main(String[] args) throws CustomInvalidException {
		    checkNumber(20);
		  }
}
