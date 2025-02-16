package New;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class NewTest {
    @Test(priority = 1 , groups = {"barcode"})
    //https://65c9e1133b05d29307df2a54.mockapi.io/api/v1/users
    public void test3() {
        Response response = given()
                .when()
                .get("https://65c9e1133b05d29307df2a54.mockapi.io/api/v1/users")
                .then()
                .log().all()
                .extract()
                .response();
    }
    @Test(priority = 2 , groups = {"barcode"})
    //https://65c9e1133b05d29307df2a54.mockapi.io/api/v1/users
    public void test4() {
        Response response = given()
                .when()
                .get("https://65c9e1133b05d29307df2a54.mockapi.io/api/v1/courses")
                .then()
                .log().all()
                .extract()
                .response();
    }
}
