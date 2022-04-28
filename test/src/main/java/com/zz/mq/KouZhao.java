package com.zz.mq;

public class KouZhao {
    private String id;
    private String type;

    public KouZhao(String id, String type) {
        this.id = id;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    @Override
    public String toString() {
        return "KouZhao{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
