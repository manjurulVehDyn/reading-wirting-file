package com.example.readwritefile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class FileService {

    @Autowired
    @Qualifier("write")
    FileInterface fileInterface;

    public void testFile() {
        fileInterface.processFile();
    }
}
