package com.jspackers.backend.controller;

import com.jspackers.backend.model.ContactForm;
import com.jspackers.backend.service.ContactFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/contact")
public class ContactController {
 
    @Autowired
    private ContactFormService contactFormService;

    @PostMapping
    public ContactForm submitContactForm(@RequestBody ContactForm contactForm) {
        return contactFormService.saveContactForm(contactForm);
    }
}
