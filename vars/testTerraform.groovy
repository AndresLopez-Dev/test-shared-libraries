def call(Map params) {
    stage('variables') {
        steps {
            script {
                env.REGION = "${params.region}"
                def region = params.region ?: env.REGION
                env.INSTANCE_TYPE = "${params.instance_type}"
                def instance_type = params.instance_type ?: env.INSTANCE_TYPE

                if (region == null || instance_type == null){
                    sh "error Error con la variable region"
                }else{
                    sh "echo Region selecionada: $REGION"
                    sh "echo Tipo de instancia selecionada: $INSTANCE_TYPE"
                }
            }
        }
    }
}