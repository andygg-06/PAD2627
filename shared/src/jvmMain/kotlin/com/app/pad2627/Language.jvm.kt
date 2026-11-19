package com.app.pad2627

import com.app.pad2627.model.AppLanguage
import java.util.Locale

actual fun applyLanguage(language: AppLanguage) {
    Locale.setDefault(Locale.forLanguageTag(language.tag()))
}