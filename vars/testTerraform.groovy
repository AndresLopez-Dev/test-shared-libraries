def call(Map params) {
  pipeline {
        agent any

        stages {
            stage('variables') {
                steps {
                    script {
                        env.REGION = "${params.region}"
                        if (env.REGION == null){
                            sh "echo error con la variable region"
                        }else{
                            sh "echo Region selecionada: $REGION"
                        }
                        env.INSTANCE_TYPE = "${params.instance_type}"
                        sh "echo Tipo de instancia selecionada: $INSTANCE_TYPE"
                    }
                }
            }
        }
    }
}