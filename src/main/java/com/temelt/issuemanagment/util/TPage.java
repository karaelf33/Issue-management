package com.temelt.issuemanagment.util;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

import java.util.List;

public class TPage<T> {
    private int number;
    private int size;
    private Sort sort;
    private int totalPages;
    private Long totalElements;
    private List<T> content;

    public void setStat(Page page, List<T> list) {

        this.number = page.getNumber();
        this.size = page.getSize();
        this.sort = page.getSort();
        this.totalPages = page.getTotalPages();
        this.totalElements = page.getTotalElements();
        this.content=list;

    }

}
