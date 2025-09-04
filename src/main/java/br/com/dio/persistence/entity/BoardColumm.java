package br.com.dio.persistence.entity;


import lombok.Data;

@Data
public class BoardColumm {

    private Long id;
    private String name;
    private int order;
    private BoardColummKindEnum kind;
}
