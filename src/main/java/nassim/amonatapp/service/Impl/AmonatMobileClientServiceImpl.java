package nassim.amonatapp.service.Impl;

import nassim.amonatapp.model.AmonatMobileClient;
import nassim.amonatapp.repository.AmonatMobileClientRepository;
import nassim.amonatapp.service.AmonatMobileClientService;
import org.springframework.stereotype.Service;

@Service
public class AmonatMobileClientServiceImpl implements AmonatMobileClientService {

    AmonatMobileClientRepository amonatMobileClientRepository;

    public AmonatMobileClientServiceImpl(AmonatMobileClientRepository amonatMobileClientRepository){
        this.amonatMobileClientRepository = amonatMobileClientRepository;
    }

    @Override
    public void createAmonatMobileClient(AmonatMobileClient amonatMobileClient) {
        amonatMobileClientRepository.save(amonatMobileClient);
    }
}