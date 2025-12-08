pipeline {

//jenkins içerisinde jdk ve maven i tanımladık. Bu sayede localdeki jdk ve maven a bakmayacak.
tools {
jdk 'JDK21'
maven 'Maven-3.9'
}

// stages sırayla jenkins in çalıştıracağı komutlar
stages{
// ilk adımda github dan projeyi çekip, master branch e checkout oluyor.
stage('Checkout') {
steps{
 git branch: 'master',
    url: 'https://github.com/MrAtas35/testng_project.git'
}

}
 // 2. adımda testleri çalıştırıyor
    stage('Run Test') {
steps{
 bat 'mvn clean test' // Windows için
}
    // Mac için - >  sh 'mvn clean test'



    // bu adımda ise raporu oluşturuyor
    }
    stage('Generate Allure Report') {
    // allure result ın oluştuğu klasörü tanımladık
    steps {
    allure([
         results:[[path: 'target/allure-results']]
    ])
    }
}
 }
}