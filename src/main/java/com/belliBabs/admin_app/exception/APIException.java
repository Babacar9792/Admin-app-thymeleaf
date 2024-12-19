package com.belliBabs.admin_app.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class APIException {
// Pour les exceptions liées aux api
    String message;
    HttpStatus httpStatus;
    LocalDateTime timestamp;


}
