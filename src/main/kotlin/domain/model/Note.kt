package ru.normno.domain.model

import java.time.Instant

data class Note(
    val text: String,
    val createdAt: Instant,
    val updateAt: Instant,
)
