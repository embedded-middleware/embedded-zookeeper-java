package io.github.embedded.zookeeper.core;

import org.junit.jupiter.api.Test;

class EmbeddedZkServerTest {
    @Test
    public void testZkServerStart() throws Exception {
        EmbeddedZkServer server = new EmbeddedZkServer();
        server.start();
        server.close();
    }
}
