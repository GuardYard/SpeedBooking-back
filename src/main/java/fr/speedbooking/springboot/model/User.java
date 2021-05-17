package fr.speedbooking.springboot.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

import java.util.Set;

@Entity
public class User implements Serializable {
    @Id
    @GeneratedValue
    private Long idUser;

    @Column(name = "username")
    private String username;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "create_time")
    private Timestamp createTime;

    @Column(name = "genres")
    private String genres;

    @Column(name="languages")
    private String languages;

    @OneToMany(mappedBy="author", fetch=FetchType.EAGER)
    private Set<Book> books;

    @OneToMany(mappedBy = "idUser", fetch=FetchType.EAGER)
    private Set<UserBook> booksRead;

    public User() {
        this.createTime = new Timestamp(System.currentTimeMillis());
    }

    public User(String username, String email, String password, String genres, String languages,
                Set<Book> books, Set<UserBook> booksRead) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.createTime = new Timestamp(System.currentTimeMillis());
        this.genres = genres;
        this.languages = languages;
        this.books = books;
        this.booksRead = booksRead;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public Set<UserBook> getBooksRead() {
        return booksRead;
    }

    public void setBooksRead(Set<UserBook> booksRead) {
        this.booksRead = booksRead;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }
}
