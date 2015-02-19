package org.stevew;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

/**
 * Created by estebanwasinger on 12/5/14.
 */
public class RestUtils {

    public static String sendRequest(String url) {
        WebResource webResource = new Client().resource(url);

        ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);

        if (response.getStatus() != 200) {
            throw new RuntimeException("Failed : HTTP error code : "
                    + response.getStatus());
        }

        return response.getEntity(String.class);
    }

    public static String sendRequest(SlackRequest request) {

        WebResource webResource = new Client().resource(request.createUrl());

        ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);

        if (response.getStatus() != 200) {
            throw new RuntimeException("Failed : HTTP error code : "
                    + response.getStatus());
        }

        return response.getEntity(String.class);
    }


    public static SlackRequest newRequest(String token) {
        return new SlackRequest(token);
    }
}
