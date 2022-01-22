package bugReport1;

import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import io.micronaut.data.annotation.MappedProperty;

@MappedEntity("entity")
public record Entity(
        @Id @MappedProperty("id") Long id) {
}
