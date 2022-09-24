package org.visdomchina;

import static spark.Spark.get;
import static spark.Spark.post;

public class Main {
    public static void main(String[] args) {
        get("/read", (req, res) -> "Hello World");
        post("/create", (req, res) -> "Hello World");
        post("/update", (req, res) -> "Hello World");
        post("/delete", (req, res) -> "Hello World");
    }
}