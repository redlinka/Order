package en.project.order.entities;

import java.util.EnumSet;

public interface Entity {

    String getName();
    EnumSet<? extends Type> getType();
    void takeDamage(int amount);
    boolean isActive();
    void destroy();
}
