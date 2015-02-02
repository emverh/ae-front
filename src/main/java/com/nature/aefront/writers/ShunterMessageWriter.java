package com.nature.aefront.writers;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.inject.Inject;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;

import org.glassfish.jersey.message.internal.ReaderWriter;

import com.nature.aefront.models.ShunterView;
import com.nature.aefront.services.ShunterClient;

@Produces(MediaType.TEXT_HTML)
public class ShunterMessageWriter implements MessageBodyWriter<ShunterView> {
    @Inject
    ShunterClient shunterClient;

    @Override
    public boolean isWriteable(Class<?> aClass, Type type, Annotation[] annotations, MediaType mediaType) {
        return aClass == ShunterView.class;
    }

    @Override
    public long getSize(ShunterView shunterView, Class<?> aClass, Type type, Annotation[] annotations, MediaType mediaType) {
        return 0;
    }

    @Override
    public void writeTo(ShunterView shunterView, Class<?> aClass, Type type, Annotation[] annotations, MediaType mediaType, MultivaluedMap<String, Object> multivaluedMap, OutputStream outputStream)
            throws IOException, WebApplicationException {
        ReaderWriter.writeToAsString(shunterClient.render(""), outputStream, mediaType);
    }
}
