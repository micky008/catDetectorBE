/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.msc.catdetectorbe;

import com.msc.catdetectorbe.providers.CORSFilter;
import java.net.URI;
import javax.ws.rs.core.UriBuilder;
import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

/**
 *
 * @author Michael
 */
public class CatDetectorBE {

 public static void main(String[] args) {
        Config.init();
        URI baseUri = UriBuilder.fromUri("http://localhost/").port(Config.getInstance().getPort()).build();
        ResourceConfig config = new ResourceConfig();
        config.packages(true, "com.msc.catdetectorbe.v1.controller");
        config.register(CORSFilter.class);
        HttpServer server = GrizzlyHttpServerFactory.createHttpServer(baseUri, config, true);
    }
}
