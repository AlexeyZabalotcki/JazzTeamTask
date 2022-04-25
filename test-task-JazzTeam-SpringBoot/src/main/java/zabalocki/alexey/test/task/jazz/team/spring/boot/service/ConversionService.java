package zabalocki.alexey.test.task.jazz.team.spring.boot.service;

import com.ibm.icu.text.RuleBasedNumberFormat;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class ConversionService {
    private Long number;

    RuleBasedNumberFormat format = new RuleBasedNumberFormat(Locale.forLanguageTag("ru"),
            RuleBasedNumberFormat.SPELLOUT);

    public String conversionToString(Long number) {
        this.number = number;
        return format.format(number);
    }
}
