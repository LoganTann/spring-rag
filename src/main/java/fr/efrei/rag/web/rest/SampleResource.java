package fr.efrei.rag.web.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import fr.efrei.rag.domain.dto.ValueDTO;

@RestController
public class SampleResource {

    @GetMapping("/samples/{value}")
    public String hello(@PathVariable(value = "value", required = false) final String value){
        return "Hello " + value + "!";
    }
    @GetMapping("/samples/dto/{value}")
    public  ResponseEntity<ValueDTO> helloJSON(@PathVariable(value = "value", required = false) final String value){
        var result = new ValueDTO("Hello " + value + "!");
        return ResponseEntity.ok().body(result);
    }
}