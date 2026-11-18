package com.app.pad2627.model.user

import com.app.pad2627.model.Allergies
import com.app.pad2627.model.DietType
import kotlinx.serialization.Serializable

/*  DATA CLASS HEALTHPROFILE: contiene la información de salud del usuario
    - Tipo de dieta
    - Lista de alergias (sin repetición)
 */

@Serializable
data class HealthProfile(
    val diet: DietType = DietType.NONE,
    val allergies: Set<Allergies> = emptySet()
)
