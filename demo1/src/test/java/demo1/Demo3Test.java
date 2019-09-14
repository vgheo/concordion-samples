package demo1;

import org.concordion.api.extension.Extensions;
import org.concordion.ext.excel.ExcelExtension;
import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

/**
 * 
 * example:  libreoffice saved as msoffice 2013 xlsx 
 * 
 * 
 *  
 * 
 * 
 *
 */
@RunWith(ConcordionRunner.class)
@Extensions(ExcelExtension.class)
public class Demo3Test {

	public Integer compute(String id) {
		
		return Integer.parseInt(id) * 2;
	}
}
