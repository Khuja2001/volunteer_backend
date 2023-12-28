package nassim.amonatapp.service.Impl;

import nassim.amonatapp.model.Volunteers;
import nassim.amonatapp.repository.VolunteersRepository;
import nassim.amonatapp.service.VolunteersService;
import org.springframework.stereotype.Service;

@Service
public class VolunteersServiceImpl implements VolunteersService {

    VolunteersRepository volunteersRepository;

    public VolunteersServiceImpl(VolunteersRepository volunteersRepository) {
        this.volunteersRepository = volunteersRepository;
    }

    @Override
    public void createVolunteers(Volunteers volunteers) {
        volunteersRepository.save(volunteers);
    }
}
