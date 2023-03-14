@Suppress("DSL_SCOPE_VIOLATION")
plugins{
    alias(libs.plugins.springframeworkboot) apply false
    alias(libs.plugins.dependencymanagement) apply false
}


subprojects{
    apply {
        plugin("idea")
        plugin("java")

    }
    // 配置项目信息
    group = "com.rbtxm"
    version = "1.0.0-SNAPSHOT"

    // utf-8编码
    tasks.withType<JavaCompile> {
        options.encoding = "UTF-8"
    }
    // jdk版本
    tasks.withType<JavaCompile> {
        sourceCompatibility = "17"
        targetCompatibility = "17"
    }
    // 测试
    tasks.withType<Test> {
        useJUnitPlatform()
    }


}
