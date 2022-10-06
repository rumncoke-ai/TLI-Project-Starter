import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse.BodyHandlers;

public class VoiceflowInteract {
    public static void main(String[] args) throws Exception {

        HttpRequest postRequest = HttpRequest.newBuilder()
            .uri(new URI("https://general-runtime.voiceflow.com/state/user/test_user/interact"))
            .header("Authorization", "VF.DM.633d7b31b060e40007430b0c.lfS7X2d9pEZS4oc1")
            .POST(BodyPublishers.ofString("{\"action\": {\"type\": \"text\", \"payload\": \"Can I have some help?\"}}"))
            .build();

        HttpClient httpClient = HttpClient.newHttpClient();

        HttpResponse<String> postResponse = httpClient.send(postRequest, BodyHandlers.ofString());

        System.out.println(postResponse.body());


    }
}
