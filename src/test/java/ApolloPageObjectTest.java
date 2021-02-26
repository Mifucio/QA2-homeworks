import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import pages.BaseFunc;

public class ApolloPageObjectTest {
    private final Logger LOGGER = LogManager.getLogger(this.getClass());

@Test
    public void apolloPageObjectTest() {
    LOGGER.info("This test is checking article titles and comment count");
    BaseFunc baseFunc = new BaseFunc();
    baseFunc.openUrl("http://apollo.lv");
}
}
