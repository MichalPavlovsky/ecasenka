package sk.pavlovsky.ecasenka.terms;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TermRequestBody {
    private String time;
    private String date;
    private int idDoctor;
    private int idPatient;

}
