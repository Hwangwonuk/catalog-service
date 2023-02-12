/*
 * Created by Wonuk Hwang on 2023/02/12
 * As part of Bigin
 *
 * Copyright (C) Bigin (https://bigin.io/main) - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by infra Team <wonuk_hwang@bigin.io>, 2023/02/12
 */
package com.example.catalogservice.jpa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import org.hibernate.annotations.ColumnDefault;

/**
 * create on 2023/02/12. create by IntelliJ IDEA.
 *
 * <p> </p>
 * <p> {@link } and {@link } </p> *
 *
 * @author wonukHwang
 * @version 1.0
 * @see
 * @since (ex : 5 + 5)
 */
@Data
@Entity
@Table(name = "catalog")
public class CatalogEntity implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false, length = 120, unique = true)
  private String productId;

  @Column(nullable = false)
  private String productName;

  @Column(nullable = false)
  private Integer stock;

  @Column(nullable = false)
  private Integer unitPrice;

  @Column(nullable = false, updatable = false, insertable = false)
  @ColumnDefault(value = "CURRENT_TIMESTAMP")
  private Date createdAt;
}
