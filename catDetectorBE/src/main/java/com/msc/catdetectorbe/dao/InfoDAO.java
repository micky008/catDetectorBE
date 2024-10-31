package com.msc.catdetectorbe.dao;

import com.msc.catdetectorbe.v1.entity.Info;
import java.sql.Statement;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author Michael
 */
public class InfoDAO {

    public boolean insert(Info info) {
        Statement sql = SqlLite.instance.getStatement();
        String insert = "insert into infos (uuid,nom) values ('%UUID%','%NOM%');";
        UUID id = UUID.randomUUID();
        insert = insert.replace("%UUID%", id.toString());
        insert = insert.replace("%NOM%", e.nom);
        sql.execute(insert);
        sql.close();
        return true;
    }

    public List<Info> getInfos(Date timestart, int maxJours) {
        return null;
    }
}
