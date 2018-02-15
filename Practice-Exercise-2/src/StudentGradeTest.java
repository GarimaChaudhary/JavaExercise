import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StudentGradeTest {
	
	StudentGrade mark;
	
    @Before
    public void setup(){
    	mark=new StudentGrade();
    }
    
    @After
    public void cleanup()
    {
       mark=null;
    }
	
//	@Test
//	public void testGrade() {
//		
//		String str1="abcd";
//		
//		boolean res=mark.isInteger(str1);		
//		assertFalse(res);
//	}
	
	
	@Test
	public void checkOutputAvg() {
		String[] mark1 = {"12","13","14","11","10"};
		int avg1=12;
		
		//int avg2=mark.average(mark1);
		
		assertEquals("Wrong average",avg1,mark.average(mark1));
	}
	
	@Test
	public void checkOutputMin() {
		String[] mark1 = {"12","13","14","11","10"};
		int min=10;
		
		//int avg2=mark.average(mark1);
		
		assertEquals("Wrong average",min,mark.minimum(mark1));
	}
	
	@Test
	public void checkOutputMax() {
		String[] mark1 = {"12","13","14","11","10"};
		int max=14;
		
		//int avg2=mark.average(mark1);
		
		assertEquals("Wrong average",max,mark.maximum(mark1));
	}

}