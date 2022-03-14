docker -v
docker stop mtechtomcat
docker container prune -f
docker images
docker rmi -f demoapp:1.0
docker build -t demoapp:1.0 .