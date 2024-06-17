def call(Map params) {
  pipeline {
        agent any

        stages {
            stage('variables') {
                steps {
                    script {
                        env.REGION = "${params.region}"
                        sh "echo Region selecionada: $REGION"
                        env.INSTANCE_TYPE = "${params.instance_type}"
                        sh "echo Tipo de instancia selecionada: $INSTANCE_TYPE"
                    }
                }
            }
        }
    }
}