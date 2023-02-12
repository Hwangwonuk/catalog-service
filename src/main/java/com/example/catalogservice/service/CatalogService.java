/*
 * Created by Wonuk Hwang on 2023/02/12
 * As part of Bigin
 *
 * Copyright (C) Bigin (https://bigin.io/main) - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by infra Team <wonuk_hwang@bigin.io>, 2023/02/12
 */
package com.example.catalogservice.service;

import com.example.catalogservice.jpa.CatalogEntity;

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
public interface CatalogService {

  Iterable<CatalogEntity> getAllCatalogs();
}
