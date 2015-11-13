package caesar_cipher;


import org.junit.Assert;
import org.junit.Test;

public class TestCeasarCipher {

	@Test
	public void testEncipher() throws Exception {
		
		CaesarCipher c = new CaesarCipher(4);
		Assert.assertEquals("Lipps", c.encipher("Hello"));
		
		c = new CaesarCipher(0);
		Assert.assertEquals("Hello", c.encipher("Hello"));
		
		c = new CaesarCipher(-1);
		Assert.assertEquals("Ana fhudr 0//$ sn @khbd.", c.encipher("Bob gives 100$ to Alice."));
		
		// If we pass null - it should return empty String.
		Assert.assertEquals("", c.encipher(null));
		
	}

}
