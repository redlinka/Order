package en.project.order.entities.creature;

import java.util.Objects;

public record CreatureId(String value) {
    public CreatureId {
        Objects.requireNonNull(value);
    }
}

