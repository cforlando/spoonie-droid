package com.example.dailyspoonie.service.model

import io.realm.annotations.RealmClass
import java.util.*

@RealmClass
open class Report {
    var date: Date = Date()
    var spoonsUsed: Int = 0
    var spoonsAvailable: Int = 0
    var isOverLimit: Boolean = false
}