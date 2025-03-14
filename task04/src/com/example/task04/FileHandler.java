package com.example.task04;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandler implements MessageHandler {
    private final String Path;

     public FileHandler(String path) {
            Path = path;
        }

        @Override
        public void log(String message) {
            File file = new File(Path);
            @@ -21,4 +21,4 @@
                    System.out.println(ex.getMessage());
        }
    }
}