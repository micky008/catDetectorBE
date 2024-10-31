package com.msc.catdetectorbe.v1.entity;

import java.util.Date;

/**
 *
 * @author Michael
 */
public class Info {

    public enum TYPE {
        CAT, HALF_CLEAN, FULL_CLEAN
    }

    public Date date;
    public TYPE type;
    public int seconds;

}
