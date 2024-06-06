package zoomanagementsystem.models;

import java.text.MessageFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Guinea extends AbstractAnimal implements CanBeGroomed, SmallAnimal {
    private LocalDateTime lastGroomed;

    public Guinea(LocalDate dateOfBirth) {
        super(dateOfBirth);
    }

    @Override
    public void groom() {
        this.lastGroomed = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return MessageFormat.format("{0}; Last Groomed {1}", super.toString(), lastGroomed);
    }
}