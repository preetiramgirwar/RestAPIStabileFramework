package RequestRepository;

public class Post_Req_Repository2 {

	public static String BaseURI() {
		String baseURI="https://reqres.in/";
		return baseURI;
	}
	
	public static String Post_Resource() {
		String post_Resource="api/login";
		return post_Resource;
	}
	
	public static String Post_Req_TC2() {
		String RequestBody="{\r\n"
				+ "    \"email\": \"eve.holt@reqres.in\",\r\n"
				+ "    \"password\": \"cityslicka\"\r\n"
				+ "}";
		return RequestBody;
	}

}
