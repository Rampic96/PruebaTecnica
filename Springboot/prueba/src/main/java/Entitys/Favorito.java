package Entitys;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
public class Favorito {

    // Se crea la clase Favorito

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

    // Getters
    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getNewsSite() {
        return newsSite;
    }

    public String getSummary() {
        return summary;
    }

    public LocalDateTime getPublishedAt() {
        return publishedAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public Boolean getFeatured() {
        return featured;
    }

    public List<Launch> getLaunches() {
        return launches;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setNewsSite(String newsSite) {
        this.newsSite = newsSite;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setPublishedAt(LocalDateTime publishedAt) {
        this.publishedAt = publishedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void setFeatured(Boolean featured) {
        this.featured = featured;
    }

    public void setLaunches(List<Launch> launches) {
        this.launches = launches;
    }

}
