package tesstng_Fundamentals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AlwaysRun {
@Test
public void begin() {
	System.out.println("This is the begining part of it");
}
@Test(dependsOnMethods = "begin") 
		public void mid() {
	System.out.println("This is the middle part of it");
	Assert.fail();
}
@Test(dependsOnMethods = {"begin","mid"}, alwaysRun = true) 
public void end() {
	System.out.println("This is the end part of it");
}
}
