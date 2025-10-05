package com.example.lab_week_05.model

import com.squareup.moshi.Json

data class ImageData(
    @field:Json(name = "id") val id: String?,
    @field:Json(name = "url") val imageUrl: String?,
    @field:Json(name = "width") val width: Int?,
    @field:Json(name = "height") val height: Int?
)
