package nassim.amonatapp.service.Impl;

        import nassim.amonatapp.model.InternetBankingClient;
        import nassim.amonatapp.model.PosClient;
        import nassim.amonatapp.repository.PosClientRepository;
        import nassim.amonatapp.service.PosClientService;
        import org.springframework.stereotype.Service;

@Service
public class PosClientServiceImpl implements PosClientService {

    PosClientRepository posClientRepository;

    public PosClientServiceImpl(PosClientRepository posClientRepository) {
        this.posClientRepository = posClientRepository;
    }

    @Override
    public void createPosClient(PosClient posClient) {
        posClientRepository.save(posClient);
    }
}
