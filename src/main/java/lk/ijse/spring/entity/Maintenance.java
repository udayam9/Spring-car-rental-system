package lk.ijse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;



@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
public class Maintenance {
    @Id
    private String maintenanceId;
    private LocalDate date;
    private LocalDate value;
    private String details;

    @ManyToOne
    @JoinColumn(name = "vehicleId", referencedColumnName = "vehicleId", nullable = false)
    private Vehicle vehicle;
}
