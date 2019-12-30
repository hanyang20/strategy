package com.java.hy.strategy.util.adapter;

public class AliAdapter implements CloudSdk{

    private AliSdk aliSdk;

    public AliAdapter(AliSdk aliSdk) {
        this.aliSdk = aliSdk;
    }

    @Override
    public void putObject(String fileName) {
        aliSdk.setBuket();
        aliSdk.uploadfile(fileName);
    }
}
