package by.minsler;

import com.googlecode.jsonrpc4j.JsonRpcHttpClient;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * User: dzmitry.misiuk
 * Date: 11/14/12
 * Time: 1:18 PM
 */
public class TestUserService {
    public static void main(String[] args) throws Throwable {

        JsonRpcHttpClient client = new JsonRpcHttpClient(
                new URL("http://localhost:8080/json"));

        User user = client.invoke("createUser", new Object[] { "bob", "бобик","the builder" }, User.class);
        System.out.println(user);

        String word = client.invoke("printWord",new Object[]{"dima"},String.class);
        System.out.println(word);


        List<String> wordList = new ArrayList<String>();

        wordList.add("dima");
        wordList.add("vasia");

        StringBuilder words = client.invoke("printWordArray",new Object[]{wordList},StringBuilder.class);
        System.out.println(words);

        Integer count = client.invoke("getUserCount",new Object[]{},Integer.class);
        System.out.println("count: " + count);



    }
}