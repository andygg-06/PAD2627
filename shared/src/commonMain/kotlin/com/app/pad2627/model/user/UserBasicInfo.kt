package com.app.pad2627.model.user

import kotlinx.serialization.Serializable

/*  DATA CLASS USERBASICINFO: contiene los datos básicos del usuario.
    - Información personal
    - Nombre de usuario
    - Información biográfica
 */

@Serializable
data class UserBasicInfo(
    val name: String,
    val surname: String,
    val birthDate: Long, // tipo fecha
    val age: Int, // se calcula automáticamente (investigar)

    val username: String,

    val photoURL: String? = null,
    val bio: String = "", // máximo 100 caracteres
    val university: String? = null,
    val job: String? = null,
    val lifeStyle: String? = null,
    val ubi: Geolocation? = null,
)