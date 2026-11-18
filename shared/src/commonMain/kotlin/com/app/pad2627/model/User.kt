package com.app.pad2627.model

import kotlinx.serialization.Serializable

/* DATA CLASS User (Usuario): contiene las clases de datos relacionadas con Usuario
    - Estructura base
    - Información básica del usuario
    - Ajustes del perfil: tema, idioma
    - Datos de salud del usuario: dieta, alérgenos ...
    - Preferencias gastronómicas
 */

// --- Contiene los datos principales del usuario ---
@Serializable
data class User (
    var id: String, // se asigna un ID aleatorio, no se puede cambiar
    var email: String, // no se puede cambiar
    val rol: Rol = Rol.CLIENTE, // rol del usuario
    val joinDate: Long, // fecha de registro

    val basicInfo: UserBasicInfo,
    val userSettings: UserSettings = UserSettings(),

    val healthProfile: HealthProfile = HealthProfile(),
    val gastroPref: GastroPref = GastroPref(),
)

// --- Información básica del usuario ---
@Serializable
data class UserBasicInfo(
    val name: String,
    val surname: String,
    val userId: String,

    val birthDate: Long, // tipo fecha
    val age: Int, // se calcula automáticamente (investigar)

    val university: String? = null,

    val photoURL: String? = null,
    val bio: String = "", // máximo 100 caracteres
    val job: String? = null,
    val lifeStyle: String? = null,
    val ubi: Geolocation? = null,
)

// --- Ajuste del perfil ---
data class UserSettings(
    val theme: AppTheme = AppTheme.CLARO,
    val language: AppLanguage = AppLanguage.ES,
)

// --- Datos de salud del usuario ---
data class HealthProfile(
    val diet: DietType = DietType.NONE,
    val allergies: Set<Allergies> = emptySet<Allergies>()
)

// --- Preferencias gastronómicas ---
@Serializable
data class GastroPref(
    val budgetRange: BudgetRange = BudgetRange.ECONOMIC,
    val localType: LocalType = LocalType.BAR,
    val favCuisine: Set<CuisineType> = emptySet<CuisineType>()
)