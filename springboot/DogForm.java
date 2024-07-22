package com.LoversDogs.Lovers.entity;

import jakarta.persistence.*;
import lombok.*;



import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
//@AllArgsConstructor
@ToString
@Entity(name = "dog")

public class DogForm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 30)
    private String name;

    @Column(nullable = false, length = 30)
    private String age;

    @Column(nullable = false, length = 30)
    private String gender;

    @Column(nullable = false, length = 30)
    private String special;

    @Column(nullable = false, length = 100)
    private String vaccination;

    @Column(length = 30)
    private String neutered;

    @Column(length = 100)
    private String reason;

    @Column(length = 100)
    private String noticeNumber;

    @Column(length = 100)
    private String like;

    @Column(length = 100)
    private String dislikes;

    @ElementCollection
    @CollectionTable(name = "dog_images", joinColumns = @JoinColumn(name = "dog_id"))
    @Column(name = "image_url")
    private List<String> images;  //나중에 다시 수정해야될 것

//    @Temporal(TemporalType.TIMESTAMP)
//    private Date createTime;

    public String getName() {
        return name;
    }

    @Builder
    public DogForm(Long id, String name, String age, String gender, String special, String vaccination, String neutered, String reason, String noticeNumber, String like, String dislikes, List<String> images) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.special = special;
        this.vaccination = vaccination;
        this.neutered = neutered;
        this.reason = reason;
        this.noticeNumber = noticeNumber;
        this.like = like;
        this.dislikes = dislikes;
        this.images = images;
    }
}

