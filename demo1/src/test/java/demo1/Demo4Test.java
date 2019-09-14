package demo1;

import org.concordion.api.extension.Extensions;
import org.concordion.ext.excel.ExcelExtension;
import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

/**
 * 
 * example:  xlsx edited in libreoffice 
 * 
 * 
 *  
 * 
 * 
 *
 */
@RunWith(ConcordionRunner.class)
@Extensions(ExcelExtension.class)
public class Demo4Test {

	public Integer compute(String id) {
		
		return Integer.parseInt(id) * 2;
	}
}
