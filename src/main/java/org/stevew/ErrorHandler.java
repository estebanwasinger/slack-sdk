package org.stevew;

import org.json.JSONObject;
import org.stevew.exceptions.SlackException;

/**
 * Created by estebanwasinger on 2/20/15.
 */
public class ErrorHandler {

    public static void verifyResponse(String response) {
        if (isValidResponse(response)) {
            return;
        }

        String errorCause = new JSONObject(response).getString("error");

        throw new SlackException("Error: " + errorCause);
    }

    private static boolean isValidResponse(String response) {
        return new JSONObject(response).getBoolean("ok");
    }
}
