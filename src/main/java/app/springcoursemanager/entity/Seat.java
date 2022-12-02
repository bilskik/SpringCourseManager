package app.springcoursemanager.entity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

@AttributeOverrides({
        @AttributeOverride(
                name = "seat_number",
                column = @Column(name = "seatNumber")
        ),
        @AttributeOverride(
                name = "seat_position",
                column = @Column(name = "seatPosition")
        )
}
)
public class Seat {

    private Integer seatNumber;
    private String seatPosition;

}
