def call() {

  pipeline {

    stages {
      stage("build) 
      {
        println "Building"
      }

      stage("test")
      {
        println "Testing"
      }
    }
  }
}
