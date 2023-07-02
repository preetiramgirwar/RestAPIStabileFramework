package Test_Classes;

import Common_API_Methods.API_Methods;
import org.testng.Assert;

import io.restassured.path.json.JsonPath;
import RequestRepository.Post_Req_Repository2;

public class Post_TC2 {

	public static void extractor() {
		for (int i = 1; i <= 5; i++) {

			int statusCode = API_Methods.ResponseStatusCode(Post_Req_Repository2.BaseURI(),
					Post_Req_Repository2.Post_Resource(), Post_Req_Repository2.Post_Req_TC2());
			
			System.out.println("Status code for Post_Login: " + statusCode);

			if (statusCode == 200) {

				String ResponseBody = API_Methods.ResponseBody(Post_Req_Repository2.BaseURI(),
						Post_Req_Repository2.Post_Resource(), Post_Req_Repository2.Post_Req_TC2());
				
				System.out.println("Response Body: \n" + ResponseBody);

				validator(ResponseBody);

				break;
			} else {
				System.out.println("Incorrect status code received: " + statusCode);
			}
		}
	}

	public static void validator(String ResponseBody) {

		JsonPath JspResponse = new JsonPath(ResponseBody);
		String Res_token = JspResponse.getString("token");

		Assert.assertEquals(Res_token, "QpwL5tke4Pnpja7X4");

	}
}
