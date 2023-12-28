package nassim.amonatapp.service.Impl;

import nassim.amonatapp.model.InternetBankingClient;
import nassim.amonatapp.repository.InternetBankingClientRepository;
import nassim.amonatapp.service.InternetBankingClientService;
import org.springframework.stereotype.Service;

@Service
public class InternetBankingClientServiceImpl implements InternetBankingClientService {

    InternetBankingClientRepository internetBankingClientRepository;

    public InternetBankingClientServiceImpl(InternetBankingClientRepository internetBankingClientRepository) {
        this.internetBankingClientRepository = internetBankingClientRepository;
    }

    @Override
    public void createInternetBankingClient(InternetBankingClient internetBankingClient) {
        internetBankingClientRepository.save(internetBankingClient);
    }
}
