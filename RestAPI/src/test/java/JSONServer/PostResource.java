package JSONServer;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PostResource {
    /*
            note: in order to have a api that excepts put/post/delete operations a local JSON server
            has to be installed and running in order for these tests to work. please refer to the following
            site for installation instructions.
         */

    @Test
    public void postTest(){
        RequestSpecification request = RestAssured.given();

        request.header("Content-Type", "application/json");

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", 101);
        jsonObject.put("title", "QA");
        jsonObject.put("author", "Md Taque");

        request.body(jsonObject.toJSONString());

        Response response = request.post("http://localhost:3000/profile");
        int statusCode = response.getStatusCode();
        Assert.assertEquals(201, statusCode);
    }

    @Test
    public void putTest(){
        RequestSpecification request = RestAssured.given();

        request.header("Content-Type", "application/json");

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", 101);
        jsonObject.put("title", "Engineer");
        jsonObject.put("author", "Rohan");

        request.body(jsonObject.toJSONString());

        Response response = request.put("http://localhost:3000/profile/101");
        int statusCode = response.getStatusCode();
        Assert.assertEquals(200, statusCode);
    }

    @Test
    public void deleteTest(){
        RequestSpecification request = RestAssured.given();

        Response response = request.delete("http://localhost:3000/profile/101");
        int statusCode = response.getStatusCode();
        Assert.assertEquals(200, statusCode);
    }

    @Test
    public void putNullTest(){
        RequestSpecification request = RestAssured.given();

        request.header("Content-Type", "application/json");

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", 000);
        jsonObject.put("title", "Engineer");
        jsonObject.put("author", "Rohan");

        request.body(jsonObject.toJSONString());
        Response response = request.put("ttp://localhost:3000/profile/000");
        int statusCode = response.getStatusCode();
        Assert.assertEquals(404, statusCode);
    }
}