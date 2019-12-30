package com.java.hy.strategy.util.adapter;

public class CloudController {

    private CloudService cloudService;


    public CloudController(CloudService cloudService) {
        this.cloudService = cloudService;
    }

    public void storeFileToCloud(String fileName){
        cloudService.uploadFile(fileName);
    }

    public static void main(String[] args){
        CloudController cloudController = new CloudController(new CloudService(CloudFactory.getInstance("awssdk")));
        cloudController.storeFileToCloud("10.jpg");
    }
}
