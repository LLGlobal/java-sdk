package com.lianlian.ew.open.response;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class FileContent implements Serializable {

    /**
     * attachment file name
     */
    private String name;

    /**
     * attachment file content
     */
    private byte[] content;

    public FileContent() {
    }

    public FileContent(String name, byte[] content) {
        this.name = name;
        this.content = content;
    }

    @Override
    public String toString() {
        return "AttachmentContent{" +
                "name='" + name + '\'' +
                ", content=" + (content == null ? "null" : "<<file stream>>") +
                '}';
    }
}
