package com.app.pad2627.model

/* ENUM CLASS UserPreferences (Preferencias): contiene los enumerados de la clase Usuario
    - Rol
    - Tema de la interfaz: claro oscuro
    - Lenguaje de la aplicación: español, inglés
    - Tipo de dietas: vegetariano, vegano ...
    - Alergias (siguiendo la normativa europea)
    - Tipos de cocinas: italiana, japonesa ...
 */

// --- Tipo de roles ---
enum class Rol { CLIENTE, HOSTELERO, }

// --- Tema de la app ---
enum class AppTheme { CLARO, OSCURO, }

// --- Lenguaje de la app ---
enum class AppLanguage { ES, EN, } // español, ingles

// --- Tipo de dietas ---
enum class DietType {
    NONE,
    VEGETARIAN,
    VEGAN,
}

// --- Alergias: normativa Europea ---
enum class Allergies {
    // Normativa Europea de alergias
    GLUTEN, //gluten
    NUTS, // frutos de cáscara
    FISH, // pescado
    MILK, // leche y derivados
    SOYBEANS, // soja
    CRUSTACEANS, // crustáceos
    MOLLUSCS, // moluscos
    EGGS, // huevos
    PEANUTS, // cacahuetes
    CELERY, // apio
    MUSTARD, // mostaza
    SESAME, // sésamo
    LUPINS, // altramuces
    SULFUR, // sulfitos
}
// --- Rango de presupuesto ---
enum class BudgetRange(val symbol: String){
    ECONOMIC("$"),
    MEDIUM("$$"),
    PREMIUM("$$$"),
}

// --- Tipo de local ---
enum class LocalType {
    BAR,
    RESTAURANT,
    THEME_PARK,
    BAKERY,
    COCTEL_BAR,
}

// --- Tipos de cocinas ---
enum class CuisineType {
    // por zona geográfica
    JAPAN,
    ITALY,
    MEXICO,
    INDIA,
    CHINA,
    GREECE,
    AMERICA,
    KOREAN,
}