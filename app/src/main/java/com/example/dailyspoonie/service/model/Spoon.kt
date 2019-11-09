package com.example.dailyspoonie.service.model

import io.realm.annotations.RealmClass
import java.util.*

@RealmClass
open class Spoon {
    var name: String = ""
    var point: Int = 0
    var date: Date = Date()
}