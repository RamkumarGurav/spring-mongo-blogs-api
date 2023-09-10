package com.ram.myblogsmongo.service;

import com.ram.myblogsmongo.collection.Photo;
import org.springframework.web.multipart.MultipartFile;

import javax.swing.text.Document;
import java.io.IOException;
import org.springframework.core.io.Resource;

public interface PhotoService {
    Photo uploadPhoto(String originalFilename, MultipartFile image) throws IOException;

    Photo downloadPhoto(String photoId);
}
