package org.visdomchina;

import org.jdbi.v3.core.Jdbi;

import java.util.List;


public class UserService {

    Jdbi jdbi = Jdbi.create(Config.DB, "sa","");
    UserDao ud = new UserDao();

    List<UserModel> listUsers() throws Exception{
        List<UserModel> a = ud.list(jdbi);
        return a;
    }


}
