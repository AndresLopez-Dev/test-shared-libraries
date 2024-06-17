def call(Map params) {
    def region = params.region ?: null
    def access_key = params.access_key ?: null
    def secret_key = params.secret_key ?: null

    def instance_name = params.instance_name ?: null
    def instance_type = params.instance_type ?: null
    def ami_id = params.ami_id ?: null

    def enviroment = params.enviroment ?: null
    def owner = params.owner ?: null
    def team = params.team ?: null
    def project = params.project ?: null

    if (region == null || instance_type == null){
        sh "error Error con la variable region"
    }else{
        sh "echo Region selecionada: $REGION"
        sh "echo Tipo de instancia selecionada: $INSTANCE_TYPE"
        sh "echo $instance_name $instance_type"
    }
    dir("./test-terraform_EC2-sg"){
        sh "ls"
    }
}