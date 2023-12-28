package nassim.amonatapp.service.Impl;

import nassim.amonatapp.model.SmsNotificationsClient;
import nassim.amonatapp.repository.SmsNotificationsClientRepository;
import nassim.amonatapp.service.SmsNotificationsClientService;
import org.springframework.stereotype.Service;

@Service
public class SmsNotificationsClientServiceImpl implements SmsNotificationsClientService {

    SmsNotificationsClientRepository smsNotificationsClientRepository;

    public SmsNotificationsClientServiceImpl(SmsNotificationsClientRepository smsNotificationsClientRepository) {
        this.smsNotificationsClientRepository = smsNotificationsClientRepository;
    }

    @Override
    public void createSmsNotificationsClient(SmsNotificationsClient smsNotificationsClient) {
        smsNotificationsClientRepository.save(smsNotificationsClient);
    }
}