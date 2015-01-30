package com.nature.aefront;

import org.glassfish.hk2.utilities.binding.AbstractBinder;

import com.nature.aefront.services.CheapMessageService;
import com.nature.aefront.services.CheapMessageServiceImpl;

public class AEApplicationBinder extends AbstractBinder {
    @Override
    protected void configure() {
        bind(CheapMessageServiceImpl.class).to(CheapMessageService.class);
    }
}