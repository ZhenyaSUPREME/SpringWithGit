package com.example.demo.repository

import com.example.demo.model.Nitro
import org.springframework.data.mongodb.repository.ReactiveMongoRepository

interface NitroRepository:ReactiveMongoRepository<Nitro,String>