package org.visdomchina;

import org.jdbi.v3.core.Jdbi;

import java.util.List;

public class UserDao {

    public List<UserModel> list(Jdbi jdbi){
        return jdbi.withHandle(handle -> {
            return handle.createQuery("SELECT * FROM \"USER\" ORDER BY \"NAME\"")
                    .mapToBean(UserModel.class)
                    .list();
        });
    }

}
