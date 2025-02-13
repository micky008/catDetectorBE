package com.msc.catdetectorbe.v1.controller;

import com.msc.catdetectorbe.v1.entity.Info;
import java.util.Date;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Michael
 */
@Path("/v1/site")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SiteController {

    @GET
    @Path("{timestart}/limit")
    public List<Info> getAllInfos(@PathParam("timestart") Date time, @PathParam("limit") int limit) {
        return null;
    }

}
