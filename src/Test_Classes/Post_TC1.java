package Test_Classes;

import Common_API_Methods.API_Methods;
import org.testng.Assert;

import io.restassured.path.json.JsonPath;
import RequestRepository.Post_Req_Repository1;

public class Post_TC1 {

	public static void extractor() {
		for (int i = 0; i < 5; i++) {

			int statusCode = API_Methods.ResponseStatusCode(Post_Req_Repository1.BaseURI(),
					Post_Req_Repository1.Post_Resource(), Post_Req_Repository1.Post_Req_TC1());
			
			System.out.println("Status code for Post_Create User: " + statusCode);
			
			if (statusCode == 201) {
				
				String ResponseBody = API_Methods.ResponseBody(Post_Req_Repository1.BaseURI(),
						Post_Req_Repository1.Post_Resource(), Post_Req_Repository1.Post_Req_TC1());
				System.out.println("Response Body: \n" + ResponseBody);

				validator(ResponseBody);

				break;

			} else {
				System.out.println("Incorrect status code received: " + statusCode);

			}
		}
	}

	public static void validator(String Response) {
		String ResponseBody = API_Methods.ResponseBody(Post_Req_Repository1.BaseURI(),
				Post_Req_Repository1.Post_Resource(), Post_Req_Repository1.Post_Req_TC1());

		JsonPath JspResponse = new JsonPath(ResponseBody);
		String Res_name = JspResponse.getString("name");
		String Res_job = JspResponse.getString("job");

		Assert.assertEquals(Res_name, "morpheus");
		Assert.assertEquals(Res_job, "leader");
	}
}
