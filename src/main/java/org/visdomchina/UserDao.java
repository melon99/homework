package org.visdomchina;

import freemarker.template.Configuration;
import freemarker.template.Template;
import org.jdbi.v3.core.Jdbi;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class UserDao {

    public List<UserModel> list(Jdbi jdbi) throws Exception{
        Configuration cfg = new Configuration(Configuration.getVersion());
        cfg.setDirectoryForTemplateLoading(new File("./src/main/resources/"));
        Template tmp = cfg.getTemplate("listUsers.sql.ftl");
        return jdbi.withHandle(handle -> {
            return handle.createQuery(tmp.toString())
                    .mapToBean(UserModel.class)
                    .list();
        });
    }

}
