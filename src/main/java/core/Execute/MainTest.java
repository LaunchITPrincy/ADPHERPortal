package core.Execute;

import java.util.List;
import java.io.File;
import java.io.IOException;
import org.testng.TestNG;
import org.testng.collections.Lists;


public class MainTest {

	   public static void main(String[] args) throws IOException {
		   System.out.println(args[0]);
		   TestNG testng = new TestNG();
			List<String> suites = Lists.newArrayList();
			String defaultPathBase = new File( "." ).getCanonicalPath();
			System.out.println("defaultPathBase :  " + defaultPathBase);
			File content = new File(defaultPathBase, "TestNG.xml");
			System.out.println("content :  " + content);	
			//suites.add(constant.testngpath);//path to xml..
			suites.add(content.getPath());
			//C:\Mousumi\JAVA_eclipse\ArlAmanda
			//suites.add("c:/tests/testng2.xml");
			testng.setTestSuites(suites);
			testng.run();
	    } 
}
