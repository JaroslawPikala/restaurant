package pl.coderslab.smsapi_java_client_example;

import org.springframework.stereotype.Service;
import pl.smsapi.BasicAuthClient;
import pl.smsapi.OAuthClient;
import pl.smsapi.api.SmsFactory;
import pl.smsapi.api.action.sms.SMSSend;
import pl.smsapi.api.response.MessageResponse;
import pl.smsapi.api.response.StatusResponse;
import pl.smsapi.exception.ClientException;
import pl.smsapi.exception.SmsapiException;

@Service
public class SmsApiService {
    public void send(String phoneNo, String text) {
        try {
            OAuthClient client = new OAuthClient("c4zGv5c75reaXh9PrgVFavLqe0Q6lPc1a8pXOPr2");

            SmsFactory smsApi = new SmsFactory(client);
            String phoneNumber = phoneNo;
            SMSSend action = smsApi.actionSend()
                    .setText(text)
                    .setTo(phoneNumber);

            StatusResponse result = action.execute();

            for (MessageResponse status : result.getList() ) {
                System.out.println(status.getNumber() + " " + status.getStatus());
            }
        } catch (ClientException e) {
            /**
             * 101 Niepoprawne lub brak danych autoryzacji.
             * 102 Nieprawidłowy login lub hasło
             * 103 Brak punków dla tego użytkownika
             * 105 Błędny adres IP
             * 110 Usługa nie jest dostępna na danym koncie
             * 1000 Akcja dostępna tylko dla użytkownika głównego
             * 1001 Nieprawidłowa akcja
             */
            e.printStackTrace();
        } catch (SmsapiException e) {
            e.printStackTrace();
        }
    }
}
