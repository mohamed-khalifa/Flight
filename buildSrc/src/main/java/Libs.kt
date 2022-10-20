object Libs {
    // kotlin
    const val KOTLIN = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.KOTLIN}"

    // Android Jetpack (UI & navigation)
    const val LIFECYCLE_RUNTIME =
        "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.LIFECYCLE_RUNTIME}"
    const val COMPOSE_Activity = "androidx.activity:activity-compose:${Versions.COMPOSE_ACTIVITY}"
    const val COMPOSE_UI = "androidx.compose.ui:ui:${Versions.COMPOSE}"
    const val COMPOSE_UI_TOOLING_PREVIEW =
        "androidx.compose.ui:ui-tooling-preview:${Versions.COMPOSE}"
    const val COMPOSE_UI_MATERIAL = "androidx.compose.material:material:${Versions.COMPOSE}"
    const val COMPOSE_UI_TOOLING = "androidx.compose.ui:ui-tooling:${Versions.COMPOSE}"
    const val COMPOSE_NAVIGATION =
        "androidx.navigation:navigation-compose:${Versions.COMPOSE_NAVIGATION}"
    const val COMPOSE_KIWI_ICONS = "kiwi.orbit.compose:icons:${Versions.KIWI}"

    const val CORE_KTX = "androidx.core:core-ktx:${Versions.CORE_KTX}"


    //Network
    const val RETROFIT = "com.squareup.retrofit2:retrofit:${Versions.RETROFIT}"
    const val RETROFIT_GSON_CONVERTOR = "com.squareup.retrofit2:converter-gson:${Versions.RETROFIT}"

    // Coroutines
    const val COROUTINES = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.COROUTINES}"

    //DATABASE
    const val ROOM = "androidx.room:room-runtime:${Versions.ROOM}"
    const val ROOM_KTX = "androidx.room:room-ktx:${Versions.ROOM}"
    const val ROOM_COMPILER = "androidx.room:room-compiler:${Versions.ROOM}"

    //Dependency Injection
    const val HILT_ANDROID = "com.google.dagger:hilt-android:${Versions.HILT}"
    const val HILT_COMPILER = "com.google.dagger:hilt-android-compiler:${Versions.HILT}"
    const val COMPOSE_NAVIGATION_HILT =
        "androidx.hilt:hilt-navigation-compose:${Versions.COMPOSE_NAVIGATION_HILT}"

    // Testing
    const val JUNIT = "junit:junit:${Versions.JUNIT}"
    const val MOCKK = "io.mockk:mockk:${Versions.MOCKK}"
    const val COROUTINES_TEST =
        "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.COROUTINES}"
    const val ARCH_CORE_TESTING = "androidx.arch.core:core-testing:${Versions.ARCH_CORE_TESTING}"
    const val ANDROIDX_TEST = "androidx.test.ext:junit:${Versions.ANDROIDX_TEST}"

}

