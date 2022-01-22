package bugReport1;

import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.repository.reactive.ReactorCrudRepository;

import static io.micronaut.data.model.query.builder.sql.Dialect.H2;

@JdbcRepository(dialect = H2)
public interface EntityRepository
        extends ReactorCrudRepository<Entity, Long> {
}
