package by.itacademy.senkina.api;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


public class KufarTestApi {
    private static final Logger logger = LogManager.getLogger();
    public String bodyInactivateData = "{\n  \"password\": \"123\",\n  \"recaptcha_user_response\": \"\",\n  \"recaptcha_secret_version\": \"v1\",\n" +
            "  \"recaptcha_platform\": \"web\",\n  \"lang\": \"ru\",\n  \"login\": \"test@test.by\"\n}";
    public String bodyInvalidData = "{\n  \"password\": \"123\",\n  \"recaptcha_user_response\": \"\",\n  \"recaptcha_secret_version\": \"v1\",\n" +
            "  \"recaptcha_platform\": \"web\",\n  \"lang\": \"ru\",\n  \"login\": \"123@mail.by\"\n}";
    public String bodyEmptyData = "{\n  \"password\": \"\",\n  \"recaptcha_user_response\": \"\",\n  \"recaptcha_secret_version\": \"v1\",\n" +
            "  \"recaptcha_platform\": \"web\",\n  \"lang\": \"ru\",\n  \"login\": \"\"\n}";

    @Test
    public void checkLoginWithInactivateData(){
        logger.info("Started " + Thread.currentThread().getStackTrace()[1].getMethodName());
        JsonObject jsonObject = JsonParser.parseString(bodyInactivateData).getAsJsonObject();
        given().body(jsonObject).header("Content-Type","application/json")
                .post("https://www.kufar.by/l/api/login/v2/auth/signin?token_type=user")
                .then().statusCode(401).
                body("message", equalTo("account inactive"));
        logger.info("Test passed \n");
    }

    @Test
    public void checkLoginWithInvalidData(){
        logger.info("Started " + Thread.currentThread().getStackTrace()[1].getMethodName());
        JsonObject jsonObject = JsonParser.parseString(bodyInvalidData).getAsJsonObject();
        given().body(jsonObject).header("Content-Type","application/json")
                .post("https://www.kufar.by/l/api/login/v2/auth/signin?token_type=user")
                .then().statusCode(401).
                body("message", equalTo("authentication failed"));
        logger.info("Test passed \n");
    }

    @Test
    public void checkLoginWithEmptyData(){
        logger.info("Started " + Thread.currentThread().getStackTrace()[1].getMethodName());
        JsonObject jsonObject = JsonParser.parseString(bodyEmptyData).getAsJsonObject();
        given().body(jsonObject).header("Content-Type","application/json")
                .post("https://www.kufar.by/l/api/login/v2/auth/signin?token_type=user")
                .then().statusCode(400).
                body("message", equalTo("invalid input"));
        logger.info("Test passed \n");
    }

}
