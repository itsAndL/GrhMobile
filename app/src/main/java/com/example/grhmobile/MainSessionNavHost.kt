package com.example.grhmobile;

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment;
import dev.hotwire.turbo.config.TurboPathConfiguration
import dev.hotwire.turbo.session.TurboSessionNavHostFragment
import kotlin.reflect.KClass

class MainSessionNavHost : TurboSessionNavHostFragment() {
    override val sessionName = "main"
    override val startLocation = "http://10.0.2.2:3000"

    override val registeredFragments: List<KClass<out Fragment>>
        get() = listOf(
            WebFragment::class
        )

    override val registeredActivities: List<KClass<out AppCompatActivity>>
        get() = listOf()

    override val pathConfigurationLocation: TurboPathConfiguration.Location
        get() = TurboPathConfiguration.Location(assetFilePath = "json/configuration.json")
}
