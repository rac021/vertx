
package org.inra.vertx;

import io.vertx.core.Vertx;

/**
 *
 * @author ryahiaoui
 */
public class HttpServer {
   
    public static void main(String[] args) {
        
        Vertx vertx = Vertx.vertx() ; 
        
        vertx.createHttpServer()
             .requestHandler( request ->  {
                 request.response().end("<h1> Hello from vertx :-) </h1> ");
             })
             .listen( 8080, ar -> {
                 if(ar.failed()) {
                     System.out.println(" Failed : " + ar.cause() ) ;
                 }
                 else {
                     System.out.println(" Server started ") ;
                 }
                 
             })
                
        ;
    }
}
