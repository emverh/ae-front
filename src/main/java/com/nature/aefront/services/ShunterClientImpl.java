package com.nature.aefront.services;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON_TYPE;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;

public class ShunterClientImpl implements ShunterClient{

    public static final String SHUNTER_ROOT = "http://local.nature.com/";
    public static final String JSON = "{\n" +
            "  \"layout\" : {\n" +
            "    \"namespace\" : \"shunter-booster\",\n" +
            "    \"template\" : \"booster-layout\",\n" +
            "    \"layout\" : \"layout\",\n" +
            "    \"body\" : [ {\n" +
            "      \"template\" : \"booster-home\",\n" +
            "      \"data\" : { }\n" +
            "    } ]\n" +
            "  },\n" +
            "  \"article_assets_home\" : \"http://test-www.nature.com\",\n" +
            "  \"product_title\" : \"Booster\",\n" +
            "  \"hide_cope\" : true,\n" +
            "  \"description\" : \"shunter booster is being described\",\n" +
            "  \"hide_ads\" : true,\n" +
            "  \"marketing_site\" : false,\n" +
            "  \"language\" : \"en\",\n" +
            "  \"npg_copyright\" : \"© 2013 Nature Publishing Group, a division of Macmillan Publishers Limited. All Rights Reserved.\",\n" +
            "  \"publisher\" : \"Nature Publishing Group\"\n" +
            "}";

    @Override
    public String render(String path) {
        // template/
        Client restClient = ClientBuilder.newClient();
        WebTarget target = restClient.target(SHUNTER_ROOT);
        WebTarget resourceTarget = target.path("template/");
        String responseString = resourceTarget.request(APPLICATION_JSON_TYPE).post(Entity.json(JSON), String.class);

        return responseString;
    }
}
