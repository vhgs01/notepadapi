package br.com.victorhugo.notepadapi

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class NotepadapiApplication

fun main(args: Array<String>) {
    SpringApplication.run(NotepadapiApplication::class.java, *args)
}
