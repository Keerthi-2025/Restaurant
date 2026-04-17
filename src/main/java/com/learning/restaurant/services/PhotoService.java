package com.learning.restaurant.services;


//upload and retreive photo

import com.learning.restaurant.domain.entities.Photo;
import com.nimbusds.jose.util.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.util.Optional;


public interface PhotoService {
    Photo uploadPhoto(MultipartFile file);
    Optional<Resource> getPhotoAsResource(String id);

}
