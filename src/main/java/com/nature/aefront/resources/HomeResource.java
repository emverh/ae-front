package com.nature.aefront.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.nature.aefront.models.ShunterView;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("home")
public class HomeResource {

    /**
     * @return Render shunter view.
     */
    @GET
    @Produces(MediaType.TEXT_HTML)
    public ShunterView getIt() {
        return new ShunterView();
    }
}
