package com.snuzj.marsphotos.network

import com.squareup.moshi.Json

class MarsPhoto (
    val id: String,
    @Json(name = "img_src") var imgSrcUrl: String
)