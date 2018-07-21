package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login {
	
	@When("I login ([^\"]*)")
	public void Wlogin(String str)throws Throwable {
		// Express the Regexp above with the code you wish you had
		if(str.equals("to the account providing correct user name and the password"))
			{
				System.out.println("Correct user name and the password");
			}
		if(str.equals("to the account providing incorrect user name and the password"))
			{
				System.out.println("Incorrect user name and the password");
			}
								}


//	@Given("I login ([^\"]*)")
//	public void Glogin(String str) throws Throwable {
//		//Express the Regexp above with the code you wish you had
//			System.out.println("User try to login to the account");
//				}
//
//
//
//	@Then("I login to my account ([^\"]*)")
//	public void Tlogin(String str) throws Throwable {
//					System.out.println("Successful");
//									}
//	
//	@Then("Throw error message ([^\"]*)")
//	public void Tlogin1(String str) throws Throwable {
//					System.out.println("Incorrect password");
//									}		





}