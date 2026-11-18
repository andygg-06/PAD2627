package com.app.pad2627.model.user

import com.app.pad2627.model.Rol
import kotlinx.serialization.Serializable


/*  DATA CLASS USER: contiene los datos principales del usuario.
    - Id (constante) único generado automáticamente
    - email (constante) de registro
    - Preferencias de ajustes
    - Información básica
    - Información sobre salud y gustos
 */

@Serializable
data class User(
    var id: String, // se asigna un ID aleatorio, no se puede cambiar
    var email: String, // no se puede cambiar
    val rol: Rol = Rol.CLIENTE, // rol del usuario
    val joinDate: Long, // fecha de registro

    val basicInfo: UserBasicInfo,
    val userSettings: UserSettings = UserSettings(),

    val healthProfile: HealthProfile = HealthProfile(),
    val gastroPref: GastroPref = GastroPref(),
)