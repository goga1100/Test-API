import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class APITests {

    @Test
    void Test1(){


       Response response = get("https://reqres.in/api/users?page=2");

        System.out.println("Status Code : " + response.getStatusCode());
        System.out.println("Response : " + response.asString());
        System.out.println("Body : " + response.getBody().asString());
        System.out.println("Time Taken : " + response.getTime());
        System.out.println("Header : " + response.getHeader("Content-Type"));

        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode,200);


    }
    @Test
    void Test2(){

        given().get("https://reqres.in/api/users?page=2").then().statusCode(200);
    }

}
