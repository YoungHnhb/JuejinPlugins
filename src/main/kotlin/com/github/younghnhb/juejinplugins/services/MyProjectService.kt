package com.github.younghnhb.juejinplugins.services

import com.intellij.openapi.project.Project
import com.github.younghnhb.juejinplugins.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
