package com.example.readwritefile.read;

import com.example.readwritefile.FileInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
@Qualifier("read")
public class ReadFile implements FileInterface {
    private final String currentDirectoryPath = System.getProperty("user.dir");

    private final Logger logger = LoggerFactory.getLogger(ReadFile.class);

    public String getCurrentDirectoryPath() {
        return currentDirectoryPath;
    }

    @Override
    public void processFile() {
        logger.info("inside directory: " + currentDirectoryPath);
        logger.info("... now reading file ...");
    }
}
