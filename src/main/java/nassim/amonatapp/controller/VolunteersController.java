package nassim.amonatapp.controller;

import nassim.amonatapp.ApiResponse;
import nassim.amonatapp.ApiResponseBool;
import nassim.amonatapp.AuthenticationRequest;
import nassim.amonatapp.model.Volunteers;
import nassim.amonatapp.repository.VolunteersRepository;
import nassim.amonatapp.service.VolunteersService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/volunteers")
public class VolunteersController {

    @Autowired
    private VolunteersRepository volunteerRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;



    @PostMapping("/authenticate")
    public Object authenticate(@RequestBody AuthenticationRequest request) {
        String login = request.getLogin();
        String clientPassword = request.getPassword();

        Volunteers volunteer = volunteerRepository.findByLogin(login);

        if (volunteer == null) {
            System.out.println("netu");
            ApiResponseBool response = new ApiResponseBool(false, "Not found", 0, "");
            return response;
        }

        String hashedDatabasePassword = volunteer.getPassword();
        Integer idVolunteer = volunteer.getId();
        String name_volunteer = volunteer.getName();
        String surname_volunteer = volunteer.getSurname();
        String phone_volunteer = volunteer.getPhone();
        String nameSurnameVolunteer = name_volunteer + " " + surname_volunteer;

        if (passwordEncoder.matches(clientPassword, hashedDatabasePassword)) {
            System.out.println("ok");
            ApiResponseBool response = new ApiResponseBool(true, nameSurnameVolunteer, idVolunteer, phone_volunteer);
            System.out.println(response.getNameSurname_volunteer() + "   " + response.getId_volunteer());
            return response;
        } else
        {
            System.out.println("NOok");
            System.out.println(clientPassword);
            System.out.println(hashedDatabasePassword);
            ApiResponseBool response = new ApiResponseBool(false, "Not found",0,"");
            return response;
        }
    }

    VolunteersService volunteersService;

    public VolunteersController(VolunteersService volunteersService) {
        this.volunteersService = volunteersService;
    }

    @PostMapping("/add")
    public ApiResponse createVolunteers(@RequestBody Volunteers volunteers) {

        String pass = volunteers.getPassword();
        String encoderPass = passwordEncoder.encode(pass);

        volunteers.setPassword(encoderPass);
        volunteersService.createVolunteers(volunteers);
        Integer id = volunteers.getId();
        ApiResponse response = new ApiResponse("Create volunteer successfully", id);
        return response;
    }
}
