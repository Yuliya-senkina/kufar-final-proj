package by.itacademy.senkina.domain;

public class BodyGeneration {

    public static String getBody(String email, String password) {

        if (email == null && password == null ) {
            return "{\\n\" +\n" +
                    "                \"  \\\"password\\\": \\\"\\\",\\n\" +\n" +
                    "                \"  \\\"recaptcha_user_response\\\": \\\"\\\",\\n\" +\n" +
                    "                \"  \\\"recaptcha_secret_version\\\": \\\"v1\\\",\\n\" +\n" +
                    "                \"  \\\"recaptcha_platform\\\": \\\"web\\\",\\n\" +\n" +
                    "                \"  \\\"lang\\\": \\\"ru\\\",\\n\" +\n" +
                    "                \"  \\\"login\\\": \\\"\\\"\\n\" +\n" +
                    "                \"}";
        } else if (email == null && password == "123" ) {
            return "{\"query\":\"mutation userAuthenticate($email: String!, $password: String!, $keepMeLoggedIn: Boolean)" +
                    " {\\n  userAuthenticate(\\n    email: $email\\n    password: $password\\n    keepMeLoggedIn: $keepMeLoggedIn\\n  )" +
                    " {\\n    id\\n    email\\n    name {\\n      firstname\\n      lastname\\n      __typename\\n    }\\n    keepUserLoggedIn\\n    " +
                    "code\\n    message\\n    legacyUser\\n    resetPasswordTrigger\\n    __typename\\n  }\\n}\",\"variables\"" +
                    ":{\"email\":\"" + email + "\",\"password\":null}}";
        } else
            return "{\"query\":\"mutation userAuthenticate($email: String!, $password: String!, $keepMeLoggedIn: Boolean)" +
                    " {\\n  userAuthenticate(\\n    email: $email\\n    password: $password\\n    keepMeLoggedIn: $keepMeLoggedIn\\n  )" +
                    " {\\n    id\\n    email\\n    name {\\n      firstname\\n      lastname\\n      __typename\\n    }\\n    keepUserLoggedIn\\n    " +
                    "code\\n    message\\n    legacyUser\\n    resetPasswordTrigger\\n    __typename\\n  }\\n}\",\"variables\"" +
                    ":{\"email\":\"" + email + "\",\"password\":\"" + password + "\"}}";
    }
}
