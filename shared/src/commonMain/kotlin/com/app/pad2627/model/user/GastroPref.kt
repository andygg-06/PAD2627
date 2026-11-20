package com.app.pad2627.model.user

import com.app.pad2627.model.enums.BudgetRange
import com.app.pad2627.model.enums.CuisineType
import com.app.pad2627.model.enums.LocalType
import kotlinx.serialization.Serializable


/*  DATA CLASS GASTROPREF: contiene las preferencias gastronómicas del usuario
    - Rango de presupuesto
    - Tipos de locales (lista sin repeticiones)
    - Tipo de cocinas favoritas (lista sin repetición)
 */

@Serializable
data class GastroPref(
    val budgetRange: BudgetRange = BudgetRange.ECONOMIC,
    val localType: LocalType = LocalType.BAR,
    val favCuisine: Set<CuisineType> = emptySet()
)