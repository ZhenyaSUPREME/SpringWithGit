package com.example.demo.model

import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Nitro(var id:String,var name:String,var speed:Int)