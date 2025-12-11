package pac1;

import org.testng.annotations.Test;

public class ContactTest {
	 @Test
		public void createcontactTest()
		{
		 String URL=System.getProperty("url");
		 String BROWSER=System.getProperty("browser");
		 String USERNAME=System.getProperty("username");
		 String PASSWORD=System.getProperty("password");
		 

			System.out.println(URL+"=="+BROWSER+"=="+USERNAME+"=="+PASSWORD);
			System.out.println("Execute contact TEst");
		}
	 @Test
		public void modifycontactTEst()
		{
			System.out.println("modify contact Test");
		}
	 
	 @Test
		public void DeletecontactTEst()
		{
			System.out.println("Delete contact Test");
		}
}
