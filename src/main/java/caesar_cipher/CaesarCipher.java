package caesar_cipher;

/** 
 * Encrypts given string using Caesar cipher encryption techniques.   
 * 
 * @author Mykhaylo Symulyk
 * @version 1.0
 * 
 */
public class CaesarCipher {
	
	/**
	 * Maximum characters in Unicode: from  U+0000 to U+10FFFF.
	 */
	private static final int LIMIT = Character.MAX_CODE_POINT;
	
	/**
	 * Shift step, could be negative or positive.
	 * If it equals to 0, so there is no encription process. 
	 */
	private int shiftStep;

	public int getShiftStep() {
		return shiftStep;
	}

	public void setShiftStep(int shiftStep) {
		this.shiftStep = shiftStep;
	}

	/**
	 *  In default constructor shiftStep = 0, so string will not be encrypted.
	 */
	public CaesarCipher() {
	
		this.setShiftStep(0);
		
	}

	public CaesarCipher(int shiftStep) {
		this.setShiftStep(shiftStep);
	}
	
	/**
	 * Encrypts given string using Caesar cipher  encryption techniques. 
	 * 
	 * @param s string to be encrypted.
	 *                 
	 * @return String encrypted string. If null is passed as argument
	 *             it returns empty String. 
	 */	
	public String encipher(String s){
		
		if (s == null)
			return "";
		
		if (this.shiftStep == 0)
			return s;
		
        char[] chArray = s.toCharArray();
        
        for (int i = 0; i<chArray.length; i++) {
        	
        	if (Character.isAlphabetic((int)chArray[i]) || Character.isDigit((int)chArray[i]))
        	{
        		chArray[i] = (char) (( chArray[i] + this.shiftStep ) % CaesarCipher.LIMIT); 
        	}
        }
		
		
		String encrypted = new String(chArray);
		
		return encrypted;
		
	}
	
	
	
	

}
