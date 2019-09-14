package demo1;

import java.util.StringTokenizer;

import org.concordion.api.FullOGNL;
import org.concordion.api.extension.Extensions;
import org.concordion.ext.excel.ExcelExtension;
import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)
@Extensions(ExcelExtension.class)
@FullOGNL
public class Demo2Test {
	
	private int f;
	
	public void setFactor(int f) {
		this.f=f;
	}

	public int function(int x) {
		return x * f;
		
	}
	
	public int toInt(String s) {
		return Integer.valueOf(s);
	}
	public String str(int i) {
		return Integer.toString(i);
	}

	
	
	// example2 
	public class PersonResult {
		private int ageIn10=-1;
		private String firstName=null;
		private String lastName=null;
		
		public PersonResult(String firstName, String lastName, int ageIn10) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.ageIn10 = ageIn10;
		}
		
		public PersonResult() {
		}		

		
		public Integer getAgeIn10() {
			return ageIn10;
		}
		public void setAgeIn10(int ageIn10) {
			this.ageIn10 = ageIn10;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
	}
	
	public PersonResult processPerson(String name, int age) {	
		PersonResult pr = new PersonResult();
		
		final int DELTA=10;
		
		StringTokenizer st = new StringTokenizer(name);
		pr.setFirstName(st.nextToken());
		pr.setLastName(st.nextToken());
		pr.setAgeIn10(age + DELTA);
		
		return pr;
	
	}

}
