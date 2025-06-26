package com.jspackers.backend.service;

import com.jspackers.backend.model.ContactForm;
import com.jspackers.backend.repository.ContactFormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactFormService {

    @Autowired
    private ContactFormRepository contactFormRepository;

    public ContactForm saveContactForm(ContactForm contactForm) {
        return contactFormRepository.save(contactForm);
    }
}
