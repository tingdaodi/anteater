package com.pn.anteater.payment.controller;

/**
 * Description TODO
 *
 * @author Roye.L
 * @date 2019/1/6 22:05
 * @since 1.0
 */
public class User {
    private Long id;
    private String name;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

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
}
