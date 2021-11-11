package ppmtests;


import org.junit.Assert;
import org.junit.Test; 

public class PPMSampleTest {


	    private String INPUT = "13412";
	    @Test 
	    public void testLength() { 
	        Assert.assertEquals(INPUT,"13412");  
	    }
	    
	    @Test 
	    public void testLengthCopy() { 
	        Assert.assertEquals(INPUT,"13412");  
	    }


}
