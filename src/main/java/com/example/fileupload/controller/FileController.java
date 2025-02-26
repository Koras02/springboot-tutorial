package com.example.fileupload.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.fileupload.service.FileService;

@RestController
@RequestMapping("/api/files")
public class FileController {

    private final FileService fileService;

    @Autowired
    public FileController(@Qualifier("fileServiceImpl") FileService fileService) {
        this.fileService = fileService;
    }

    @PostMapping("/constructor")
    public String createFileWithConstructor(@RequestParam String fileName, @RequestParam String content) {
        return fileService.createFile(fileName, content);
    }
}
