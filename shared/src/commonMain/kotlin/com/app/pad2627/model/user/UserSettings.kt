package com.app.pad2627.model.user

import com.app.pad2627.model.enums.AppLanguage
import kotlinx.serialization.Serializable


/*  DATA CLASS USERSETTINGS: contiene la configuración de los ajustes
    - Tema de la app
    - Idioma de la aplicación
 */

@Serializable
data class UserSettings(
    val theme: AppTheme = AppTheme.LIGHT,
    val language: AppLanguage = AppLanguage.ES,
)