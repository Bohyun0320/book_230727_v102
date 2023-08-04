package com.bhchoi.book_230727_v102.Domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name="category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="category_id")
    private Integer categoryId;

    @Column(name="category_content")
    private String categoryContent;

    @Builder
    public Category(Integer categoryId, String categoryContent) {
        this.categoryId = categoryId;
        this.categoryContent = categoryContent;
    }
}
