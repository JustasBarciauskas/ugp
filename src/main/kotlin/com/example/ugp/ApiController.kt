package com.example.ugp

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api")
class ApiController {

    @GetMapping
    fun testapi(): String {
        return "Success"
    }
}