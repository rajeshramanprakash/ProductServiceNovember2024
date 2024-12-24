package com.ecommerce.productservicenovember2024.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class Base {
    private long id;
    private Date created_at;
    private Date updated_at;

}
