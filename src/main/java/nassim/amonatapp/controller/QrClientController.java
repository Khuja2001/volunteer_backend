package nassim.amonatapp.controller;

        import nassim.amonatapp.ApiResponse;
        import nassim.amonatapp.model.QrClient;
        import nassim.amonatapp.service.QrClientService;
        import org.springframework.web.bind.annotation.PostMapping;
        import org.springframework.web.bind.annotation.RequestBody;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/qrClient")
public class QrClientController {

    QrClientService qrClientService;

    public QrClientController(QrClientService qrClientService) {
        this.qrClientService = qrClientService;
    }

    @PostMapping("/add")
    public ApiResponse createQrClient(@RequestBody QrClient qrClient) {
        qrClientService.createQrClient(qrClient);
        Integer id = qrClient.getIdQrClient();
        ApiResponse response = new ApiResponse("Create QrClient successfully", id);
        return response;
    }
}
