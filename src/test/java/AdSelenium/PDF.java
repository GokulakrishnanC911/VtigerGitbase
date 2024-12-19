package AdSelenium;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class PDF {
public static void main(String[] args) throws Throwable 
{
	File f= new File("C:\\Users\\Gokulakrishnan\\Desktop\\Java_Selenium\\Selenium_Basic\\multipage-pdf.pdf");
	PDDocument pd = PDDocument.load(f);
	int pages = pd.getNumberOfPages();
	PDFTextStripper pt = new PDFTextStripper();
//	String s= pt.getText(pd);
//	System.out.println(s);
//	pt.setStartPage(3);
//	String s1=pt.getText(pd);
//	System.out.println(s1);
	pt.setStartPage(3);
	pt.setEndPage(3);
	String s2= pt.getText(pd);
	System.out.println(s2);
}
}
