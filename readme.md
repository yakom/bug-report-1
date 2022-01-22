this is a demonstration of what seems to be a bug in the `micronaut-jdbc-dbcp` module.

project creation command: `mn create-cli-app -i --jdk=17 -l=java -t=junit -b=maven -f=data-jdbc,jdbc-dbcp bugReport1`

command to expose the bug: `mvn test`

the test passes, but context destruction throws:

`Error destroying bean of type [class io.micronaut.configuration.jdbc.dbcp.DatasourceConfiguration]: class io.micronaut.transaction.jdbc.TransactionAwareDataSource$DataSourceProxy cannot be cast to class io.micronaut.configuration.jdbc.dbcp.DatasourceConfiguration`

the newest `micronaut-data-jdbc` available as of now pulls in micronaut SQL libraries at version `4.0.0-RC4`, but even upgrading them to the newest, `4.1.1`, doesn't help.
