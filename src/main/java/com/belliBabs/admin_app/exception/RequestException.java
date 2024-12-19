package com.belliBabs.admin_app.exception;

import lombok.*;
import org.springframework.http.HttpStatus;


@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class RequestException extends RuntimeException {

    String message;

    HttpStatus status;
}
