package com.colak.springjpatutorial.namingstrategy;

import org.hibernate.boot.model.naming.Identifier;
import org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl;
import org.hibernate.engine.jdbc.env.spi.JdbcEnvironment;

/**
 * A logical name can be explicitly defined using @Column or @Table annotations.
 * If not explicitly defined, Hibernate will use one of the implicit naming strategies.
 * The default implementation is to simply use the logical name as the physical name.
 * <p>
 * If we want to customize the physical names, we can create a custom PhysicalNamingStrategy class or extend Hibernate’s PhysicalNamingStrategyStandardImpl class.
 * <p>
 * This will cause a table name to have _Table suffix
 * For example create table Person_Table (id_column bigint not null, personName_column varchar(255), primary key (id_column))
 */
public class CustomSuffixPhysicalNamingStrategy extends PhysicalNamingStrategyStandardImpl {

    @Override
    public Identifier toPhysicalTableName(final Identifier identifier, final JdbcEnvironment jdbcEnv) {
        return getIdentifier(identifier, "_Table");
    }

    @Override
    public Identifier toPhysicalColumnName(Identifier identifier, JdbcEnvironment context) {
        return getIdentifier(identifier, "_column");
    }

    private Identifier getIdentifier(final Identifier identifier, final String suffix) {
        if (identifier == null) {
            return null;
        }

        final String newName = identifier.getText() + suffix;
        return Identifier.toIdentifier(newName);
    }
}
