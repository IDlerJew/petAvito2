package com.example.pet.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="images")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="originalFileName")
    private String originalFileName;
    @Column(name="size")
    private Long size;
    @Column(name="contentType")
    private  String contentType;
    @Column(name="isPreviewImage")
    private boolean isPreviewImage;
    @Lob
    @Column(name = "bytes", columnDefinition = "longblob")
    private byte[] bytes;
    @ManyToOne(cascade = CascadeType.REFRESH,fetch = FetchType.EAGER)
    private Product product;
}
