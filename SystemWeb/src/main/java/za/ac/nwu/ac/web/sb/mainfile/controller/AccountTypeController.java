package za.ac.nwu.ac.web.sb.mainfile.controller;

import io.swagger.models.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.nwu.ac.domain.service.GeneralResponse;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("RestServiceApplication")

public class AccountTypeController {
    @GetMapping("/all")
    @ApiOperation(value = "gets all configured account types", notes = "returns a list of all account types")
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Account types returned", response = GeneralResponse.class),
        @ApiResponse(code = 400, message = "Bad Request", response = GeneralResponse.class),
        @ApiResponse(code = 404, message = "Not Found", response = GeneralResponse.class),
            @ApiResponse(code = 500, message = "Internal Service Error", response = GeneralResponse.class)
    })

   //public GeneralResponse<String> getall(){return  new GeneralResponse<String>(getall().isSuccesful(), getall().getPayload());};
    public ResponseEntity<GeneralResponse<String>>getall() {
        GeneralResponse<String> response = new GeneralResponse<String>(true, "true");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
