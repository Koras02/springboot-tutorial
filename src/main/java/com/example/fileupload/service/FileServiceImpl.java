package com.example.fileupload.service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.springframework.stereotype.Service;

@Service
public class FileServiceImpl implements FileService {

    @Override
    public String createFile(String fileName, String content) {
        try {
            File file = new File(fileName);
            FileWriter writer = new FileWriter(file);
            writer.write(content);
            writer.close();
            return "File created: " + fileName;
        } catch (IOException e) {
            throw new RuntimeException("Error creating file: " + e.getMessage(), e);
        }
    }
}
