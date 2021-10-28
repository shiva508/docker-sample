// node {
// 		echo "Build"
// 		echo "Test"
// 		echo "INT Test"
// }
pipeline{
		agent any
		//agent { docker { image 'maven:3.6.3' } }
		environment{
			dockerHome= tool 'mydocker'
			mavenHome= tool 'mymaven'
			PATH="$dockerHome/bin:$mavenHome/bib:$PATH"
		}
		stages{
				stage('Checkout'){
						steps{
							sh "mvn --version"
							sh "docker version"
							echo "Build"
							echo "PATH - $PATH"
							echo "BUILD_NUMBER - $env.BUILD_NUMBER"
							echo "BUILD_ID - $env.BUILD_ID"
							echo "BUILD_TAG - $env.BUILD_TAG"
							echo "JOB_NAME- $env.JOB_NAME"
							echo "BUILD_URL - $env.BUILD_URL"
						}
				}
				stage('Compile'){
					steps{
						sh "mvn clean compile"
					}
				}
				stage('Test'){
						steps{
							sh "mvn test"
							echo "Test"
						}
				}
				stage('IntTest'){
						steps{
							echo "INT Test"
						}
				}
				stage('Build docker image'){
						steps{
							//"docker build -t dasari508201/docker-sample:tagname:$env.BUILD_ID"
							script{
								dockerImage=docker.build("dasari508201/docker-sample:tagname:${env.BUILD_TAG}")
							}
						}
				}
				stage('Push docker image'){
						steps{
							script{
								docker.withRegistry('','dockerhub'){
										dockerImage.push()
										dockerImage.push('latest')
								}
							}
						}
				}
			}
		post{
			always{
					echo 'I WILL ALWAYS KEEP EYE ON YOU'
			}
			success{
					echo 'I WILL ALWAYS RUN ON BUILD SUCCESS'
			}
			failure{
					echo 'I WILL ALWAYS RUN ON BUILD FAILURE'
			}
		}
}