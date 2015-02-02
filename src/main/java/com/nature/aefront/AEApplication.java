package com.nature.aefront;

import org.glassfish.jersey.server.ResourceConfig;

import com.nature.aefront.resources.HomeResource;
import com.nature.aefront.writers.ShunterMessageWriter;

public class AEApplication extends ResourceConfig {

    public AEApplication() {
        super(HomeResource.class);

        register(new AEApplicationBinder());
        register(ShunterMessageWriter.class);
    }



}
