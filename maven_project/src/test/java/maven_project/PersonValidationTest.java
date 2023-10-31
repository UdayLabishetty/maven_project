package maven_project;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonValidationTest {

	@Test
    public void testValidPerson() {
        assertTrue(PersonValidation.validatePerson("ram", 3025));
    }
    
    @Test
    public void testInvalidPerson() {
        assertFalse(PersonValidation.validatePerson("john", 1234));
    }
	
//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}

}
