package com.jspackers.backend.repository;

import com.jspackers.backend.model.ContactForm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactFormRepository extends JpaRepository<ContactForm, Long> {
    // No code needed — JPA gives basic methods like save(), findAll(), deleteById(), etc.
}
