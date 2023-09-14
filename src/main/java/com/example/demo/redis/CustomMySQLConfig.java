package com.example.demo.redis;

import org.hibernate.dialect.MySQL8Dialect;
import org.hibernate.dialect.function.StandardSQLFunction;
import org.hibernate.type.StandardBasicTypes;

public class CustomMySQLConfig extends MySQL8Dialect {
    public CustomMySQLConfig() {
        super();
        this.registerFunction("ST_Distance_Sphere",
                new StandardSQLFunction("ST_Distance_Sphere", StandardBasicTypes.DOUBLE));
    }
}
