package New;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class TestRepo {

    @Test(priority = 1 , groups = {"New"})
    //https://65c9e1133b05d29307df2a54.mockapi.io/api/v1/users
    public void test1() {
        Response response = given()
                .when()
                .get("https://65c9e1133b05d29307df2a54.mockapi.io/api/v1/users")
                .then()
                .extract()
                .response();
    }
    @Test(priority = 1 , groups = {"New"})
    //https://65c9e1133b05d29307df2a54.mockapi.io/api/v1/users
    public void test2() {
        Response response = given()
                .when()
                .get("https://65c9e1133b05d29307df2a54.mockapi.io/api/v1/users")
                .then()
                .extract()
                .response();
    }
    @Test(priority = 1 , groups = {"New"})
    //https://65c9e1133b05d29307df2a54.mockapi.io/api/v1/users
    public void test3() {
        Response response = given()
                .when()
                .get("https://65c9e1133b05d29307df2a54.mockapi.io/api/v1/users")
                .then()
                .extract()
                .response();
    }

}
