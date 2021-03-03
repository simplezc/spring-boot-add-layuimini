package com.yanzhen.entity;

public class Tree {
    private Integer id;
    private String name;
    private Integer pId;
    private boolean isParent;
    private  boolean open;

    public Tree() {
    }

    public Tree(Integer id, String name, Integer pId, boolean isParent, boolean open) {
        this.id = id;
        this.name = name;
        this.pId = pId;
        this.isParent = isParent;
        this.open = open;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public boolean isParent() {
        return isParent;
    }

    public void setParent(boolean parent) {
        isParent = parent;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }
}
