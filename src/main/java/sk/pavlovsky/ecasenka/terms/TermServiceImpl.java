package sk.pavlovsky.ecasenka.terms;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sk.pavlovsky.ecasenka.config.TermService;
import sk.pavlovsky.ecasenka.dto.TermDto;
import sk.pavlovsky.ecasenka.modul.Term;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TermServiceImpl implements TermService{
    private final RepoForTerm repoForTerm;
    @Override
    public List<TermDto> getListOfTerms(int id) {
        List<Term> terms = repoForTerm.findByDoctorId(id);
        List<TermDto> termDtos= new ArrayList<>();
        for (Term term:terms) {
            TermDto termDto = TermDto.builder()
                    .date(term.getDate())
                    .time(term.getTime()).build();
            termDtos.add(termDto);
        }
        return termDtos;
    }
}
