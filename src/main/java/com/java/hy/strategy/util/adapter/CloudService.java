package com.java.hy.strategy.util.adapter;

public class CloudService {

    private CloudSdk cloudSdk;

    public CloudService(CloudSdk cloudSdk) {
        this.cloudSdk = cloudSdk;
    }

    public void uploadFile(String fileName){
        cloudSdk.putObject(fileName);
    }
}
