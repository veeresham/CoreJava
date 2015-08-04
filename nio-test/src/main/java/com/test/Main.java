package com.test;

import java.awt.image.SampleModel;
import java.io.IOException;
import java.net.URI;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.HashMap;
import java.util.Map;

public class Main
{

    public static void main(String[] args) throws Exception
    {
        Map<String, String> zip_properties = new HashMap<>(); 
        zip_properties.put("create", "true");
        zip_properties.put("encoding", "UTF-8"); 
        
        String directory = "/Users/kveeresham/Documents/TechWork/nio";
        
        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(Paths.get(directory))) {
            for (Path path : directoryStream) {
                
                if(Files.isDirectory(path))
                    continue;
                
                System.out.println(path);
                System.out.println(path.getFileName());
                
//                URI zip_disk = URI.create("jar:file:"+path+".zip");
                
                URI zip_disk = URI.create("jar:file:/Users/kveeresham/Documents/TechWork/nio/archive/"+path.getFileName()+".zip");
                try (FileSystem zipfs = FileSystems.newFileSystem(zip_disk, zip_properties)) {
                    
                    Path inZip = zipfs.getPath(path.getFileName()+"");          
                    /* Add file to archive */
                    Files.copy(path,inZip, new StandardCopyOption[]{StandardCopyOption.COPY_ATTRIBUTES, StandardCopyOption.REPLACE_EXISTING}); 
                    Files.deleteIfExists(path);
                } 
            }
        } catch (IOException ex) {}

        /* Locate File on disk for creation */
        
        /* Create ZIP file System */
        
    }

}
