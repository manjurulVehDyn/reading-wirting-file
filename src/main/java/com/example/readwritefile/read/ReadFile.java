package com.example.readwritefile.read;

import com.example.readwritefile.FileInterface;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


@Component
@Qualifier("read")
public class ReadFile implements FileInterface {
    private final String currentDirectoryPath = System.getProperty("user.dir");
    private final String directoryName = "input";
    private final String fileName = "file.txt";
    private final String inputFileNameWithPath = currentDirectoryPath
            + System.getProperty("file.separator")
            + directoryName
            + System.getProperty("file.separator")
            + fileName;
    File inputFile = new File(inputFileNameWithPath);
    private final Logger logger = LoggerFactory.getLogger(ReadFile.class);

    public String getCurrentDirectoryPath() {
        return currentDirectoryPath;
    }

    @Override
    public void processFile() throws FileNotFoundException {
        logger.info("inside directory: " + currentDirectoryPath);
        logger.info("... now reading file ...");
//        DateFormat dateFormat = new SimpleDateFormat("hh:mm");
//        LocalTime localTime;
//        DateTimeFormatter dateTimeFormatter;
        Scanner scanner = new Scanner(inputFile);
        while (scanner.hasNextLine()) {
            String nextLine = scanner.nextLine();
            logger.info(nextLine);
            try {
                logger.info(LocalTime.parse(nextLine).toString());
            } catch (IllegalArgumentException ignored) {

            }

//            org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime();
//            LocalTime.parse(nextLine).format(DateTimeFormatter.ofPattern("HH:mm"));
//            logger.info(LocalTime.parse(nextLine).toString());
//            DateTimeFormatter dateTimeFormatter1 = String.format(nextLine, )
//            DateTimeFormatter.perseLocalTime)

        }
    }
}
