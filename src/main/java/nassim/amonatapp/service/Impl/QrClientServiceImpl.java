package nassim.amonatapp.service.Impl;

        import nassim.amonatapp.model.QrClient;
        import nassim.amonatapp.repository.QrClientRepository;
        import nassim.amonatapp.service.QrClientService;
        import org.springframework.stereotype.Service;

@Service
public class QrClientServiceImpl implements QrClientService {

    QrClientRepository qrClientRepository;

    public QrClientServiceImpl(QrClientRepository qrClientRepository) {
        this.qrClientRepository = qrClientRepository;
    }

    @Override
    public void createQrClient(QrClient qrClient) {
        qrClientRepository.save(qrClient);
    }
}
