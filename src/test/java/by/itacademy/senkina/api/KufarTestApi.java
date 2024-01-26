package by.itacademy.senkina.api;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;


public class KufarTestApi {

    @Test
    public void testLoginFormWithInactivateData(){
        String body1 = "{\n" +
                "  \"password\": \"123\",\n" +
                "  \"recaptcha_user_response\": \"\",\n" +
                "  \"recaptcha_secret_version\": \"v1\",\n" +
                "  \"recaptcha_platform\": \"web\",\n" +
                "  \"lang\": \"ru\",\n" +
                "  \"login\": \"test@test.by\"\n" +
                "}";
        JsonObject jsonObject = JsonParser.parseString(body1).getAsJsonObject();
        given().body(jsonObject).header("Content-Type","application/json")
                .post("https://www.kufar.by/l/api/login/v2/auth/signin?token_type=user")
                .then().log().all();
    }

    @Test
    public void testLoginFormWithInvalidData(){
        String body1 = "{\n" +
                "  \"password\": \"123\",\n" +
                "  \"recaptcha_user_response\": \"\",\n" +
                "  \"recaptcha_secret_version\": \"v1\",\n" +
                "  \"recaptcha_platform\": \"web\",\n" +
                "  \"lang\": \"ru\",\n" +
                "  \"login\": \"123@mail.by\"\n" +
                "}";
        JsonObject jsonObject = JsonParser.parseString(body1).getAsJsonObject();
        given().body(jsonObject).header("Content-Type","application/json")
                .post("https://www.kufar.by/l/api/login/v2/auth/signin?token_type=user")
                .then().log().all();
    }

}
