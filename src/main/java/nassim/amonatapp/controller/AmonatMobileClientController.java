package nassim.amonatapp.controller;

import nassim.amonatapp.model.AmonatMobileClient;
import nassim.amonatapp.service.AmonatMobileClientService;
import nassim.amonatapp.ApiResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/amonatMobileClient")
public class AmonatMobileClientController {

    AmonatMobileClientService amonatMobileClientService;

    public AmonatMobileClientController(AmonatMobileClientService amonatMobileClientService) {
        this.amonatMobileClientService = amonatMobileClientService;
    }

    @PostMapping("/add")
    public ApiResponse createAmonatMobileClient(@RequestBody AmonatMobileClient amonatMobileClient) {
        amonatMobileClientService.createAmonatMobileClient(amonatMobileClient);
        Integer id = amonatMobileClient.getIdAmonatMobileClient();
        ApiResponse response = new ApiResponse("Create AmonatMobileClient successfully", id);
        return response;
    }

}
