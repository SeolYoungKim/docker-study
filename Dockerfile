# 1. Docker의 base 이미지 설정(Java 11)
FROM openjdk:11

# 3. Working Directory 변경 (이미지, 컨테이너의 작업 디렉토리)
WORKDIR /app

# 2. 내 project file(jar)을 image에 복사
# COPY {컨테이너, 이미지의 외부 경로 - dockerfile 경로 기준으로 시작} {이미지, 컨테이너 내부 경로 - 자체 내부 파일시스템 존재}
COPY ./build/libs/docker-study-0.0.1-SNAPSHOT.jar /app


# RUN npm install : 이미지, 컨테이너의 WORKDIR 내에서 npm install을 수행
# RUN 명령어는 빌드될 때마다 수행된다.

# 이 컨테이너가 시작될 때 우리의 로컬 시스템에 특정 포트를 노출하고 싶음을 도커에 알림
# documentation의 역할일 뿐, 아무것도 하지 않는 상태 -> 아무것도 하지 않는 명령어지만, 문서화 입장에서 추가하는 것을 권장
EXPOSE 8080

# 4. 커맨드 입력 : 배열을 전달한다.
# 컨테이너 내부에 있는 java 명령어를 사용하여 실행함
CMD ["java", "-jar", "docker-study-0.0.1-SNAPSHOT.jar"]