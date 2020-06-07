package lk.ac.ucsc.forexservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import sun.tools.java.Environment;

@RestController
public class ForexController {

    @Autowired
    private Environment environment;

    @Autowired
    private ExchangeValueRepository repository;

@GetMapping("/currency-exchange/from/{from}/to/{to}")
    public void getExchangeValue(@PathVariable("from") String from, @PathVariable("to") String to) {
    ExchangeValue exchangeValue = repository.findByFromAndTo(from, to);
}
}
