/*
 * Copyright 2013 Ivan Zaytsev
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.shyiko.rook.target.hibernate.cache.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author <a href="mailto:ivan.zaytsev@webamg.com">Ivan Zaytsev</a>
 */
@Entity
@Table(name = "dummy_entity_2fpk")
public class DummyEntityTwoFieldPK implements Serializable{

    @Id
    @GeneratedValue
    @Column
    private Long id;

    @Column
    private String name;

    @Id
    @GeneratedValue
    @Column
    private Long id2;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId2() {
        return id2;
    }

    public void setId2(Long id2) {
        this.id2 = id2;
    }
}