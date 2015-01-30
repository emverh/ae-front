package com.nature.aefront;

import org.glassfish.jersey.server.ResourceConfig;

import com.nature.aefront.resources.HomeResource;

public class AEApplication extends ResourceConfig {

    public AEApplication() {
        super(HomeResource.class);

        register(new AEApplicationBinder());
    }

}
