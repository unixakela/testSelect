package com.example.testselect.model;

public class SelectClass {
    private String id;
    private String name;
    private boolean selected;

    public SelectClass(String id, String name, boolean selected) {
        this.id = id;
        this.name = name;
        this.selected = selected;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    @Override
    public String toString() {
        return "SelectClass{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", selected=" + selected +
                '}';
    }
}
