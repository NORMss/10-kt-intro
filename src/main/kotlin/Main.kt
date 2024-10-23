package ru.normno

import ru.normno.data.NoteService
import java.lang.Thread.sleep

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val noteService = NoteService()

    println(noteService.getNote())

    sleep(1000L)

    noteService.updatedText("Hello, Note!")

    println(noteService.getNote())
}