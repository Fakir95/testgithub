package q;

import static org.junit.Assert.*;

import org.junit.Test;

public class KnnTest {

	@SuppressWarnings("deprecation")
	@Before 
	public void initialize() {
	       empty= new ArrayList();
	@Test
	public void testaddSize() {
		Knn list = new Knn ();
		list.add (list, 42); 
		list.add (list, -3); 
		list.add (list, 17); 
		list.add (list, 99); 

		assertEquals (4, list.size ()); 
		assertEquals (17, list.get (2)); 
		assertTrue (list.contains (-3, 0)); 
		assertFalse (list.isEmpty ());
	}

}
