package com.java.hy.strategy.util.adapter;

public class AWSAdapter implements CloudSdk{

    private AWSSdk awsSdk;

    public AWSAdapter(AWSSdk awsSdk) {
        this.awsSdk = awsSdk;
    }

    @Override
    public void putObject(String fileName) {
        awsSdk.putObject(fileName);
    }
}
