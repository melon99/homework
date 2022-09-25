package org.visdomchina;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.flywaydb.core.Flyway;


import static spark.Spark.get;
import static spark.Spark.post;

public class Main {
    public static void main(String[] args) {
        Flyway flyway = Flyway.configure().dataSource(Config.DB, "sa", "").load();
        flyway.migrate();

        UserService us = new UserService();
        ObjectMapper mapper = new ObjectMapper();
        get("/read", (req, res) -> mapper.writeValueAsString(us.listUsers()));
        post("/create", (req, res) -> "Hello World");
        post("/update", (req, res) -> "Hello World");
        post("/delete", (req, res) -> "Hello World");
    }
}