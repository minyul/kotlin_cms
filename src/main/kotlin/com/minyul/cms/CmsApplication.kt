package com.minyul.cms

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CmsApplication

fun main(args: Array<String>) {
	runApplication<CmsApplication>(*args)
}
