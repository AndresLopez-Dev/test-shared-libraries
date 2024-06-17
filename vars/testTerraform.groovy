def call(Map params) {
  pipeline {
        agent any

        stages {
            stage('variables') {
                steps {
                    script {
                        env.REGION = "${params.region}"
                        def REGION = System.getenv("REGION")
                        env.INSTANCE_TYPE = "${params.instance_type}"
                        def INSTANCE_TYPE = System.getenv("INSTANCE_TYPE")

                        if (REGION == null && INSTANCE_TYPE == null){
                            sh "echo error con la variable region"
                        }else{
                            sh "echo Region selecionada: $REGION"
                            sh "echo Tipo de instancia selecionada: $INSTANCE_TYPE"
                        }
                    }
                }
            }
        }
    }
}