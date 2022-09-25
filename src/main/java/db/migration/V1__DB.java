package db.migration;

import org.flywaydb.core.api.migration.BaseJavaMigration;
import org.flywaydb.core.api.migration.Context;

import java.sql.Statement;

public class V1__DB extends BaseJavaMigration {
    public void migrate(Context context) throws Exception {
        try (Statement create = context.getConnection().createStatement()) {
            create.execute("CREATE TABLE \"PRODUCT\"(ID INT PRIMARY KEY, NAME VARCHAR(255) DEFAULT 'TEST' NOT NULL)");
        }
    }
}
