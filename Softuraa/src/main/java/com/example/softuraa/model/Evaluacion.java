
import com.example.softuraa.model.Cliente;
import com.example.softuraa.model.Psicologo;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
@Data
@Entity
@Table(name = "Evaluaciones")
public class Evaluacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long evaluacionID;

    @ManyToOne
    @JoinColumn(name = "psicologoID")
    private Psicologo psicologo;

    @ManyToOne
    @JoinColumn(name = "clienteID")
    private Cliente cliente;

    private int calificacion;

    private String comentarios;

    private LocalDateTime fechaHoraEvaluacion;

    // Constructor, getters y setters
}
