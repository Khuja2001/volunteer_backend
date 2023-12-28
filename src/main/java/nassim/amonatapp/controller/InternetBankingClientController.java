package nassim.amonatapp.controller;

        import nassim.amonatapp.ApiResponse;
        import nassim.amonatapp.model.InternetBankingClient;
        import nassim.amonatapp.service.InternetBankingClientService;
        import org.springframework.web.bind.annotation.PostMapping;
        import org.springframework.web.bind.annotation.RequestBody;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/internetBankingClient")
public class InternetBankingClientController {

    InternetBankingClientService internetBankingClientService;

    public InternetBankingClientController(InternetBankingClientService internetBankingClientService) {
        this.internetBankingClientService = internetBankingClientService;
    }

    @PostMapping("/add")
    public ApiResponse createInternetBankingClient(@RequestBody InternetBankingClient internetBankingClient) {
        internetBankingClientService.createInternetBankingClient(internetBankingClient);
        Integer id = internetBankingClient.getIdIBClient();
        ApiResponse response = new ApiResponse("Create InternetBankingClient successfully", id);
        return response;
    }
}
