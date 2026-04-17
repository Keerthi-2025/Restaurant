package com.learning.restaurant.impl;


import com.learning.restaurant.domain.entities.Photo;
import com.learning.restaurant.services.PhotoService;
import com.learning.restaurant.services.StorageService;
import com.nimbusds.jose.util.Resource;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PhotoServiceImpl implements PhotoService {

    private  final StorageService storageService;
    @Override

    public Photo uploadPhoto(MultipartFile file) {
      String photoId =  UUID.randomUUID().toString();
        String url = storageService.store(file,photoId);

        return  Photo.builder()
                .url(url)
                .uploadDate(LocalDateTime.now())
                .build();
    }

    @Override
    public Optional<Resource> getPhotoAsResource(String id) {
        return Optional.empty();
    }
}
