package com.example.rest.favoritos.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@Data
@Table(name = "favorito")
public class Favorito {
    @Id
    private Long id;
    private String title;
    private String url;
    private String imageUrl;
    private String newsSite;
    private String summary;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
    private LocalDateTime publishedAt;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
    private LocalDateTime updatedAt;

    private Boolean featured;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Launch> launches;

    // Constructor vacío para JPA
    public Favorito() {
    }

    public Favorito(Long id, String title, String url, String imageUrl, String newsSite, String summary, LocalDateTime publishedAt, LocalDateTime updatedAt, Boolean featured, List<Launch> launches) {
        this.id = id;
        this.title = title;
        this.url = url;
        this.imageUrl = imageUrl;
        this.newsSite = newsSite;
        this.summary = summary;
        this.publishedAt = publishedAt;
        this.updatedAt = updatedAt;
        this.featured = featured;
        this.launches = launches;
    }
}
