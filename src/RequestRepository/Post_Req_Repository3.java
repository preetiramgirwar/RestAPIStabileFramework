package RequestRepository;

public class Post_Req_Repository3 {

	public static String BaseURI() {
		String baseURI="https://reqres.in/";
		return baseURI;
	}
	
	public static String Post_Resource() {
		String post_Resource="api/register";
		return post_Resource;
	}
	
	public static String Post_Req_TC3() {
		String RequestBody="{\r\n"
				+ "    \"email\": \"eve.holt@reqres.in\",\r\n"
				+ "    \"password\": \"pistol\"\r\n"
				+ "}";
		return RequestBody;
	}

}
