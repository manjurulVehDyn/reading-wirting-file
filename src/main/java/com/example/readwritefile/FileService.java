package com.example.readwritefile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;

@Service
public class FileService {

    @Autowired
    @Qualifier("read")
    FileInterface fileInterface;

    public void testFile() throws FileNotFoundException {
        fileInterface.processFile();
    }
}
