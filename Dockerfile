FROM openjdk:11

WORKDIR /app

COPY ./build/libs/docker-study-0.0.1-SNAPSHOT.jar .

COPY . .

EXPOSE 80

# 컨테이너의 내부 경로 작성. -> 외부 폴더에 매핑되어질 컨테이너 내부 폴더! == 데이터가 유지될 위치
VOLUME ["/app/feedback"]

CMD ["java", "-jar", "docker-study-0.0.1-SNAPSHOT.jar"]