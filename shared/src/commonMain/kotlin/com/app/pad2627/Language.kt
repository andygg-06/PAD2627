package com.app.pad2627

import com.app.pad2627.model.enums.AppLanguage

expect fun applyLanguage(language: AppLanguage)

fun AppLanguage.tag() = when (this) {
    AppLanguage.ES -> "es"
    AppLanguage.EN -> "en"
}