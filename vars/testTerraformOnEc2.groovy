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
        sh "echo region=us-east-1 \n access_key=AKIAUK22GESK63OE3UDQ \n secret_key=xxx \n vpc_cidr=172.31.0.0/16 \n instance_name=nginx-server \n instance_type=t2.micro \n ami_id=ami-08a0d1e16fc3f61ea \n enviroment=test \n owner=David 3htp \n team=DevOps \n project=Aprendiendo terraform"
    }
}