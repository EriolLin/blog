package com.eriol.blog.business.dto.SortsDto;

import java.util.ArrayList;
import java.util.List;

public class Option {
    private String value;
    private String label;
    private List<Option> children;

    public Option() {
        children = new ArrayList<>();
    }

    public Option(String value, String label) {
        this.value = value;
        this.label = label;
        children = new ArrayList<>();
    }

    public Option(String value, String label, List<Option> children) {
        this.value = value;
        this.label = label;
        this.children = children;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<Option> getChildren() {
        return children;
    }

    public void setChildren(List<Option> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Option{" +
                "value='" + value + '\'' +
                ", label='" + label + '\'' +
                ", children=" + children +
                '}';
    }
}
