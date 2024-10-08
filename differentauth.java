package selenium;

public class differentauth {
	void Basicauth()
	{
		given()
		.auth().basic("username","password")
		.when()
		.then()
		
	}
	void dijestauth()
	{
		given()
		.auth().digest("username","password")
		.when()
		.then()
	}
	void oauth1()
	{
		given()
		.auth().oauth1("consumer key","consumer secret","access token","token secret")
		.when()
		.then()
	}
	void oauth2()
	{
		given()
		.auth().oauth2("token")
		.when()
		.then()	
	}

}
