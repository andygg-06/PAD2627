package com.app.pad2627.model

import kotlinx.serialization.Serializable


@Serializable
data class Plate(
    val name: String,
    val price: String,
    val flags: Set<DietType> = emptySet<DietType>(),
    val allergies: Set<Allergies> = emptySet<Allergies>(),
)
