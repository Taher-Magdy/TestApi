package New;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class TestRepo {
    static {
        RestAssured.filters(new AllureRestAssured());
    }
    @Test(priority = 1 , groups = {"barcode"})
    //https://65c9e1133b05d29307df2a54.mockapi.io/api/v1/users
    public void test1() {
        Response response = given()
                .when()
                .get("https://65c9e1133b05d29307df2a54.mockapi.io/api/v1/courses")
                .then()
                .log().all()
                .extract()
                .response();
    }
    @Test
    public void test3() {
        Response response = given()
                .when()
                .get("https://65c9e1133b05d29307df2a54.mockapi.io/api/v1/users")
                .then()
                .log().all()
                .extract()
                .response();
    }
}
