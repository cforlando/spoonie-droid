package com.example.dailyspoonie.service.model

import io.realm.annotations.RealmClass

@RealmClass
open class SpoonTemplate {
    var name: String = ""
    var point: Int = 0
}