package by.minsler;

import com.googlecode.jsonrpc4j.JsonRpcHttpClient;

import java.net.URL;

/**
 * User: dzmitry.misiuk
 * Date: 11/14/12
 * Time: 1:18 PM
 */
public class TestUserService {
    public static void main(String[] args) throws Throwable {

        JsonRpcHttpClient client = new JsonRpcHttpClient(
                new URL("http://localhost:8080/json"));

        User user = client.invoke("createUser", new Object[] { "bob", "the builder" }, User.class);
    }
}