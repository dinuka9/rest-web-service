package lk.dinuka;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import org.apache.cxf.jaxrs.client.WebClient;

import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.util.Collections;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
        WebClient client = WebClient
                .create("http://localhost:8080/web-service/", Collections.singletonList(new JacksonJsonProvider()))
                .path("example/25").accept(MediaType.APPLICATION_JSON_TYPE);
        Message message = client.get(Message.class);
        System.out.println("Message received : " + message);
    }

}
