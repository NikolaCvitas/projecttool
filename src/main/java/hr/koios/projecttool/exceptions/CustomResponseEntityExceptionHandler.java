package hr.koios.projecttool.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class CustomResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler
    public final ResponseEntity<Object> handleProjectIdException(hr.koios.projecttool.exceptions.ProjectIdException ex, WebRequest request){
        hr.koios.projecttool.exceptions.ProjectIdExceptionResponse response = new hr.koios.projecttool.exceptions.ProjectIdExceptionResponse(ex.getMessage());
        return new ResponseEntity(response, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler
    public final ResponseEntity<Object> handleProjectNotFoundException(hr.koios.projecttool.exceptions.ProjectNotFoundException ex, WebRequest request){
        hr.koios.projecttool.exceptions.ProjectNotFoundExceptionResponse response = new hr.koios.projecttool.exceptions.ProjectNotFoundExceptionResponse(ex.getMessage());
        return new ResponseEntity(response, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler
    public final ResponseEntity<Object> handleUsernameAlreadyExists(hr.koios.projecttool.exceptions.UsernameAlreadyExistsException ex, WebRequest request){
        hr.koios.projecttool.exceptions.UsernameAlreadyExistsResponse exceptionResponse = new hr.koios.projecttool.exceptions.UsernameAlreadyExistsResponse(ex.getMessage());
        return new ResponseEntity(exceptionResponse, HttpStatus.BAD_REQUEST);
    }
}
