def call(Map params) {
    def region = params.region ?: null
    def instance_type = params.instance_type ?: null


    if (region == null || instance_type == null){
        sh "error Error con la variable region"
    }else{
        sh "echo Region selecionada: $REGION"
        sh "echo Tipo de instancia selecionada: $INSTANCE_TYPE"
    }
}