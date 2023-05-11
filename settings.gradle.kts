rootProject.name = "Juke.JDBC"

sourceControl {
    gitRepository(uri("https://github.com/sibkit/Juke.git")) {
        producesModule("com.github.sibkit:Juke")
    }
    gitRepository(uri("https://github.com/sibkit/SibUtils.git")) {
        producesModule("com.github.sibkit:SibUtils")
    }
}