package com.lianlian.osc.gateway.client.util;

import freemarker.template.Configuration;
import freemarker.template.Template;

import java.io.StringReader;
import java.io.StringWriter;


public class FltTemplateHolder {


    private static Configuration conf = new Configuration();

    static {
        conf.setOutputEncoding("UTF-8");
        conf.setDefaultEncoding("UTF-8");
    }

    public static String getParsedString(String templateNo, String templateContent, Object root) {
        StringWriter writer = new StringWriter();
        try {
            Template template = new Template(templateNo, new StringReader(templateContent), conf);
            template.process(root, writer);
            return writer.getBuffer().toString();
        } catch (Exception e) {
            //log.error("FltTemplateHolder.getParsedString error {},",e);

        } finally {
            try {
                writer.close();
            } catch (Exception e) {

            }
        }
        return templateContent;
    }
}
