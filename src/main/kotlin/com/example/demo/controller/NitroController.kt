package com.example.demo.controller

import com.example.demo.model.Nitro
import com.example.demo.repository.NitroRepository
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/api/nitro")
class NitroController(var nitroRepository: NitroRepository){
    @GetMapping
    fun getAll(): Flux<Nitro>{
        return nitroRepository.findAll()
    }
        @GetMapping("/{id}")
        fun getOneId(@PathVariable id:String):Mono<Nitro>{
            return nitroRepository.findById(id)
        }

    @PostMapping
    fun createOneList(@RequestBody nitro: Nitro): Mono<Nitro> {
        return nitroRepository.save(nitro)
    }
}
