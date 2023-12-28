package nassim.amonatapp.controller;

        import nassim.amonatapp.ApiResponse;
        import nassim.amonatapp.model.PosClient;
        import nassim.amonatapp.service.PosClientService;
        import org.springframework.web.bind.annotation.PostMapping;
        import org.springframework.web.bind.annotation.RequestBody;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posClient")
public class PosClientController {

    PosClientService posClientService;

    public PosClientController(PosClientService posClientService) {
        this.posClientService = posClientService;
    }

    @PostMapping("/add")
    public ApiResponse createPosClient(@RequestBody PosClient posClient) {
        posClientService.createPosClient(posClient);
        Integer id = posClient.getIdPosClient();
        ApiResponse response = new ApiResponse("Create PosClient successfully", id);
        return response;
    }
}
