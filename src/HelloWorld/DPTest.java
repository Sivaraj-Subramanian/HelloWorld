package HelloWorld;

	import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

	/*
	 * Created by Sivaraj Subramanian on 11/30/17.
	 */
	
	public class DPTest {
		
		@Test(dataProvider = "FileGetterForWrite")
	    public void testUpdateFile(PrintWriter printer) throws Exception{
	        printer.println(15);
	        printer.close();
	    }

	    @Test(dataProvider = "FileGetterForRead")
	    public void testUpdatedFile(String str){
	        str = str.substring(0, str.length() - 1);
	        
	             System.out.println("Value in the file is: " + str);
	        
	     //   Assert.assertEquals(Integer.parseInt(str), 15);
	    }

	    
	    
	    @DataProvider(name="FileGetterForWrite")
	    public static Object[][] fileGetterForWrite(){
	        try {
	            File file = new File("/Users/n902183/test.txt");
	            FileWriter writer = new FileWriter(file, false);
	            PrintWriter printer = new PrintWriter(writer);
	            return new Object[][] {
	                    {
	                            printer
	                    }
	            };
	        } catch (Exception e){
	            e.printStackTrace();
	        }
	        return null;
	    }

	    @DataProvider(name="FileGetterForRead")
	    public static Object[][] fileGetterForRead(){
	        try {
	            byte[] encoded = Files.readAllBytes(Paths.get("/Users/n902183/test.txt"));
	            String str = new String(encoded);
	            return new Object[][] {
	                    {
	                            str
	                    }
	            };
	        } catch (Exception e){
	            e.printStackTrace();
	        }
	        return null;
	    }
	}

	

