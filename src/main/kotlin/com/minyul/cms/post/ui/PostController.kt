package com.minyul.cms.post.ui

import com.minyul.cms.post.application.PostService
import com.minyul.cms.post.application.dto.PostCreateRequest
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class PostController(private val postService: PostService) {

    @GetMapping("/post/{postId}", produces = ["application/json"])
    fun findPost(@PathVariable postId: String): ResponseEntity<String> {

        return ResponseEntity.ok().body(postService.findPost(postId))
    }

    @PostMapping("/post")
    fun createPost(@RequestBody content: PostCreateRequest): ResponseEntity<String> {

        return ResponseEntity.ok().body(postService.createPost())
    }
}