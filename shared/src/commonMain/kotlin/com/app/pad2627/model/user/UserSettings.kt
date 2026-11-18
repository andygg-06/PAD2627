package com.app.pad2627.model.user

import com.app.pad2627.model.AppLanguage
import com.app.pad2627.model.AppTheme
import kotlinx.serialization.Serializable


/*  DATA CLASS USERSETTINGS: contiene la configuración de los ajustes
    - Tema de la app
    - Idioma de la aplicación
 */

@Serializable
data class UserSettings(
    val theme: AppTheme = AppTheme.CLARO,
    val language: AppLanguage = AppLanguage.ES,
)