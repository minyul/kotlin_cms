package com.minyul.cms.post.application

import org.springframework.stereotype.Service

@Service
class PostService {

    fun findPost(postId: String): String {

        return "get"
    }

    fun createPost(): String {

        return "create"
    }
}