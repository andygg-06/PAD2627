package com.app.pad2627.model

import kotlinx.serialization.Serializable

/*  DATA CLASS GEOLOCATION: contiene la información para ubicación de un punto
    - Coordenadas: latitud y longitud
    - Texto descriptivo de la ubicación
 */

@Serializable
data class Geolocation(
    val lat: Double,
    val lon: Double,
    val dirText: String? = null,
)