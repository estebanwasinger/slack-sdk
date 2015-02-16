package org.stevew;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by estebanwasinger on 1/4/15.
 */
public class SlackRequest {

    private String operation;
    private Map<String,String> arguments;
    private String token;

    public SlackRequest(String token){
        arguments = new HashMap<String,String>();
        this.token = token;
    }

    public String getOperation() {
        return operation;
    }
    
    public SlackRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }

    public SlackRequest addArgument(String argName, String argValue){
        if(argValue == null){
            return this;
        }
        try {
            arguments.put(argName, URLEncoder.encode(argValue, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return this;
    }

    public SlackRequest enablePretty(){
        arguments.put("pretty","1");
        return this;
    }

    public String createUrl() {
        String url = "https://slack.com/api/" + operation + "?token="+token;
        for (Map.Entry<String, String> entry : arguments.entrySet()) {
            url = url.concat("&" + entry.getKey() + "=" + entry.getValue());
        }
        return url;
    }
}
