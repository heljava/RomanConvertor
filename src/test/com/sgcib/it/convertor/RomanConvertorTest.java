package com.sgcib.it.convertor;
import org.junit.*;

public class RomanConvertorTest {

	@Test
	public void testRomanConvertorCase1(){
		System.out.println("test convertor with value 89, result should be : LXXXIX" );
		String result = RomanConvertor.convertNumberToRoman(89);
		System.out.println("the result is " + result);
		Assert.assertEquals("LXXXIX", result);
	}
	
	@Test
	public void testRomanConvertorCase2(){
		System.out.println("test convertor with value 1245, result should be : MCCXLV" );
		String result = RomanConvertor.convertNumberToRoman(1245);
		System.out.println("the result is " + result);
		Assert.assertEquals("MCCXLV", result);
	}
	
}
