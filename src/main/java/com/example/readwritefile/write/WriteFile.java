package com.example.readwritefile.write;

import com.example.readwritefile.FileInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("write")
public class WriteFile implements FileInterface {

    public Logger logger = LoggerFactory.getLogger(WriteFile.class);

    @Override
    public void processFile() {
        logger.info("... now writing file ...");
    }
}
