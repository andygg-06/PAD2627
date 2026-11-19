package com.app.pad2627

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.safeContentPadding

import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.key
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

import com.app.pad2627.model.AppLanguage
import com.app.pad2627.model.user.UserSettings

import org.jetbrains.compose.resources.stringResource

import pad2627.shared.generated.resources.Res
import pad2627.shared.generated.resources.nav_meet

@Composable
@Preview
fun App() {
    var settings by remember { mutableStateOf(UserSettings()) }

    key(settings.language) {
        applyLanguage(settings.language)
        MaterialTheme {
            Column(Modifier.safeContentPadding().fillMaxSize()) {
                Text(stringResource(Res.string.nav_meet))
                Button(onClick = {
                    val next = if (settings.language == AppLanguage.ES) AppLanguage.EN else AppLanguage.ES
                    settings = settings.copy(language = next)
                }) { Text("ES / EN") }
            }
        }
    }
}