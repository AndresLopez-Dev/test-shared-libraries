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
        sh "echo Region selecionada: $region"
        sh "echo Tipo de instancia selecionada: $instance_type"
        sh "echo $instance_name $instance_type"
        sh "pwd"
    }
    dir("./test-terraform_EC2-sg"){
        sh "ls"
        // sh "terraform init"
        // sh "terraform plan"
        sh "echo \"region=$region \naccess_key=$access_key \nsecret_key=$secret_key \nvpc_cidr=172.31.0.0/16 \ninstance_name=$instance_name \ninstance_type=$instance_type \nami_id=$ami_id \nenviroment=$enviroment \nowner=$owner\nteam=$team \nproject=$project\" > ejemplo-variables.txt"
        sh "cat ejemplo-variables.txt"
        sh "ls"
        sh "rm ejemplo-variables.txt"
    }
}