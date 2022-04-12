package com.idolticketing.idolticketing.dto;

import lombok.Data;

import java.sql.Blob;
import java.util.Date;

@Data
public class ContentDTO {
    private int id;
    private String name;
    private long price;
    private Blob picture;
    private String description;
    private Date date;
    private String location;
    private String seat;
    private String category;
    private String userid;
    private Date createTime;
    private Date updateTime;
    private int popularity;
    private Date deadLine;

    public ContentDTO(){
    }

    public ContentDTO(int id, String name, long price, Blob picture, String description, Date date,String location,
                      String seat,String category,String userid,Date createTime,Date updateTime,int popularity, Date deadLine){
        this.id = id;
        this.name = name;
        this.price = price;
        this.picture = picture;
        this.description = description;
        this.date = date;
        this.location = location;
        this.seat = seat;
        this.category = category;
        this.userid = userid;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.popularity = popularity;
        this.deadLine = deadLine;

    }


}