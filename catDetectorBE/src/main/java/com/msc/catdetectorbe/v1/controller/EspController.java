package com.msc.catdetectorbe.v1.controller;

import com.msc.catdetectorbe.v1.entity.Info;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Michael
 */
@Path("/v1/esp")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EspController {

    @POST
     public Boolean postInfo(Info info) {
        return true;
    }
    
}
