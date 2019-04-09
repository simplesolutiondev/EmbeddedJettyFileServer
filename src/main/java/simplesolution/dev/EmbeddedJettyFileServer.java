/**
 * https://simplesolution.dev/
 */
package simplesolution.dev;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.ResourceHandler;

public class EmbeddedJettyFileServer {

    public static void main(String... args) throws Exception {
        Server server = new Server(9090);

        ResourceHandler resourceHandler = new ResourceHandler();
        resourceHandler.setDirAllowed(true);
        resourceHandler.setResourceBase(".");
        server.setHandler(resourceHandler);

        server.start();
        server.join();
    }
}
