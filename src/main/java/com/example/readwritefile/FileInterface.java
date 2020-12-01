package com.example.readwritefile;

import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;

public interface FileInterface {
    void processFile() throws FileNotFoundException;
}
