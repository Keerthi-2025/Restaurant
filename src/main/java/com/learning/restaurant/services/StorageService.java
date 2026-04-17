package com.learning.restaurant.services;

import com.nimbusds.jose.util.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.util.Optional;


public interface StorageService {

    String store(MultipartFile file, String filename);  //store multipart file
    Optional<Resource> loadAsResource(String id); //upload that file as resource
}
