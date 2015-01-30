package com.nature.aefront;

import static org.junit.Assert.assertEquals;

import java.net.URI;

import javax.ws.rs.core.Application;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.test.JerseyTest;
import org.junit.Test;

public class HomeResourceTest extends JerseyTest {

    @Override
    protected Application configure() {
        return new AEApplication();
    }

    @Override
    protected URI getBaseUri() {
        return UriBuilder.fromUri(super.getBaseUri()).path("/").build();
    }

    @Test
    public void testClientStringResponse() {
        String s = target().path("/home").request().get(String.class);
        assertEquals("No place like home!", s);
    }

}