package com.minyul.cms.post.application.dto

import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.Size

data class PostCreateRequest (

    @field: NotEmpty
    @field: Size(min = 2, max = 8)
    var title: String? = null,

    @field: NotBlank
    var leadText: String? = null
)

