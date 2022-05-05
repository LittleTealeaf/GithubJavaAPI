import api.IGithubClient;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GithubClientTest {

    GithubClient githubClient;

    @BeforeEach
    void setUp() {
        githubClient = new GithubClient();
    }

    @Test
    void notnull() {
        assertNotNull(githubClient);
    }

    @AfterEach
    void tearDown() {
        githubClient = null;
    }
}