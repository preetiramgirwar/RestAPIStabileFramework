Project Description:-

  This project is created to automate all types of APIs(SOAP and REST) primarily using rest assured, TestNG and JsonPath.                                          
  For more details please read the file "README"


Features of the project : 


	1) This project is capable to automate execution and validation :
		> REST: POST, PUT, PATCH, DELETE and GET
		> SOAP: GET and POST
	2) The retry code is the most important feature of this code if in case api doesnt give correct response in the first request, it will 	                            
     send request in loop for certain number of times.
	3) This project is built on concept of keyword driven.
		> I have divided the project into 4 packages
			>> Request Repository(payload) 
			>> API method(http method) 
			>> TestClass(extract and validate responsebody) and 
			>> Driver to run the testclasses as per the sequence mentioned.
	4) The test execution is statical as the playload is fixed and mentioned in request repository for each api separately.
	5) The project is able to log response received.
	6)This project takes less time to execute the test cases as integration process is simple.
	Framework is designed to provide reusable methods or libraries. This is done by encapsulation of common methods.
	7)Stabile/Static framework handles dependencies on other libraries.
