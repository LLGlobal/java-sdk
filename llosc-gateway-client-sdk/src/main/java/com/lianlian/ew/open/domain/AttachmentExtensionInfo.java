package com.lianlian.ew.open.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * Attachement Extension Info
 *
 * @author xujs002
 */
@Getter
@Setter
@ToString
public class AttachmentExtensionInfo implements Serializable {


    /**
     * notes for attachement
     */
    @Size(max = 128, message = "notes value is too long (limit: 128 characters).")
    private String notes;

    /**
     * title for attachement
     */
    @Size(max = 128, message = "title value is too long (limit: 128 characters).")
    private String title;// 标题

    public AttachmentExtensionInfo() {
    }

    public AttachmentExtensionInfo(String notes, String title) {
        this.notes = notes;
        this.title = title;
    }
}
