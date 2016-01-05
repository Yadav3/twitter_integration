package com.example.twittershare;

import java.io.*;
import java.net.*;
 
public class RemoteImage {
    
    public RemoteImage() { }
    
    public InputStream download(String url) {
        URL snapshotUri = null;
        InputStream inputStream = null;
        try {
            snapshotUri = new URL(url);
            inputStream = snapshotUri.openStream();
        } catch (Exception e) { }
        return inputStream;
    }
 
}
