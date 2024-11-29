package estudospring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/pessoa")
public class PessoaController {

    @GetMapping
    public String getBook() {
        return "Teste Api";
    }
    

}
