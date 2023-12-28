package nassim.amonatapp.controller;


import nassim.amonatapp.ApiResponseBool;
import nassim.amonatapp.model.Photo;
import nassim.amonatapp.repository.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Controller
@RequestMapping("/upload")
public class PhotoUploadController {
    @Autowired
    private PhotoRepository photoRepository;

    @PostMapping("/photo")
    public ResponseEntity<String> uploadPhoto(
            @RequestParam MultipartFile file,
            @RequestParam int idAmonatMobileClient,
            @RequestParam int type
    ) {
        String fullPath = null;
        if (!file.isEmpty()) {
            try {
                String uniqueFileName = UUID.randomUUID() + "_" + file.getOriginalFilename();
                fullPath = "C:/Users/Husniddinkhuja/Desktop/imagesStorage/" + uniqueFileName;

                file.transferTo(new File(fullPath));

                Photo photo = new Photo();
                photo.setFilePath(fullPath);
                photo.setIdAmonatMobileClient(idAmonatMobileClient);
                photo.setType(type);
                photoRepository.save(photo);

                return ResponseEntity.status(HttpStatus.OK).body(fullPath);
            } catch (IOException e) {

                return ResponseEntity.status(HttpStatus.OK).body("Error!");
            }
        } else {

            return ResponseEntity.status(HttpStatus.OK).body("Empty!");
        }
    }
}
