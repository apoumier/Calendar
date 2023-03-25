package com.simplemobiletools.calendar.pro

import androidx.multidex.MultiDexApplication
import com.simplemobiletools.calendar.pro.extensions.scheduleNextAutomaticBackup
import com.simplemobiletools.commons.extensions.checkUseEnglish

class App : MultiDexApplication() {
    override fun onCreate() {
        super.onCreate()
        checkUseEnglish()
        scheduleNextAutomaticBackup()
    }
}
