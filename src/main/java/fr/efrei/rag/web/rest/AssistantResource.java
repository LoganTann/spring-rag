package fr.efrei.rag.web.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.efrei.rag.service.AssistantAIService;

@RestController
public class AssistantResource {
    private final AssistantAIService assistantService;

    AssistantResource(AssistantAIService assistantService) {
        this.assistantService = assistantService;
    }

    @PostMapping("/assistants/chat")
    public String chat(@RequestBody String query){
        return assistantService.chat(query);
    }
}