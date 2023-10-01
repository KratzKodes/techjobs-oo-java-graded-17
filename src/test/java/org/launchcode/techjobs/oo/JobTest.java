package org.launchcode.techjobs.oo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JobTest {
    //TODO: Create your unit tests here

    //Test the Empty Constructor
    @Test
    public void testSettingJobId(){
        Job WebDeveloper = new Job();
        Job JavaDeveloper = new Job();
        assertNotEquals(WebDeveloper,JavaDeveloper);
    }

    //Test the Full Constructor
    @Test
    public void testJobConstructorSetsAllFields() {
        Job ProductTester = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        //assertTrue using instanceof to check the class of an object
        assertTrue(ProductTester instanceof Job);
        assertTrue(ProductTester.getEmployer() instanceof Employer);
        assertTrue(ProductTester.getLocation() instanceof Location);
        assertTrue(ProductTester.getPositionType() instanceof PositionType);
        assertTrue(ProductTester.getCoreCompetency() instanceof CoreCompetency);

        //assertEquals to test value of each field
        assertEquals("Product tester",ProductTester.getName());
        assertEquals("ACME",ProductTester.getEmployer().getValue());
        assertEquals("Desert",ProductTester.getLocation().getValue());
        assertEquals("Quality control",ProductTester.getPositionType().getValue());
        assertEquals("Persistence",ProductTester.getCoreCompetency().getValue());

    }

    @Test
    public void testJobsForEquality(){
        Job ProductTester = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        Job ProductTester2 = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        assertNotEquals(ProductTester,ProductTester2);
    }
}
