package com.learning.restaurant.services;

import org.springframework.core.io.UrlResource;
import org.springframework.web.multipart.MultipartFile;

import java.util.Optional;


public interface StorageService {

    String store(MultipartFile file, String filename);  //store multipart file
    Optional<UrlResource> loadAsResource(String id); //upload that file as resource
}
