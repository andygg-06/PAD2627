<div align="center">

# 🍽️ DishMatch

**Conoce gente a través de tus gustos gastronómicos.**

Organiza citas y quedadas para comer, recibe recomendaciones de platos adaptadas a tu dieta y reserva mesa, todo en una sola aplicación.

*Programación de Aplicaciones para Dispositivos Móviles · Facultad de Informática (UCM) · Curso 2026-2027*

</div>

---

## 📖 Sobre el proyecto

Organizar una comida con amigos o con gente nueva suele repartirse entre varias aplicaciones: elegir restaurante, consultar la carta, coordinar calendarios y decidir el lugar. Además, quienes tienen restricciones alimentarias (celiaquía, intolerancias, veganismo...) se sienten a menudo desatendidos.

**DishMatch** centraliza todo ese flujo:

| Para quién | Qué ofrece |
| --- | --- |
| 🧑‍🎓 **Usuarios** | Encontrar personas y planes afines, votar el sitio y el plato en grupo, filtrar la carta según su dieta y planificar en calendario. |
| 🏪 **Establecimientos** | Visibilidad entre público joven, reservas con control de aforo y carta digital (precios, fotos, alérgenos) en un panel sencillo. |

Pensada para estudiantes universitarios y adultos de **19 a 40 años**.

## ✨ Funcionalidades principales

- 🤝 **Social y descubrimiento:** emparejamiento por afinidad gastronómica, solicitudes de unión a planes abiertos y red de contactos.
- 💬 **Mesa redonda:** chat de grupo por plan con votación de local y plato, invitación por enlace o QR.
- 🥗 **Recomendación a nivel de plato:** locales cercanos con su carta y el plato ideal según tu perfil (alérgenos y restricciones).
- 🗺️ **Mapa y rutas:** locales y citas en mapa interactivo, rutas multiparada y sugerencias «Para ti».
- 📅 **Calendario:** agenda de planes con recordatorios.
- 📋 **Reservas:** por franja horaria y con control de aforo.
- 🤖 **Asistente contextual:** sugerencias basadas en agenda, ubicación y gustos.
- 🌍 **Multiidioma y tema claro/oscuro.**
- 🛠️ **Panel para establecimientos:** gestión de carta, horarios, aforo y reservas.

## 🧱 Tecnología

| Componente | Tecnología |
| --- | --- |
| Lenguaje | Kotlin 2.4.20 |
| Interfaz | Compose Multiplatform 1.12.1 |
| Compilación | Gradle 9.5.1 · Android Gradle Plugin 9.1.1 |
| Red | Ktor (cliente HTTP) · REST + WebSocket |
| Datos locales | SQLDelight o Room KMP *(por decidir)* |
| Backend | API propia · PostgreSQL + PostGIS *(previsto)* |
| Servicios externos | Mapas (Google Maps / Mapbox), notificaciones push (FCM), almacenamiento de imágenes, autenticación |

**Plataformas, por orden de prioridad:** 1. Android (mínimo API 24, Android 7.0) · 2. Escritorio · 3. Web.

## 🗂️ Estructura del proyecto

```
PAD-G6-2627/
├── docs/                  # Documento de diseño técnico, bocetos y logos
├── shared/                # Código compartido (UI + modelos)
│   └── src/
│       ├── commonMain/    # Lógica y pantallas comunes
│       │   └── kotlin/.../
│       │       ├── model/     # Entidades: usuario, local, social, sistema
│       │       ├── core/      # Tema, navegación, red, base de datos local
│       │       └── feature/   # usuarios · locales · social · sistema
│       ├── androidMain/   # GPS, cámara/QR, push, contactos
│       └── ...            # Código específico de escritorio y web
├── androidApp/            # Módulo de la app Android
└── server/                # Backend (próximamente)
```

Cada módulo de `feature/` sigue tres capas: `presentation` (pantallas y ViewModels), `domain` (casos de uso, motor de recomendación) y `data` (repositorios, API remota y base local).

## 🚀 Puesta en marcha

### Requisitos

- JDK 17 o superior
- Android Studio (versión reciente con soporte para Kotlin Multiplatform)
- Android SDK con API 24 o superior

### Ejecutar

```bash
# Clonar el repositorio
git clone https://github.com/andygg-06/PAD-G6-2627.git
cd PAD-G6-2627

# Compilar la app de Android (debug)
./gradlew :androidApp:assembleDebug
```

Después, abre el proyecto en Android Studio y ejecuta la configuración de Android en un emulador o dispositivo.

> ℹ️ Los nombres de los módulos y las tareas pueden variar según la plantilla de Kotlin Multiplatform del proyecto. Ajusta los comandos si es necesario.

## 🔒 Privacidad y seguridad

DishMatch trata datos sensibles (ubicación, alérgenos, objetivos nutricionales), por lo que se diseña con el RGPD en mente: consentimiento explícito, minimización de datos, derecho de acceso y borrado, y permisos pedidos solo cuando se necesitan. **Los datos de salud y alérgenos de los usuarios nunca se venderán a terceros.**

## 🛣️ Hoja de ruta

- [ ] Modelo de datos y módulos base
- [ ] Registro, perfil y preferencias
- [ ] Locales, cartas y recomendación por reglas
- [ ] Matching, planes, chat y votaciones
- [ ] Mapa, calendario y notificaciones
- [ ] Reservas y panel de establecimientos
- [ ] Versión iOS
- [ ] Recomendación con aprendizaje automático
- [ ] Pagos y división de cuenta

## 👥 Equipo

| Nombre |
| --- |
| Andrea Yu García Gómez |

## 📄 Documentación

El diseño completo (estudio de mercado, requisitos, arquitectura y modelo de datos) está en [`docs/`](docs/).

---

<div align="center">
Hecho con ❤️ y mucha hambre en la Facultad de Informática · UCM
</div>z