package com.webgenerals.sm04.springboot5.custommetrics.web;

import com.webgenerals.sm04.springboot5.custommetrics.storage.DbStorageService;
import com.webgenerals.sm04.springboot5.custommetrics.storage.FileStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class StorageController {

    @Autowired
    private DbStorageService dbStorageService;
    @Autowired
    private FileStorageService fileStorageService;

    @PutMapping("db/storage")
    public int storeInDb(@RequestBody String content) {
        return dbStorageService.store(content);
    }

    @GetMapping("db/storage/{id}")
    public ResponseEntity<String> fetchFromDb(@PathVariable("id") int id) {
        return dbStorageService.fetch(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("file/storage")
    public int storeInFile(@RequestBody String content) {
        return fileStorageService.store(content);
    }

    @GetMapping("file/storage/{id}")
    public ResponseEntity<String> fetchFromFile(@PathVariable("id") int id) {
        return fileStorageService.fetch(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
