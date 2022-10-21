package com.designpatterns.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ApiDesignPatterns {

    @Operation(summary = "Application Verion")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successful Operation",
                    content = {@Content(mediaType = "application/json")}),
            @ApiResponse(responseCode = "400", description = "Invalid parameters supplied",
                    content = @Content),
            @ApiResponse(responseCode = "500", description = "Internal Error",
                    content = @Content)})
    @GetMapping(path = "version")
    @ResponseBody
    public Map<String, String> version() {
        Map<String, String> response = new HashMap<>();
        response.put("version", "1.0");
        response.put("message", "design patterns by gabrieu3");
        return response;
    }

    @Operation(summary = "Application Home")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successful Operation",
                    content = {@Content(mediaType = "application/json")}),
            @ApiResponse(responseCode = "400", description = "Invalid parameters supplied",
                    content = @Content)})
    @GetMapping
    @ResponseBody
    public String home() {
        return "Hello Human!";
    }
}
