package com.nature.aefront;

import org.glassfish.hk2.utilities.binding.AbstractBinder;

import com.nature.aefront.services.ShunterClient;
import com.nature.aefront.services.ShunterClientImpl;

public class AEApplicationBinder extends AbstractBinder {
    @Override
    protected void configure() {
        bind(ShunterClientImpl.class).to(ShunterClient.class);
    }
}