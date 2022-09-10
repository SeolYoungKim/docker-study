# 1. Docker의 base 이미지 설정(Java 11)
FROM openjdk:11
# 2. 내 project file(jar)을 image에 복사
COPY ./build/libs/docker-study-0.0.1-SNAPSHOT.jar /tmp
# 3. Working Directory 변경
WORKDIR /tmp
# 4. 커맨드 입력
CMD ["java", "-jar", "docker-study-0.0.1-SNAPSHOT.jar"]