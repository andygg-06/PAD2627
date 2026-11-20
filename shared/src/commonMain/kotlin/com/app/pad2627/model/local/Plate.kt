package com.app.pad2627.model.local

import com.app.pad2627.model.enums.Allergies
import com.app.pad2627.model.enums.DietType
import kotlinx.serialization.Serializable

/* DATA CLASS PLATE: contiene la información de un plato
    - id del plato
    - Información del plato: precio, alérgenos ...
 */

@Serializable
data class Plate(
//    var id: String, // identificador único
    val name: String,
    val price: String,
    val flags: Set<DietType> = emptySet<DietType>(),
    val allergies: Set<Allergies> = emptySet(),
)