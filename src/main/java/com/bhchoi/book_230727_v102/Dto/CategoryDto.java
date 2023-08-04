package com.bhchoi.book_230727_v102.Dto;

import com.bhchoi.book_230727_v102.Domain.Category;
import jakarta.persistence.Column;
import lombok.*;

@Getter @Setter
@ToString
@NoArgsConstructor
public class CategoryDto {

    private Integer categoryId;
    private String categoryContent;

    public Category toEntity(){
        Category build = Category.builder()
                .categoryId(categoryId)
                .categoryContent(categoryContent)
                .build();
        return build;
    }

    @Builder
    public CategoryDto(Integer categoryId, String categoryContent) {
        this.categoryId = categoryId;
        this.categoryContent = categoryContent;
    }
}
