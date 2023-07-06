package sk.pavlovsky.ecasenka.config;

import sk.pavlovsky.ecasenka.dto.TermDto;


import java.util.List;

public interface TermService {
    List<TermDto> getListOfTerms(int id);
}
