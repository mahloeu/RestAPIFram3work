package airlines;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Map;

public class AirlineTests extends  AirlineAPIs {

    @Test
    public void createAirline() throws IOException {
        Map<String, Object> payload = Payloads.getCreateAirlinePayloadFromMap("454645", "ABC Airlines", "IN", "ABC", "ABC Slogan", "Mumbai", "abc.com", "2022");
        Response response = createAirline(payload);
        Assert.assertEquals(response.statusCode(), 200);
    }


}
