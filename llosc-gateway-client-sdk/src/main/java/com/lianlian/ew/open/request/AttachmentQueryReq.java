/**
 *
 */
package com.lianlian.ew.open.request;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * request parameter of 'Get list of attachments'.
 *
 * @author xujs002
 *
 */
@Getter
@Setter
public class AttachmentQueryReq extends BaseOpenApiQueryReq {

    private static final long serialVersionUID = -962262887923973579L;


    /** User naming the file when uploading. require exact match */
    private String title;

    /** Attachment ID */
    private String attachmentId;

    /** Attachment object creation period start time. */
    private Date startingAfter;

    /** Attachment object creation period end time. */
    private Date endingBefore;

    /** An attachment name in the server. require exact match */
    private String name;


    @Override
    public String toString() {
        return "AttachmentQueryReq{" +
                "title='" + title + '\'' +
                ", attachmentId='" + attachmentId + '\'' +
                ", startingAfter=" + startingAfter +
                ", endingBefore=" + endingBefore +
                ", name='" + name + '\'' +
                "} " + super.toString();
    }
}
