def call(Map params) {
  pipeline {
        agent any

        stages {
            stage('variables') {
                steps {
                    script {
                        env.REGION = "us-1"
                        sh "echo Hola $REGION"
                    }
                }
            }
        }
    }
}