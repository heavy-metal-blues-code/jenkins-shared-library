@Library(value="jenkins-shared-library@master", changelog=false) _

node("controller") {
    stage('Main') {
        freeNodesAndExecutors().each { nodeName, numberExecutors ->
            println "Free node name: ${nodeName} and its number of executors: ${numberExecutors}"
        }
    }
}

