def call(Map params) {
    pipeline {
        agent any

        stages {
            stage('test echo') {
                steps {
                    script {
                        sh "echo Hola mundo"
                    }
                }
            }
        }
    }
}