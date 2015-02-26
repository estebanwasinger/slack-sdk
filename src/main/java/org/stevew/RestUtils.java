package org.stevew;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.multipart.FormDataMultiPart;
import com.sun.jersey.multipart.file.FileDataBodyPart;

import javax.ws.rs.core.MediaType;
import java.io.File;

/**
 * Created by estebanwasinger on 12/5/14.
 */
public class RestUtils {

    private RestUtils() {
    }

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
        String output = response.getEntity(String.class);

        ErrorHandler.verifyResponse(output);

        return output;
    }

    public static String sendAttachmentRequest(SlackRequest request, File file) {

        WebResource webResource = new Client().resource(request.createUrl());

        WebResource.Builder authorizedWebResource = webResource
                .header("Content-Type", "multipart/form-data");

        FormDataMultiPart multiPart = new FormDataMultiPart();
        multiPart.bodyPart(new FileDataBodyPart("file", file, MediaType.APPLICATION_OCTET_STREAM_TYPE));

        ClientResponse response = webResource.type(MediaType.MULTIPART_FORM_DATA).accept("application/json").post(ClientResponse.class, multiPart);

        if (response.getStatus() != 200) {
            throw new RuntimeException("Failed : HTTP error code : "
                    + response.getStatus());
        }

        String output = response.getEntity(String.class);

        ErrorHandler.verifyResponse(output);

        return output;

    }


    public static SlackRequest newRequest(String token) {
        return new SlackRequest(token);
    }
}
