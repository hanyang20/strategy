package com.java.hy.strategy.util.adapter;

public class AliSdk {

    public void setBuket(){
        System.out.println("设置阿里云Buket");
    }

    public void uploadfile(String fileName){
        System.out.println("上传成功到阿里云,文件名称="+fileName);
    }
}
