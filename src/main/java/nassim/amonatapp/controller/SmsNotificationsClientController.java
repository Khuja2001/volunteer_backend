package nassim.amonatapp.controller;


import nassim.amonatapp.ApiResponse;
import nassim.amonatapp.model.SmsNotificationsClient;
import nassim.amonatapp.service.SmsNotificationsClientService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/smsNotificationsClient")
public class SmsNotificationsClientController {

    SmsNotificationsClientService smsNotificationsClientService;
    public SmsNotificationsClientController(SmsNotificationsClientService smsNotificationsClientService){
        this.smsNotificationsClientService = smsNotificationsClientService;
    }

    @PostMapping("/add")
    public ApiResponse createSmsNotificationsClient(@RequestBody SmsNotificationsClient smsNotificationsClient) {
        smsNotificationsClientService.createSmsNotificationsClient(smsNotificationsClient);
        Integer id = smsNotificationsClient.getIdSmsNotificationsClient();
        ApiResponse response = new ApiResponse("Create SmsNotifications successfully", id);
        return response;
    }
}
